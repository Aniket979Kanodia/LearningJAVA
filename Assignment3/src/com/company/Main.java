package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Scanner sin = new Scanner(System.in);
            File detailFile = new File("..\\Assignment3\\info.txt");
            ArrayList<String> content = new ArrayList<>();
            Scanner scan = new Scanner(detailFile);
            scan.useDelimiter(",");


            while (scan.hasNext())
                content.add(scan.next());

            System.out.println(content);


            int employeeCount;
            employeeCount = content.size() / 4;

            Map<Integer, employee> data = new TreeMap<>();
            for (int i = 1; i <= employeeCount; i++) {
                employee person = new employee();
                int begin = (i - 1) * 4;
                person.setName(content.get(begin));
                person.setEmailAddress(content.get(begin + 1));
                person.setAge(content.get(begin + 2));
                person.setDob(content.get(begin + 3));
                data.put(i, person);
            }

            System.out.println("Please select required action : ");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Sort");

            int choice;
            choice = sin.nextInt();

            if (choice == 1) {
                employee newEmployee = new employee();
                String firstName;
                String lastName;
                String name;
                employeeCount++;
                System.out.println("ID of new Employee : " + employeeCount);
                System.out.println("Enter details to be added :");
                System.out.println("Enter first name :");
                firstName = sin.next();
                System.out.println("Enter last name :");
                lastName = sin.next();
                name = firstName + " " + lastName;
                newEmployee.setName(name);
                System.out.println("Enter Email ID :");
                newEmployee.setEmailAddress(sin.next());
                System.out.println("Enter age :");
                newEmployee.setAge(sin.next());
                System.out.println("Enter Date of Birth :");
                newEmployee.setDob(sin.next());
                data.put(employeeCount, newEmployee);
            }
            else if (choice == 2) {
                int empId, confirmation = 0;
                System.out.println("Enter ID to employee to delete :");
                empId = sin.nextInt();
                employee e = new employee();
                if (data.containsKey(empId)) {
                    e = data.get(empId);
                    System.out.println("Details of employee");
                    System.out.println("ID :" + empId);
                    System.out.println("Name :" + e.getName());
                    System.out.println("Email ID :" + e.getEmailAddress());
                    System.out.println("Age :" + e.getAge());
                    System.out.println("Date of Birth :" + e.getDob());
                    System.out.println("To delete press 1 else press 0");
                    confirmation = sin.nextInt();
                    if (confirmation == 1) {
                        data.remove(empId);
                    }
                }
                else {
                    System.out.println("ID doesn't exist");
                }
            }
            else if (choice == 3) {
                System.out.println("Enter first name of employee to search :");
                String firstName = sin.next();
                System.out.println("Enter last name of employee to search :");
                String lastName = sin.next();
                String Name = firstName + " " + lastName;
                int test = 0;
                for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                    employee e = entry.getValue();
                    if (e.getName().equals(Name)) {
                        System.out.println("Match found");
                        System.out.println("Name : " + e.getName());
                        System.out.println("Email ID : " + e.getEmailAddress());
                        System.out.println("Age : " + e.getAge());
                        System.out.println("DOB : " + e.getDob());
                        test = 1;
                        break;
                    }
                }
                if (test == 0) {
                    System.out.println("No match found");
                }

            }
            else if (choice == 4) {
                System.out.println("Select the criteria to sort :");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Date of Birth");
                System.out.println("4. Email ID");
                int criteria = sin.nextInt();

                System.out.println("Specify the order to sort :");
                System.out.println("For ascending press 1");
                System.out.println("For descending press 2");
                int order = sin.nextInt();
                TreeMap<String, employee> sortedData = new TreeMap<>();

                if (criteria == 1) {
                    for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                        employee e = entry.getValue();
                        sortedData.put(e.getName(), e);
                    }
                }
                else if (criteria == 2) {
                    for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                        employee e = entry.getValue();
                        sortedData.put(e.getAge(), e);
                    }
                }
                else if (criteria == 3) {
                    for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                        employee e = entry.getValue();
                        sortedData.put(e.getDob(), e);
                    }
                }
                else if (criteria == 4) {
                    for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                        employee e = entry.getValue();
                        sortedData.put(e.getEmailAddress(), e);
                    }
                }
                if (order == 1) {
                    for (Map.Entry<String, employee> entry : sortedData.entrySet()) {
                        employee e = entry.getValue();
                        System.out.println("Details:");
                        System.out.println("Name :" + e.getName() + "\nEmail ID : " + e.getEmailAddress() + "\nAge : " + e.getAge() + "\nDOB : " + e.getDob());

                    }
                }
                else if (order == 2) {
                    Map<String, employee> reverseMap = sortedData.descendingMap();
                    for (Map.Entry<String, employee> entry : reverseMap.entrySet()) {
                        employee e = entry.getValue();
                        System.out.println("Details:");
                        System.out.println("Name :" + e.getName() + "\nEmail ID : " + e.getEmailAddress() + "\nAge : " + e.getAge() + "\nDOB : " + e.getDob());
                    }
                }
            }

            FileWriter Writer = new FileWriter(detailFile);
            for (Map.Entry<Integer, employee> entry : data.entrySet()) {
                int key = entry.getKey();
                employee e = entry.getValue();
                Writer.write(e.getName() + "," + e.getEmailAddress() + "," + e.getAge() + "," + e.getDob() + ",");
            }
            Writer.close();
            if (choice == 1 || choice == 2)
                System.out.println("File updated successfully");
        }catch(IOException e){
            System.out.println("Exception :" + e);
        }catch(InputMismatchException e){
            System.out.println("Exception :" + e);
        }
    }
}
