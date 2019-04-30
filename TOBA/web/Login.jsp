<%-- 
    Document   : Login.jsp
    Created on : Apr 17, 2019, 11:37:41 PM
    Author     : lawrencewilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.jsp"/>
        
<main> 

     <h1>Please log into your account. </h1>
        <form action="login" method="post">
            <input type="hidden" name="login" value="add">        
            <label class="pad_top">Username:</label>
            <input type="text" name="username" required><br>
            <label class="pad_top">Password:</label>
            <input type="password" name="password" required><br>
            <label>&nbsp;</label>
            <input type="submit" value="Login" class="margin_left">
            <label><a href ="/password_reset.jsp">Reset Password</a></label>
        </form>
        <p>New to the online banking system? Click <a href="/New_customer.jsp">here</a> to register!!</p>
</main>
<c:import url="/footer.jsp"/>
