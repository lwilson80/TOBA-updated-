<%-- 
    Document   : footer
    Created on : Apr 17, 2019, 9:33:19 PM
    Author     : lawrencewilson
--%>
    <footer>
            <p><a href="/index.html">Home</a></p><br>
            <%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
            <%
                GregorianCalendar currentDate = new GregorianCalendar();
                int currentYear =  currentDate.get(Calendar.YEAR);
            %>
            <p>&copy; Copyright <%= currentYear %> Titan Online Bank
        </footer>
 