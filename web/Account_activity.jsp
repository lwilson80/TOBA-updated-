<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.jsp"/>
        <main>
            <h3>Account Activity</h3>
            <c:choose>
            <c:when test="${user != null}">
                <p>Hello, ${user.firstName} ${user.lastName}!</p>
                <p>Please Select an Option Below:</p>
                <ul>
                    <li><a href="/Add_Funds.jsp">Add Funds</a></li>
                </ul>
            </c:when>
            <c:otherwise>
                <p>You are not Logged In! Please go back and use the Login Page!</p>
            </c:otherwise>
            </c:choose>
        </main>
<c:import url="includes/footer.jsp"/>