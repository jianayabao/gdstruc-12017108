package com.gdstruc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player rory = new Player(149, "rory", 120);
        Player sparrow = new Player(78, "sparrow", 16);
        Player talia = new Player(185, "talia", 112);
        Player artem = new Player(183,"artem", 28);
        Player ember = new Player(89,"ember", 2);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(rory.getName(), rory);
        hashtable.put(sparrow.getName(), sparrow);
        hashtable.put(talia.getName(), talia);
        hashtable.put(artem.getName(), artem);
        hashtable.put(ember.getName(), ember);

        hashtable.printHashtable();
        System.out.println("\n=================================");

        System.out.println("Enter the name of the player you want to remove: ");
        String input = scanner.nextLine();

       System.out.println("\n=================================");

       hashtable.remove(input);
       hashtable.printHashtable();
    }
}
