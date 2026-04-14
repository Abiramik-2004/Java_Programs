package reentry;
import java.util.*;
interface DataBase{
	public void connect();
	public void disconnect();
}
class OracleDB implements DataBase{
	public void connect() {
		System.out.println("Connecting to OrcaleDB.....");
	}
	public void disconnect() {
		System.out.println("disConnecting to OracleDB.....");
	}
}
class MySQLDB implements DataBase{
	public void connect() {
		System.out.println("Connecting to MySQLDB.....");
	}
	public void disconnect() {
		System.out.println("disConnecting to MySQLDB.....");
	}
}
public class DBConnection  {
	public static void main(String[] args) throws Exception{
		DataBase d=new OracleDB();
		DataBase b=new MySQLDB();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the connection option(1-Oracle/2-Mysql: ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			d.connect();
			Thread.sleep(2000);
			d.disconnect();
			break;
		case 2:
			b.connect();
			Thread.sleep(2000);
			b.disconnect();
			break;
		default:
			System.out.println("enter the valid option");
		}
		
	}
}
