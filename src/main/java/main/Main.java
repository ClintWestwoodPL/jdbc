package main;

import config.Database;
import dao.UserDao;
import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database db = new Database();
        UserDao userDao = new UserDao(db);

    //    User user = new User("Tomasz", "Kuc", "kuc@mail.pl");

      //  userDao.update(user);
       // userDao.delete(3);

        List<User> users = userDao.findAll();
        System.out.println(users);

    }
}
