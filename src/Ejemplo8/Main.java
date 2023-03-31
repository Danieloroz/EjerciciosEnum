package Ejemplo8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();


        students.add("Daniel");
        students.add("Martin");
        students.add("Felipe");

        students.remove(0);

        System.out.println(students);
    }
}
