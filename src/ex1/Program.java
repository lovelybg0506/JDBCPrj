package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program { // 기본적으로 데이터베이스와 연결해서 실행하는 코드

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "SELECT * FROM NOTICE WHERE HIT > 10";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"SUNNY","1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql); // select문 = Query
		
		/*
		 * if(rs.next()) { 
		 * String title = rs.getString("TITLE"); // 컬럼명 대문자,소문자 구분 X
		 * System.out.println(title); 
		 * }
		 */
		
		while(rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String writerId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("hit");
			
			System.out.printf(" id:%d, title:%s, writerId:%s, regDate:%s, content:%s, hit:%d\n",id,title,writerId,regDate,content,hit);
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
