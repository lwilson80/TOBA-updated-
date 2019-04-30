<html>
    <body>
            <footer>
            <p><a href="/index.jsp">Home</a></p><br>
            <%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
            <%
                GregorianCalendar currentDate = new GregorianCalendar();
                int currentYear =  currentDate.get(Calendar.YEAR);
            %>
            <p>&copy; Copyright <%= currentYear %> Titan Online Banking Application
        </footer>
    </body>
</html>
