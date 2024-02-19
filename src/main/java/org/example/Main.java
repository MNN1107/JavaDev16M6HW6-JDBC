package org.example;

import org.example.task4.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DatabaseQueryService queryService = new DatabaseQueryService();

       List<LongestProject> longestProjects = queryService.findLongestProject();
        System.out.println("Longest projects:");
       for (LongestProject project : longestProjects) {
            System.out.println(project.getName() + ": " + project.getMonthCount() + " months");
        }


        List<MaxProjectCountClient> maxProjectCountClients = queryService.findMaxProjectsClient();
        System.out.println("Clients with maximum number of projects:");
        for (MaxProjectCountClient client : maxProjectCountClients) {
            System.out.println(client.getName() + ": " + client.getProjectCount() + " projects");
        }


        List<MaxSalaryWorker> maxSalaryWorkers = queryService.findMaxSalaryWorker();
       System.out.println("Workers with maximum salary:");
        for (MaxSalaryWorker worker : maxSalaryWorkers) {
            System.out.println(worker.getName() + ": " + worker.getSalary());
        }


        List<YoungestOldestWorkers> youngestOldestWorkers = queryService.findYoungestOldestWorkers();
        System.out.println("Youngest and oldest workers:");
       for (YoungestOldestWorkers worker : youngestOldestWorkers) {
            System.out.println(worker.getType() + " - " + worker.getName() + ", Birthday: " + worker.getBirthday());
        }


        List<ProjectPrices> projectPrices = queryService.printProjectPrices();
        System.out.println("Project prices:");
        for (ProjectPrices project : projectPrices) {
            System.out.println(project.getName() + ": " + project.getPrice());
        }
    }
}




