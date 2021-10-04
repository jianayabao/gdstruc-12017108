package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    public void addToFront (Player player)
    {
       PlayerNode playerNode = new PlayerNode(player);
       playerNode.setNextPlayer(head);
       head = playerNode;
    }

    public void removeFront()
    {
        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp = null;
    }

    public void listSize()
    {
        int counter = 0;
        PlayerNode current = head;
        while(current != null)
        {
            counter++;
            current = current.getNextPlayer();
        }

        System.out.println("List Size: " + counter);

    }

    public void contains(Player player)
    {
        int checker = 0;
        PlayerNode current = head;
        while(current != null)
        {
            if (current.getPlayer() == player)
            {
                checker = 1;
            }
            current = current.getNextPlayer();
        }

        if (checker == 1)
        {
            System.out.println("Does the list contain " + player + "?: True");
        }
        else if (checker == 0)
        {
            System.out.println("Does the list contain " + player + "?: False");
        }

    }

    public void indexOf(Player player)
    {
        int counter = -1;
        PlayerNode current = head;
        while(current != null)
        {
            counter++;
            if (current.getPlayer() == player)
                break;
            else if (current.getPlayer() != player)
            {
                counter = -1;
            }
            current = current.getNextPlayer();
        }

        System.out.println("Index of " + player + ": " + counter);
    }

    public void printLinkedList()
    {
        PlayerNode current = head;
        while(current != null)
        {
            System.out.println(current.getPlayer());
            current = current.getNextPlayer();
        }
    }

}
