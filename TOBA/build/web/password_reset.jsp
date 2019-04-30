<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.jsp"/>
    <main>
        <h3>Password Reset</h3>
        <p>${user.userName}. Please create a new password.</p>
            <form action="passwordReset" method="post">
                <input type="hidden" name="currentPassword" value="${user.password}"><br>
                <label>New Password:</label><br>
                <input type="text" name="newPassword" required><br>
                <input type="submit" value="Reset Password">
            </form>
    </main>
<c:import url="includes/footer.jsp"/>
