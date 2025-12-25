package controller;

import dao.DBConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class BookingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int roomId = Integer.parseInt(req.getParameter("roomId"));

            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
                con.prepareStatement(
                    "INSERT INTO bookings(user_id, room_id, booking_date) VALUES (1, ?, ?)"
                );

            ps.setInt(1, roomId);
            ps.setDate(2, java.sql.Date.valueOf(LocalDate.now()));

            ps.executeUpdate();

            res.sendRedirect("dashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

