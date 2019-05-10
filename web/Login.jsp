<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.jsp"/>
        <main>
            <h3>Login</h3>
            <p>If you are already a registered user, please login below. However, if you are new 
                customer, please use our sign up form by clicking <a href="/New_customer.jsp">here</a></p>
            
            <form action="login" method="post">
                <label>Username:</label><br>
                <input type="text" name="userName" required><br>
                <label>Password:</label><br>
                <input type="password" name="passWord" required><br>
                <input type="submit" value="Login">
            </form>
            <p><a href="/password_reset.jsp">Reset Password</a></p>
        </main>
<c:import url="includes/footer.jsp"/>
