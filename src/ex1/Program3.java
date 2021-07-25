package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program3 { // 데이터 수정

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String title = "TEST3";
		String content = "hahahaha!!";
		String files = "";
		int id = 13;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "UPDATE NOTICE " + 
				"SET" + 
				"    TITLE=?," + 
				"    CONTENT=?," + 
				"    FILES=?" + 
				"WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"SUNNY","1234");
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql); // 미리 시퀄문을 준비해서 값을 채워넣고 나중에 실행만 하는 preparedstatement
		st.setString(1, title);
		st.setString(2, content);
		st.setString(3, files);
		st.setInt(4, id);
		
		int result = st.executeUpdate();
		
		System.out.println(result);
		
		st.close();
		con.close();

	}

}
