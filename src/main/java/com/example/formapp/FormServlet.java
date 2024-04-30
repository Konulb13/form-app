package com.example.formapp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("surname", surname);
        request.getSession().setAttribute("email",email);
        request.getSession().setAttribute("address",address);

        response.sendRedirect("displayInfo.jsp");
    }
}
