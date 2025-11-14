
package com.jdbc.jdbc;

public class App {
    public static void main(String[] args) {
        IConnection conn = new DBConnection();
        IStudent studentService = new StudentImpl(conn);
        IMenu menu = new Menu(studentService);
        menu.show();
    }
}
