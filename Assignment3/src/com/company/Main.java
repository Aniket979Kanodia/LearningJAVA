package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(System.in);
        File detailFile = new File("..\\Assignment3\\info.txt");
        ArrayList<String > content = new ArrayList<>();
        Scanner scan = new Scanner(detailFile);
        scan.useDelimiter(",");


        while (scan.hasNext())
            content.add(scan.next());

        System.out.println(content);


        int employeeCount;
        employeeCount = content.size()/4;
        System.out.println(employeeCount);


        Map<Integer,employee> data= new TreeMap<>();
        for(int i=1;i<=employeeCount;i++)
        {
            employee person = new employee();
            int begin = (i-1)*4;
            person.setName(content.get(begin));
            person.setEmailAddress(content.get(begin+1));
            person.setAge(content.get(begin+2));
            person.setDob(content.get(begin+3));
            data.put(i,person);
        }

        for(Map.Entry<Integer, employee> entry:data.entrySet())
        {
            int key=entry.getKey();
            employee e=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(e.getName()+" "+e.getEmailAddress()+" "+e.getAge()+" "+e.getDob());


        }

        System.out.println("Please select required action : ");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Search");

        int choice;
        choice= sin.nextInt();

        if(choice == 1){
            employee newEmployee = new employee();
            String firstName;
            String lastName;
            String name;
            employeeCount++;
            System.out.println("ID of new Employee : " + employeeCount);
            System.out.println("Enter details to be added :");
            System.out.println("Enter first name :");
            firstName= sin.next();
            System.out.println("Enter last name :");
            lastName = sin.next();
            name = firstName + " " + lastName;
            newEmployee.setName(name);
            System.out.println("Enter Email address :");
            newEmployee.setEmailAddress(sin.next());
            System.out.println("Enter age :");
            newEmployee.setAge(sin.next());
            System.out.println("Enter Date of Birth :");
            newEmployee.setDob(sin.next());
            data.put(employeeCount,newEmployee);
        }
        else if(choice == 2){
            int empId,confirmation=0;
            System.out.println("Enter ID to employee to delete :");
            empId = sin.nextInt();
            employee e = new employee();
            if(data.containsKey(empId)){
                e= data.get(empId);
                System.out.println("Details of employee");
                System.out.println("ID :" + empId);
                System.out.println("Name :" + e.getName());
                System.out.println("Email ID :" + e.getEmailAddress());
                System.out.println("Age :" + e.getAge());
                System.out.println("DOB :" + e.getDob());
                System.out.println("To delete press 1 else press 0");
                confirmation = sin.nextInt();
                if(confirmation == 1) {
                    data.remove(empId);
                }
            }
            else{
                System.out.println("ID doesn't exist");
            }
        }
        else if(choice==3){
            System.out.println("Select the criteria to sort :");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Date of Birth");
            System.out.println("4. Email address");
            int criteria = sin.nextInt();
            Map<String,employee> sortedData= new TreeMap<>();
            if(criteria==1){
                for(Map.Entry<Integer, employee> entry:data.entrySet())
                {
                    employee e=entry.getValue();
                    sortedData.put(e.getName(),e);
                }
            }
            else if(criteria==2){
                for(Map.Entry<Integer, employee> entry:data.entrySet())
                {
                    employee e=entry.getValue();
                    sortedData.put(e.getAge(),e);
                }
            }
            else if(criteria == 3){
                for(Map.Entry<Integer, employee> entry:data.entrySet())
                {
                    employee e=entry.getValue();
                    sortedData.put(e.getDob(),e);
                }
            }
            else if(criteria == 4){
                for(Map.Entry<Integer, employee> entry:data.entrySet())
                {
                    employee e=entry.getValue();
                    sortedData.put(e.getEmailAddress(),e);
                }
            }
            for(Map.Entry<String, employee> entry:sortedData.entrySet())
            {
                employee e=entry.getValue();
                System.out.println(" Details:");
                System.out.println(e.getName()+" "+e.getEmailAddress()+" "+e.getAge()+" "+e.getDob());


            }
        }

        FileWriter Writer = new FileWriter(detailFile);
        for(Map.Entry<Integer, employee> entry:data.entrySet())
        {
            int key=entry.getKey();
            employee e=entry.getValue();
//            System.out.println(key+" Details:");
            Writer.write(e.getName() + "," + e.getEmailAddress() + "," + e.getAge() + "," + e.getDob()+",");


        }
        Writer.close();
        System.out.println("File updated successfully");
    }
}
