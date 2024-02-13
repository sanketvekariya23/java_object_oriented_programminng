import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        
        System.out.println("this is get method....");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> this is get method of servlet</h2>");
        
        
    }

}