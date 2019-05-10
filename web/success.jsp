<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="includes/header.jsp"/>
        <main>
            <h3>Congratulations!</h3>
            <p>${user.firstName}</p>
            <p>Your online account with Titan Bank was created.</p>
            <p>Your temporary password is <strong>${user.password}</strong>, 
                please update upon your next login.</p>
              
            
            <p>Here's brief overview of your account information:</p>
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
            <span>${user.zipcode}</span><br>
        </main>
<c:import url="includes/footer.jsp"/>