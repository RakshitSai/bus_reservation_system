import java.sql.*;
import java.util.*;
class Passengeri
{
	public static void main(String args[])
	{
		String url="jdbc:oracle:thin:192.168.23.144:1521:orcl";
		String user="cseb14_46";
		String pass="cseb14_46";
		Scanner k= new Scanner(System.in);
		System.out.println("enter pid");
		int pid= k.nextInt();
		System.out.println("enter pname");
		String pname= k.next();
		System.out.println("enter email");
		String email= k.next();
		System.out.println("enter phoneno");
		String phoneno= k.next();
		String sql= "insert into passenger values("+pid+",' "+pname+" ',' "+email+" ',' "+phoneno+" ')";
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