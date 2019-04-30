<%-- 
    Document   : password_reset
    Created on : Apr 17, 2019, 8:45:55 PM
    Author     : lawrencewilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.jsp"/>
    <main>
        <h3>Password Reset</h3>
        <p>Hello, ${user.userName}. Please enter a new password.</p>
            <form action="passwordReset" method="post">
                <input type="hidden" name="currentPassword" value="${user.currentPassword}"><br>
                <label>New Password:</label><br>
                <input type="text" name="newPassword" required><br>
                <input type="submit" value="Change Password">
            </form>
    </main>
<c:import url="/footer.jsp"/>
