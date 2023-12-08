package fuel;

import java.sql.*;

public class Fuel {
	
	public void adder() {
		System.out.println("starting");

        String host = "localhost";
        String instance = "DESKTOP-H0GHTEU";
        String database = "jdbc";
        try{
        String uname = "sa";
        String pas = "root";
        String url = "jdbc:sqlserver://"+host+":1433;"+"instance="+instance+":databaseName="+database+";encrypt=true;trustServerCertificate=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//        String url = "jdbc:sqlserver://localhost:1433;instance=DESKTOP-H0GHTEU:databaseName=jdbc;encrypt=true;trustServerCertificate=true";
                        System.out.println("2");
        Connection con = DriverManager.getConnection(url, uname, pas);

        Statement st = con.createStatement();
        st.executeUpdate("insert into jdbc.dbo.table1 values(405, 12)");
        System.out.println("Connected to db with Eclipse");
        }catch(Exception e){
            System.out.println(e);
        }
	}
	
	public void updateFilledIn(String vReg, int licenseNo, int amount) {
		System.out.println("starting");

        String host = "localhost";
        String instance = "DESKTOP-H0GHTEU";
        String database = "jdbc";
        try{
        String uname = "sa";
        String pas = "root";
        String url = "jdbc:sqlserver://"+host+":1433;"+"instance="+instance+":databaseName="+database+";encrypt=true;trustServerCertificate=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//        String url = "jdbc:sqlserver://localhost:1433;instance=DESKTOP-H0GHTEU:databaseName=jdbc;encrypt=true;trustServerCertificate=true";
//                        System.out.println("2");
        Connection con = DriverManager.getConnection(url, uname, pas);

        Statement st = con.createStatement();
//        st.executeUpdate("insert into jdbc.dbo.table1 values(405, 12)");
        vReg = "123456";
        licenseNo= 1;
        amount = 1;
        
        st.executeUpdate("insert into fuel.dbo.FilledIn(vRegNo, licenseNo, amoutn, filledDate) values('"+vReg+"',"+licenseNo+", GETDATE())");
        
        System.out.println("Inserted to FilledIn table");
        }catch(Exception e){
            System.out.println(e);
        }
	}

	public static void main(String args[])  throws ClassNotFoundException, SQLException  {
		
//		Fuel f = new Fuel();
//		f.adder();
		
	}
}
