package com.gdstruc;

public class Main {

    public static void main(String[] args) {
	Tree tree = new Tree();

    tree.insert(10);
    tree.insert(89);
    tree.insert(-18);
    tree.insert(12);
    tree.insert(1);
    tree.insert(20);
    tree.insert(-80);


    /*tree.traverseInOrder();*/
    tree.traverseInOrderDescending();

    System.out.println("Node with the least value: " + tree.getMin());

    System.out.println("Node with the greatest value: " + tree.getMax());
    }
}
