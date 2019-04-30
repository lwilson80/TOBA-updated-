<%-- 
    Document   : New_customer
    Created on : Apr 2, 2019, 6:28:35 PM
    Author     : lawrencewilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.jsp"/>
        <main>
        <p>Please complete the form in its entirety to create your new account!</p>
        <form action="NewCustomerServlet" method="post">
            <input type ="hidden" name="action" value="add">
            <label class="pad_top">First Name:</label>
            <input type="text" name="firstName" required><br>
            <label class="pad_top">Last Name:</label>
            <input type="text" name="lastName" required><br>
            <label class="pad_top">Phone:</label>
            <input type="tel" name="phone" required><br>
            <label class="pad_top">Address:</label>
            <input type="text" name="address" required><br>
            <label class="pad_top">City:</label>
            <input type="text" name="city" required><br>
            <label class="pad_top">State:</label>
            <input type="text" name="state" required><br>
            <label class="pad_top">Zip Code:</label>
            <input type="number" name="zip" required><br>
            <label class="pad_top">Email Address:</label>
            <input type="email" name="email" required><br>
            <input type="submit" value ="Submit">
        </form>
 </main>
<c:import url="/footer.jsp"/>
