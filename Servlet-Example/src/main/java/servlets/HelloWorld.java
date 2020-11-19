package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    public void init()  throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>"+"<h2 style=\"text-align: center;\">WILLKOMMEN ZU MEINEM REFERAT</h2>\n" +
                "<p style=\"text-align: center;\">by</p>\n" +
                "<p style=\"text-align: center;\"><em>Armin Hamzic&nbsp;</em></p>\n" +
                "<p>&nbsp;</p>");
    }
}
