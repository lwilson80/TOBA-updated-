package customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import business.*;

public class PasswordResetServlet extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        
        String currentPassword = req.getParameter("currentPassword");
        String newPassword = req.getParameter("newPassword");
        String url = "/password_reset.jsp";
        
        User user = (User) session.getAttribute("user");

        UserDB.update(user);
        
        url = "/Account_activity.jsp";
        getServletContext().getRequestDispatcher(url).forward(req,res);
        
    }
}
