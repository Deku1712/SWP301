package Control;

import java.io.IOException;
import java.sql.SQLException;

import DB.UserDAO;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/signUp"})
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("Password");
        User user = new User();
        Feature f = new Feature();
        int userId =  f.getInt();
        user.setUser_id(userId);
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);

        UserDAO userDAO = new UserDAO();
        try {
            userDAO.insertNew(user);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }
    
}
