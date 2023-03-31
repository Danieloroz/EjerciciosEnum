package Ejemplo6;

import java.util.ArrayList;
import java.util.List;

class Main {
     public static void main (String[] args){
         List<String> list = new  ArrayList<String>(){{add("Python");add("C++");add("Java");}};
         System.out.println("Utilizando el método toString() en la lista" + list.toString());
     }
 }
