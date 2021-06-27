package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program { // 기본적으로 데이터베이스와 연결해서 실행하는 코드

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "SELECT * FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"SUNNY","1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String title = rs.getString("TITLE"); // 컬럼명 대문자,소문자 구분 X
			System.out.println(title);
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
