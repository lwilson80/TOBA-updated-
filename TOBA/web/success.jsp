<%-- 
    Document   : success
    Created on : Apr 28, 2019, 5:28:40 PM
    Author     : lawrencewilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.jsp"/>
        <main>
            <h3>Congratulations!!!</h3>
            <p>${user.firstName}!</p>
            <p>Your online backing account is now created.</p>
            <p>For future logins, please use the username as shown below. Not to mention, 
            please update your password, the next time you login as the one provided is temporary.</p>
            <p>Username :${user.userName}</br>
               Password:${user.password} </br></p>
            
            <p>Overview of your account information:</p>
             <label>Email:</label>
            <span>${user.email}</span><br>
            <label>First Name:</label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Phone:</label>
            <span>${user.phone}</span><br>
            <label>Address:</label>
            <span>${user.address}</span><br>
            <label>City:</label>
            <span>${user.city}</span><br>
            <label>State:</label>
            <span>${user.state}</span><br>
            <label>Zip Code:</label>
            <span>${user.zip}</span><br>
        </main>
<c:import url="/footer.jsp"/>
