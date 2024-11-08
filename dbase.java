import java.sql.*;
class dbase
  {
    public static void main(String ar[])
      {
        try
          {
            String tb=ar[0];     
       
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:CTN");
            Statement s=con.createStatement();
            
            ResultSet r=s.executeQuery(" select * from " + tb);
             while(r.next())
               {
                  System.out.println(r.getString(1));
                  System.out.println(r.getString(2));
                  System.out.println(r.getString(3));
               }
           }
          catch(Exception e)
            {
              System.out.println(e); 
            }
       }
 }