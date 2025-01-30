package com.itsvidhanreddy;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletMiddlewareToAddData extends HttpServlet {
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String name = req.getParameter("username");
    int num = Integer.parseInt(req.getParameter("phone_number"));

    PrintWriter pw = res.getWriter();
    pw.println("The username: " + name + " and the phone number: " + num);

    pw.close();
  }
}
