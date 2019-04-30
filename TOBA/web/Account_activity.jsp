<%-- 
    Document   : Account_activity.jsp
    Created on : Apr 17, 2019, 11:36:40 PM
    Author     : lawrencewilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.jsp"/>
        
<main> 
    <h1>Account Activity</h1>
    <c:choose>
        <c:when test="${user != null}">
            <p>Hi, ${user.firstName} ${user.lastName}!</p>
            <p>Please click <a href="add_funds.jsp">Here</a> to add funds to your account.
        </c:when>
        <c:otherwise>
        <p>You are now logged into your online account!</p>
        </c:otherwise>        
    </c:choose>
</main>
<c:import url="/footer.jsp"/>
