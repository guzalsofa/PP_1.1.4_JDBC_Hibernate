package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService s = new UserServiceImpl();
        s.createUsersTable();
        s.saveUser("Ivan", "Petrov", (byte) 25);
        System.out.println("User с именем — Ivan добавлен в базу данных");
        s.saveUser("Nikita", "Sidorov", (byte) 18);
        System.out.println("User с именем — Nikita добавлен в базу данных");
        s.saveUser("Elena", "Ivanova", (byte) 45);
        System.out.println("User с именем — Elena добавлен в базу данных");
        s.saveUser("Anna", "Snetkova", (byte) 34);
        System.out.println("User с именем — Anna добавлен в базу данных");
        s.getAllUsers().forEach(System.out::println);
        s.cleanUsersTable();
        s.dropUsersTable();
        jm.task.core.jdbc.util.Util.shutdownSessionFactory();
    }
}
