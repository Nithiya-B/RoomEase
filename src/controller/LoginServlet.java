package controller;

import dao.UserDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (UserDAO.login(email, password)) {

            // create session
            HttpSession session = req.getSession();
            session.setAttribute("userEmail", email);

            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}

