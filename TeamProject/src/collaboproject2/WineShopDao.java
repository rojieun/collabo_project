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
			//숫자는 몇번째 칼럼인지
			String id=rs.getString(2);
			//String pw=rs.getString(3);
			//int age=rs.getInt(4);
			String purwine=rs.getString(5);
			int purmoney=rs.getInt(6); 
			String paytype=rs.getString(7);
			WineShopVO vo=new WineShopVO(id, purwine, purmoney, paytype);
			vec.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vec;
	}
	//특정 레코드 조회 -로그인용
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
				String id1=rs.getString(2);
				String pw=rs.getString(3);
				int age=rs.getInt(4);
				//String purwine=rs.getString(5);
				//int purmoney=rs.getInt(6); 
				//String paytype=rs.getString(7);
				vo=new WineShopVO(id1, pw, age);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vo;
	}
	//id 조회로 구매와인, 구매액, 결제타입 조회
//	public WineShopVO getUser(String id) {
//		Connection con=null;
//		PreparedStatement psmt=null;
//		ResultSet rs=null;
//		WineShopVO vo=null;
//		try {
//			con=getConnection();
//			String sql="select * from wineshoptbl where id=?";
//			psmt=con.prepareStatement(sql);
//			psmt.setString(1, id); //no는 primary key라 하나만 존재하므로
//			rs=psmt.executeQuery(); //while돌릴 필요 없음
//			while(rs.next()) {	
//				String id1=rs.getString(2);
//				//String pw=rs.getString(3);
//				//int age=rs.getInt(4);
//				String purwine=rs.getString(5);
//				int purmoney=rs.getInt(6); 
//				String paytype=rs.getString(7);
//				vo=new WineShopVO(id1, purwine, purmoney, paytype);
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			dbClose(con, psmt, rs);
//		}
//		return vo;
//	}
	public Vector<WineShopVO> getUser(String id) {
		Connection con=getConnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String sql="select * from wineshoptbl where id=?";
		Vector<WineShopVO> vec=new Vector<>();
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, id);
			rs=psmt.executeQuery();
			while(rs.next()) { //while문이 제대로 안 돼서 오류났었음
			//숫자는 몇번째 칼럼인지
			String id1=rs.getString(2);
			//String pw=rs.getString(3);
			//int age=rs.getInt(4);
			String purwine=rs.getString(5);
			int purmoney=rs.getInt(6); 
			String paytype=rs.getString(7);
			WineShopVO vo=new WineShopVO(id1, purwine, purmoney, paytype);
			vec.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vec;
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

	//로그인 시 아이디가 생성되는 것
	public int userInsert(String id, String pw, int age) { //vo에 담아서 넘기는 차이
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="insert into wineshoptbl(id,pw,age) values(?,?,?)";
		int result=0;
		try {
//			String purwine=null;
//			int purmoney=0;
//			String paytype=null;
			psmt=con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, age);
//			psmt.setString(4, purwine);
//			psmt.setInt(5, purmoney);
//			psmt.setString(6, paytype);
			result=psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt);
		}
		return result;
	}

}
