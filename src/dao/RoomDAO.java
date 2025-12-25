package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoomDAO {
    public static ResultSet getAllRooms() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            return st.executeQuery("SELECT * FROM rooms");
        } catch (Exception e) {
            return null;
        }
    }
}

