package collaboproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class WineDAO {

	
	//wineTBL 접속, 채헤, 삽입, 삭제, 조회, 수정 작업 담당
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
	//name, price company 관리자 제품 관리 모드에서 전체조회 할 때 쓸 것
	
	public Vector<WineVO> getList() {
		Vector<WineVO> vec=new Vector<>();
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String sql="select * from winetbl";
	
		try {
			con=getConnection();
			psmt=con.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) { //while문이 제대로 안 돼서 오류났었음
				WineVO vo=new WineVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				//String country=rs.getString(3);
				//String type=rs.getString(4);
				//int sweet=rs.getInt(5);
				//int body=rs.getInt(6);
				vo.setPrice(rs.getInt(7));
				vo.setCompany(rs.getString(8));
				//int vintage=rs.getInt(9);
				//String food=rs.getString(10);
				
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
	//name, price company 관리자 제품 관리 모드에서 이름으로 검색할 때 쓸 것
	//와인 타입(레드, 화이트) 따라 조회
//	public WineVO getRow(String type) {
//		Connection con=null;
//		PreparedStatement psmt=null;
//		ResultSet rs=null;
//		WineVO vo=null;
//		try {
//			con=getConnection();
//			String sql="select * from winetbl where type=?";
//			psmt=con.prepareStatement(sql);
//			psmt.setString(1, type); //no는 primary key라 하나만 존재하므로
//			rs=psmt.executeQuery(); //while돌릴 필요 없음
//			while(rs.next()) {	
//				int no=rs.getInt(1);
//				String name1=rs.getString(2);
//				//String country=rs.getString(3);
//				//String type=rs.getString(4);
//				//int sweet=rs.getInt(5);
//				//int body=rs.getInt(6);
//				int price=rs.getInt(7);
//				String company=rs.getString(8);
//				//int vintage=rs.getInt(9);
//				//String food=rs.getString(10);
//				
//				vo=new WineVO(no, name1, price, company);
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			dbClose(con, psmt, rs);
//		}
//		return vo;
//	}
	//와인 레드, 화이트 등 타입에 따라 조회
	public Vector<WineVO> getType(String type) {
		Vector<WineVO> vec=new Vector<>();
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String sql="select * from winetbl where type=?";
	
		try {
			con=getConnection();
			psmt=con.prepareStatement(sql);
			psmt.setString(1, type);
			rs=psmt.executeQuery();
			while(rs.next()) { //while문이 제대로 안 돼서 오류났었음
				WineVO vo=new WineVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				//String country=rs.getString(3);
				//String type=rs.getString(4);
				//int sweet=rs.getInt(5);
				//int body=rs.getInt(6);
				vo.setPrice(rs.getInt(7));
				vo.setCompany(rs.getString(8));
				//int vintage=rs.getInt(9);
				//String food=rs.getString(10);
				
				vec.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt, rs);
		}
		return vec;
	}
	
	public int wineDelete(int no) {
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="delete from winetbl where no=?";
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
	public int wineUpdate(int no, int price) {
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="update winetbl set price=? where no=?";
		int result=0;
		try {
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, price);
			psmt.setInt(2, no);
			result=psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con, psmt);
		}
		return result;
	}

	//관리자가 와인 추가하는것...할지 말지는 나중에. 
	/*public int userInsert(String id, String pw, int age) { //vo에 담아서 넘기는 차이
		PreparedStatement psmt=null;
		Connection con=getConnection();
		String sql="insert into winetbl(id,pw,age) values(?,?,?)";
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
	} */
}
