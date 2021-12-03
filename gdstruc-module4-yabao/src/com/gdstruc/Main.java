package com.gdstruc;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int roundCounter = 0;
        int playerID = 0;
        ArrayQueue queue = new ArrayQueue(5);
        Scanner scanner = new Scanner(System.in);

        while (roundCounter < 10)
        {
            Random random = new Random();
            int playerRandomizer = random.nextInt(7) + 1;

            for (int i = 0; i < playerRandomizer; i++)
                queue.add(new Player(playerID++));

            System.out.println(playerRandomizer + " people added in the queue.");

            System.out.println("Players in queue: ");
            queue.printQueue();

            System.out.println("Press Enter to continue.");
            scanner.nextLine();

            if(queue.size() >= 5)
            {
                roundCounter++;
                System.out.println("People in game " + roundCounter + ": ");

                for (int i = 0; i < 5; i++)
                {
                    System.out.println(queue.peek());
                    queue.remove();
                }
                System.out.println("Press Enter to continue.");
                scanner.nextLine();

                System.out.println("================================");
            }
        }
    }
}
