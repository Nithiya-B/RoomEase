package controller;

import dao.RoomDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RoomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setAttribute("rooms", RoomDAO.getAllRooms());

        RequestDispatcher rd = req.getRequestDispatcher("rooms.jsp");
        rd.forward(req, res);
    }
}
