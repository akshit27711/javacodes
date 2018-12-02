
<%@page contentType="text/html"%>
<%@page import="java.util.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert page in test1</title>
    </head>
    <body>
        <% 
            String name=request.getParameter("Name");
            String email=request.getParameter("Email");
          
           
            String password=request.getParameter("Password");
            String  mnumber=request.getParameter("phone");
           
            String url="jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="insert into swiggy values('"+name+"','"+email+"','"+password+"',"+mnumber+")";
            out.println(query);
            Statement st=conn.createStatement();
            int q=st.executeUpdate(query);
            if(q>0)
            {
                out.println("row inserted");
            }
            else
            {
               out.println("row has not been inserted");
            }
            st.close();
        %>
         <p><a href="newindexpage.html">click to go to the home page</a></p>
      
    </body>
</html>