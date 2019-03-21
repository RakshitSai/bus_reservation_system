import java.sql.*;
import java.util.*;
class Reservations
{
	public static void main(String args[])throws Exception
	{
		String driverclass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="cseb14_46";
		String pass="cseb14_46";
		Class.forName(driverclass);
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
                                 ResultSet rs=st.executeQuery("select *from reservations");
                                  while(rs.next())
                               {
                                  System.out.println(rs.getInt(1)+" "+ rs.getInt(2)+" "+ rs.getString(3) +" "+ rs.getString(4) +" "+ rs.getString(5));
                               }
	rs.close();
	st.close();
con.close();	
	}//main
}//class




