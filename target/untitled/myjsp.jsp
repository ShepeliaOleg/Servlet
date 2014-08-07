<%@ page import="firstServer.IPAuthFilter" %>
<%@ page import="firstServer.Student" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.mail.Session" %>
<%--
  Created by IntelliJ IDEA.
  User: New
  Date: 27.07.14
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%! List <String> students = new ArrayList<String>(); %>

<%! public void print () throws Exception {

    PrintWriter writer = null;
    try {

        BufferedReader in = new BufferedReader(new FileReader("E:\\ProjectJava\\TwoCourse\\src\\main\\webapp\\st.txt"));
        String str = null;
        while ((str = in.readLine()) != null)
        {

            writer.println(in.readLine());


        }
    } catch (IOException e) {
    }

}%>


<html>
<head>
    <title></title>
</head>
<body>
<%print();%>
<br/>
<%java.text.DateFormat df =
        new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
<h1>Current Date: <%= df.format(new java.util.Date()) %>
</h1>
<br/>


<br/>
<%! Student studentForm = new Student();%>

<form  method="" action="myjsp.jsp">
    <input type="name" name="student">
    <input type="submit" value="Add">
</form>
<% if (request.getParameter("student")!= null){%>
<%students.add(request.getParameter("student"));}%>

<ul>
<% for (int i =0; i < students.size(); i++){%>
<li><% out.println(students.get(i));}%></li>
</ul>
<br/>

 </body>
</html>
