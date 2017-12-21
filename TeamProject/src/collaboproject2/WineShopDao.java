package collaboproject2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;





public class WineShopDao {
	//wineshopTBL 접속, 채헤, 삽입, 삭제, 조회, 수정 작업 담당
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/javadb?useSSL=false";
			return DriverManager.getConnection(url,"root", "12345");
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public void dbClose(Connection con, PreparedStatement psmt, ResultSet rs) {
		try {
			if(rs!=null)
				rs.close();
			if(psmt!=null)
				psmt.close();
			if(con!=null)
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void dbClose(Connection con, PreparedStatement psmt) {
		try {
		
			if(psmt!=null)
				psmt.close();
			if(con!=null)
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//전체 리스트 조회
	public Vector<WineShopVO> getList() {
		Connection con=getConnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String sql="select * from wineshoptbl";
		Vector<WineShopVO> vec=new Vector<>();
		try {
			psmt=con.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) { //while문이 제대로 안 돼서 오류났었음
			String id=rs.getString(1);
			String pw=rs.getString(2);
			int age=rs.getInt(3);
			WineShopVO vo=new WineShopVO(id, pw, age);
			vec.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vec;
	}
	//특정 레코드 조회
	public WineShopVO getRow(String id) {
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		WineShopVO vo=null;
		try {
			con=getConnection();
			String sql="select * from wineshoptbl where id=?";
			psmt=con.prepareStatement(sql);
			psmt.setString(1, id); //no는 primary key라 하나만 존재하므로
			rs=psmt.executeQuery(); //while돌릴 필요 없음
			while(rs.next()) {	
				int idx=rs.getInt(1);
				String id1=rs.getString(2);
				String pw=rs.getString(3);
				int age=rs.getInt(4);
				vo=new WineShopVO(idx, id1, pw, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vo;
	}
	
	public int userDelete(int no) {
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="delete from wineshoptbl where idx=?";
		int result=0;
		try {
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, no);
			result=psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt);
		}
		return result;
	}
	public int userUpdate(int idx, int age) {
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="update wineshoptbl set age=? where idx=?";
		int result=0;
		try {
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, age);
			psmt.setInt(2, idx);
			result=psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt);
		}
		return result;
	}


	public int userInsert(String id, String pw, int age) { //vo에 담아서 넘기는 차이
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="insert into wineshoptbl(id,pw,age) values(?,?,?)";
		int result=0;
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, age);
			result=psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt);
		}
		return result;
	}

}
