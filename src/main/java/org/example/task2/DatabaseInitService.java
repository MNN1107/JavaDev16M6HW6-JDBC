package org.example.task2;

import org.example.task1.Database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        try{
            Connection connection = Database.getInstance().getConnection();

            String sqlFilePath = "src/sql/init_db.sql";
            String sqlQuery = readSqlFile(sqlFilePath);

            executeSqlQueries(connection, sqlQuery);
            connection.close();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
public static String readSqlFile(String filePath) throws IOException {
    StringBuilder content = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
    String line;
    while ((line = reader.readLine()) != null){
    content.append(line).append("/n");
    }
  }
        return content.toString();
}
private static void executeSqlQueries(Connection connection, String sqlQuery) throws IOException, SQLException {
    Statement statement = connection.createStatement();
    String[] queries = sqlQuery.split(";");
            for(String query: queries){
                statement.executeUpdate(query);
            }
    statement.close();
}
}