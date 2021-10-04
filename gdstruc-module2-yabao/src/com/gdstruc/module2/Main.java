package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player rory = new Player(1,"Rory", 5);
        Player talia = new Player(2, "Talia", 34);
        Player ember = new Player(3, "Ember", 2);
        Player sparrow = new Player(4, "Sparrow", 4);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(sparrow);
        playerLinkedList.addToFront(ember);
        playerLinkedList.addToFront(talia);
        playerLinkedList.addToFront(rory);

        System.out.println("Player List:");
        playerLinkedList.printLinkedList();
        playerLinkedList.listSize();

        System.out.println("\n");
        playerLinkedList.contains(rory);
        playerLinkedList.indexOf(rory);

        playerLinkedList.removeFront();
        System.out.println("\n\nNew Player List:");
        playerLinkedList.printLinkedList();
        playerLinkedList.listSize();

        System.out.println("\n");
        playerLinkedList.contains(rory);
        playerLinkedList.indexOf(rory);



    }

}
