package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.User;

public class UserDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public UserDAO() {
    }

    public void insertNew(User user) throws ClassNotFoundException, SQLException{
        String query ="Insert into User_Table Values (? , ? , ? , ? , ? , ? ,? ,? ,? ,?)";
        conn = DBconnect.makeConnection();
        ps  = conn.prepareStatement(query);
        ps.setInt(1, user.getUser_id());
        ps.setString(2, user.getRole());
        ps.setString(3, user.getUserName());
        ps.setString(4, user.getPassword());
        ps.setString(5, user.getEmail());
        ps.setNull(6, 0);
        ps.setNull(7, 0);
        ps.setNull(8, 0);
        ps.setNull(9, 0);
        ps.setNull(10, 0);
        ps.executeUpdate();
    }
}
