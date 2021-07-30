package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        File urlFile = new File("..\\Assignment3\\info.txt");
        ArrayList<String > content = new ArrayList<>();
        Scanner scan = new Scanner(urlFile);
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
            person.setId(i);
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
            System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailAddress()+" "+e.getAge()+" "+e.getDob());
        }
    }
}
