
<%@page contentType="text/html"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
            String user=request.getParameter("uname");
            String pass=request.getParameter("psw");
            String url="jdbc:mysql://localhost:3306/yollo";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="select * from userdetail";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            
      String username=rs.getString("name");
      String passs=rs.getString("password");
      if(pass.equals(passs))
      {
          if(username.equals(user))
          {
         out.println("login successfull");
          
          }
         break;
      }
      else
      {
        out.println("please try again with valid credentials");  
            }
         }
        %>
        <br>
        <br>
        <p><a href="newindexpage.html">click to go to the home page</a></p>
       <a href="register.html" style="text-decoration:none; margin-top:26px;">SIGN UP FOR AN ACCOUNT</a>
    </body>
</html>