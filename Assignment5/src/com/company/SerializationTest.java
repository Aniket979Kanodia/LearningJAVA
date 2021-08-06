package com.company;
import java.util.Map;
import java.util.TreeMap;

public class SerializationTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        Address add1 = new Address();
        Student student2 = new Student();
        Address add2 = new Address();
        Student student3 = new Student();
        Address add3 = new Address();
        Student student4 = new Student();
        Address add4 = new Address();

        student1.setFirstName("Aniket");
        student1.setDateOfBirth("29/05/2002");
        add1.setCity("Satna");
        add1.setPinCode(485001);
        add1.setState("Madhya Pradesh");
        add1.setCountry("India");
        student1.setAddress(add1);

        student2.setFirstName("Anirudh");
        student2.setDateOfBirth("26/11/2001");
        add2.setCity("Varanasi");
        add2.setPinCode(542045);
        add2.setState("Uttar Pradesh");
        add2.setCountry("India");
        student2.setAddress(add1);

        student3.setFirstName("Shreya");
        student3.setDateOfBirth("19/05/2000");
        add3.setCity("Indore");
        add3.setPinCode(455381);
        add3.setState("Madhya Pradesh");
        add3.setCountry("India");
        student3.setAddress(add3);

        student4.setFirstName("Vibhore");
        student4.setDateOfBirth("28/07/1997");
        add4.setCity("Banglore");
        add4.setPinCode(256671);
        add4.setState("Karnatka");
        add4.setCountry("India");
        student4.setAddress(add4);

        Map<String,Student> data = new TreeMap<>();
        data.put("student1",student1);
        data.put("student2",student2);
        data.put("student3",student3);
        data.put("student4",student4);

    }
}
