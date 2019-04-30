<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.jsp"/>
        <main>
            <h3>Add Funds</h3>
            <c:choose>
            <c:when test="${user != null}">
                <p>${user.userName}.</p>
                <p>Indicate the dollar amount you're depositing:</p>
                <form action="credit" method="post">
                    <input type="double" name="amount" required/>
                    <input type="submit" value="Deposit">
                </form>
            </c:when>
            <c:otherwise>
                <p>You are not Logged In! Please go back and use the Login Page!</p>
            </c:otherwise>
            </c:choose>
        </main>
<c:import url="includes/footer.jsp"/>