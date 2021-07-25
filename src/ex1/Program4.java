package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program4 { // 데이터 삭제

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id = 13;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "DELETE NOTICE WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"SUNNY","1234");
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql); // 미리 시퀄문을 준비해서 값을 채워넣고 나중에 실행만 하는 preparedstatement
		st.setInt(1, id);
		
		int result = st.executeUpdate();
		
		System.out.println(result);
		
		st.close();
		con.close();

	}

}
