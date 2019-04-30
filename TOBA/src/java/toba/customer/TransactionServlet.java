package toba.customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

public class TransactionServlet extends HttpServlet {

      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
   {        
        HttpSession session = req.getSession();
        String url = "/Account_activity.jsp";
        String credit = req.getParameter("amount");
        
        if (credit == null) {
            url = "/Add_Funds.jsp";
        }
        else {
            //
            url = "/index.jsp";
        }
        
        
    }
}