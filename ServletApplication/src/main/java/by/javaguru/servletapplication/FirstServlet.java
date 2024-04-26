package by.javaguru.servletapplication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("INIT");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html");
         var writer = resp.getWriter();
         resp.setHeader("MY_HEADER","HI");

         writer.println("<h1>Привет! First Servlet</h1>");

         String header = req.getHeader("user-agent");
         writer.println("<h1>"+ header +"</h1>");

        Enumeration<String> headerNames = req.getHeaderNames();

        while(headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            writer.println("<h3>" + s + " : " + req.getHeader(s) + "</h3>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        writer.println("<h1>"+ req.getParameter("login") +"</h1>");
        writer.println("<h1>"+ req.getParameter("pwd") +"</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("DESTROY");
    }
}
