<%-- 
    Document   : member
    Created on : Jan 24, 2021, 1:00:48 AM
    Author     : student
--%>

<%@page import= "java.text.SimpleDateFormat"%>
<%@page import= "java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import= "ryerson.ca.lab3.Helper.BookInfo"%>
<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Book</title>
    </head>
    <style>

body {
  background-color: #2ECC71;

}
</style>
<% 
    ArrayList<BookInfo> books= (ArrayList)request.getAttribute("booksBorrowedInfo");
  
%>

<center><h2><br>Welcome back,  <%=session.getAttribute("uname")%></h2></center>
<br>
<center><h4> You are currently a Member!</h4></center>
<center><h3> Available books: </h3></center>
<br>
<form action="Buy" method="post">
<table border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
   
<th> Name </th>
<th> Author </th>
<th> Buy </th>
</tr>

    <% for(BookInfo book: books){
    %>
<tr>
<td> <%=book.getBookName()%> </td>
<td> <%=book.getBookAuthor()%></td>
<% if (book.isAvailable()){
%>
<td> <input type="submit" value="Buy" ></td>
<% }

else {
%>


<td> Book Sold</td>
<% }}
%>
</tr>
</table>
</form>
</body>
</html>