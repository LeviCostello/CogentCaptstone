import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;

public class CountingTest {
//a JDBC app to insert "n" count no. of students details to Database table
//=> Here insert SQL query should be executed for "n" times to insert "n" student details

	static public void main(String[] args) {
//		int n = 0, count = 0;
//		String query = null;
//		Scanner scan = null;
//		Statement st = null;
//		Connection con = null;
//		try {
//			//variables
//			scan = Scanner(System.in);
//			System.out.println("Enter a number:");
//			n=scan.nextInt();
//			
//			//connection
//			//Class.forName("com.mysql.cj.jdbc.Driver");
//			con.DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud","root","root");
//			System.out.println(con.getClass().getName());
//			
//			if(con!=null) {
//				st = con.createStatement();
//			}
//			query = "INSERT INTO productcrud.student VALUES("+sno+","+name+","+addrs+","+avg+")";
//			System.out.println(query);
//			
//			if(st!=null)
//				count = st.executeUpdate(query);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		System.out.println("Hello World");

	}

}
