
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
  background-color: #2E856E;

}
</style>
<% 
    ArrayList<BookInfo> books= (ArrayList)request.getAttribute("booksBorrowedInfo");
  
%>

<center><h2>Welcome Back Administrator! </h2></center>
<br>
<center><h3> Currently the Database contains:</h3></center>
<br>
<form action="Add" method="post">  
<table border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
   
<th> Book Name </th>
<th> Author </th>
<th> Action </th>

</tr>

    <% for(BookInfo book: books){
    %>
<tr>
<td> <%=book.getBookName()%> </td>
<td> <%=book.getBookAuthor()%></td>

<% if (book.isAvailable()){
%>
<td> <input type="submit" value="Add" ></td>
<%}

else {
%>
<td> <input type="submit" value="Add" ></td>
<% }
}
%>
</tr>
</table>

<br></br>
<table border="2" align="center" cellpadding="5" cellspacing="5">
    <tr>
        
    <th> Member First Name </th>
    <th> Member Last Name </th>    
    <th> Username </th>
    <th> Action </th>
    
    <tr>
     <td> Jerry </td>
     <td> Legare </td>
     <td> SpringerOfTheJerry </td>
     <td> <input type="submit" value="Add" ></td>
    </tr>
     
    <tr>    
     <td> Darren </td>
     <td> Bills </td>
     <td> LeBronJames </td>
     <td> <input type="submit" value="Add" ></td>
    </tr>
    
    <tr>
     <td> DeMarcus </td>
     <td> Cousins </td>
     <td> RunescapeScammer </td>
     <td> <input type="submit" value="Add" ></td>
    </tr>
   
</table>
</form>
</body>
</html>

