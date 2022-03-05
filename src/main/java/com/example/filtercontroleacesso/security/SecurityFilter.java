package com.example.filtercontroleacesso.security;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "SecurityFilter", value="/sec/*")
// value="/sec/*" - interceptará apenas os conteúdos da pasta sec.
public class SecurityFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();

        UserInfo user = (UserInfo)session.getAttribute("userInfo");

        if (user == null) {
            res.sendError(HttpServletResponse.SC_FORBIDDEN); // retorna o código 403 - acesso negado
            return;
        } else {
            chain.doFilter(request, response);
        }
    }
}
