package org.example.task4;

import org.example.task1.Database;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public List<LongestProject> findLongestProject() {
        List<LongestProject> longestProjects = new ArrayList<>();
        String sqlQuery = readSqlFile("find_longest_project.sql");
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int monthCount = resultSet.getInt("MONTH_COUNT");
                longestProjects.add(new LongestProject(name, monthCount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return longestProjects;
    }

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> maxProjectCountClients = new ArrayList<>();
        String sqlQuery = readSqlFile("find_max_projects_client.sql");
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int projectCount = resultSet.getInt("PROJECT_COUNT");
                maxProjectCountClients.add(new MaxProjectCountClient(name, projectCount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxProjectCountClients;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> maxSalaryWorkers = new ArrayList<>();
        String sqlQuery = readSqlFile("find_max_salary_worker.sql");
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int salary = resultSet.getInt("SALARY");
                maxSalaryWorkers.add(new MaxSalaryWorker(name, salary));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxSalaryWorkers;
    }

    public List<YoungestOldestWorkers> findYoungestOldestWorkers() {
        List<YoungestOldestWorkers> youngestOldestWorkers = new ArrayList<>();
        String sqlQuery = readSqlFile("find_youngest_oldest_workers.sql");
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String type = resultSet.getString("TYPE");
                String name = resultSet.getString("NAME");
                LocalDate birthday = resultSet.getDate("BIRTHDAY").toLocalDate();
                youngestOldestWorkers.add(new YoungestOldestWorkers(type, name, birthday));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return youngestOldestWorkers;
    }

    public List<ProjectPrices> printProjectPrices() {
        List<ProjectPrices> projectPrices = new ArrayList<>();
        String sqlQuery = readSqlFile("print_project_prices.sql");
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int price = resultSet.getInt("PRICE");
                projectPrices.add(new ProjectPrices(name, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projectPrices;
    }

    private String readSqlFile(String fileName) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
            if (inputStream != null) {
                return new String(inputStream.readAllBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

