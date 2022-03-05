package com.example.filtercontroleacesso.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        UserInfo userInfo = new UserInfo();
        userInfo.setId(user);
        userInfo.setSenha(password);

        HttpSession session = request.getSession();
        session.setAttribute("userInfo", userInfo);

        request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
    }
}
