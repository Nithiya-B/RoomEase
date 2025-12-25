package controller;

import dao.RoomDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RoomServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setAttribute("rooms", RoomDAO.getRooms());
        RequestDispatcher rd = req.getRequestDispatcher("rooms.jsp");
        rd.forward(req, res);
    }
}
