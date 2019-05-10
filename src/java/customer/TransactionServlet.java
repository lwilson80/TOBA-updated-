package customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import business.*;


public class TransactionServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String url = "/Transaction.jsp";
        
        String from = request.getParameter("fromAcct");
        String to = request.getParameter("toAcct");
        String amt = request.getParameter("amt");
        
        User user = (User)request.getSession().getAttribute("user");
        Account fromAcct;
        Account toAcct;
        if (from.equals("Checking")){
            fromAcct = user.getAccount(Account.AccountType.CHECKING);
            toAcct = user.getAccount(Account.AccountType.SAVINGS);
        }else{
            fromAcct = user.getAccount(Account.AccountType.SAVINGS);
            toAcct = user.getAccount(Account.AccountType.CHECKING);
        }
    }
}