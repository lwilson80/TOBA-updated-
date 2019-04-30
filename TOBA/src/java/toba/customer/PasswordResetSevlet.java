package toba.customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawrencewilson
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PasswordResetSevlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        HttpSession session = req.getSession();
        
        //Declare variables for the current and new password
        String currentPassword = req.getParameter("currentPassword");
        String newPassword = req.getParameter("newPassword");
        String url = "/password_reset.jsp";
        
        User user = (User) session.getAttribute("user");
        
        UserDB.update(user);
        
        //Redirect to the account acivity page once the user has reset their password
        url = "/Account_activity.jsp";
        getServletContext().getRequestDispatcher(url).forward(req,res);
    }
           
    
}
