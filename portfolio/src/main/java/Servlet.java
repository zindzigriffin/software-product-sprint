package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/My-Portfolio")

public class Servlet extends HttpServlet{
    @Override

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    response.setContentType("text/html;");
    response.getWriter().println("<h1>Portfolio Servlet</h1>");
    response.getWriter().println("<p>Hello World!</p>");
  }
}

