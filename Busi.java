import java.sql.*;
import java.util.*;
class Busi
{
	public static void main(String args[])
	{
		String url="jdbc:oracle:thin:192.168.23.144:1521:orcl";
		String user="cseb14_46";
		String pass="cseb14_46";
		Scanner k= new Scanner(System.in);
		System.out.println("enter bid");
		int bid= k.nextInt();
		System.out.println("enter bname");
		String pname= k.next();
		System.out.println("enter type");
		String type= k.next();
		String sql= "insert into bus values("+bid+",' "+bname+" ',' "+type+" ')";
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			int m= st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully: "+sql);
			else
				System.out.println("inserted failed ");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}