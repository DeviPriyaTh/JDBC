import java.sql.*;
import java.lang.*;

/* 1. import packages  ---> java.sql

2. load and register driver  ---> com.mysql.jdbc.Driver //class.forName() --> Used to load class

3. Create Connection    ---> Connection

4. Create a statement  ----> Statement

5. Execute the query

6. Process the results

7. close */
         class democlass {
            public static void main(String[] args) throws Exception {
                String url = "jdbc:mysql://localhost:3306/devi";
                String uname = "root";
                String  pass = "DeviPriya@22022003";
                String query = "select name from student where stu_id = 2";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,uname,pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                rs.next();
                String name = rs.getString("name");

                System.out.println(name);

                st.close();
                con.close();
            }
        }
