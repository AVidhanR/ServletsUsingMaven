package com.itsvidhanreddy;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletMiddlewareToAddData extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res) {

    try {
      PrintWriter pw = res.getWriter();
      try {
        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        String phoneNumberLength = req.getParameter("phone_number");

        if (phoneNumberLength.length() > 10) {
          throw new RuntimeException("Phone number limit exceeded 10 digits, which is not acceptable");
        }

        pw.println("The First Name is " + firstName + ",\nLast Name is " + lastName +
            "\nwith Phone Number: " + req.getParameter("phone_number"));

      } catch (NumberFormatException e) {
        pw.println("Something went wrong: " + e.getMessage());
      } finally {
        pw.close();
      }
    } catch (IOException e) {
      System.out.println("Something went wrong: " + e.getMessage());
    }

  }
}
