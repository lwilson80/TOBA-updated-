/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author lawrencewilson
 */
public class NewCustomerServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException
    {
        HttpSession session = req.getSession();
        
        //Declare variables
        String url = "/index.jsp";
       
        
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        String email = req.getParameter("email");
        
        String message ="";
       
        
        //Validate user input from form
         if  ((firstName == null || lastName == null || phone == null || address == null ||
                city == null || state == null || zip == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() ||
                city.isEmpty() || state.isEmpty() ||zip.isEmpty() || email.isEmpty())) {
         
        message = "Please ensure that you are input information into all of the fields provided.";
        
        //Forward back to New Customer form page to complete.
            url = "/New_customer.jsp";
        }
         
         //Create new user object and add user to databas
         else{
             User user = new User(firstName, lastName, phone, address, city, state, zip, email, (lastName+zip), "welcome1");
             Account account = new Account(25.00, user);
             session.setAttribute("user", user);
             url = "/Success.jsp";
             UserDB.insert(user);
             AccountDB.insert(account);
         }
         req.setAttribute("message", message);
         getServletContext().getRequestDispatcher(url).forward(req, res);
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        doPost(req,res);
    }
    
}