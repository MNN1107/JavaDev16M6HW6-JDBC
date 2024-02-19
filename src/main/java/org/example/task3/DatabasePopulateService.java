package org.example.task3;

import org.example.task1.Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        try {

            String sqlFile = "src/sql/populate_db.sql";
            StringBuilder sqlQueries = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(sqlFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sqlQueries.append(line).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }


            Connection connection = Database.getInstance().getConnection();


            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sqlQueries.toString());
                System.out.println("Database populated successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }


            Database.getInstance().closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
