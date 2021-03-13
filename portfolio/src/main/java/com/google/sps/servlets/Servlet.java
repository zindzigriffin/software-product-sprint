
package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/My-Portfolio")

public class Servlet extends HttpServlet{
    String [] random_messages = {"I did martial arts for 13 years", "I used to be a competitive swimmer.","I love cooking"};
    @Override

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String json = convertToJsonUsingGson(random_messages);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
private String convertToJsonUsingGson(String[] random_messages) {
        Gson gson = new Gson();
        String json = gson.toJson(random_messages);
    return json;
  }
}

