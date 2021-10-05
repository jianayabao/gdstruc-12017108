package com.gdstruc.midterms;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        CardStack playerDeck = new CardStack();
        CardStack discardedPile = new CardStack();
        CardStack playerHand = new CardStack();
        playerDeck.push(new Card("Ace of Wands"));
        playerDeck.push(new Card("Two of Wands"));
        playerDeck.push(new Card("Page of Wands"));
        playerDeck.push(new Card("Knight of Wands"));
        playerDeck.push(new Card("Queen of Wands"));
        playerDeck.push(new Card("King of Wands"));
        playerDeck.push(new Card("Ace of Cups"));
        playerDeck.push(new Card("Two of Cups"));
        playerDeck.push(new Card("Page of Cups"));
        playerDeck.push(new Card("Knight of Cups"));
        playerDeck.push(new Card("Queen of Cups"));
        playerDeck.push(new Card("King of Cups"));
        playerDeck.push(new Card("Ace of Pentacles"));
        playerDeck.push(new Card("Two of Pentacles"));
        playerDeck.push(new Card("Page of Pentacles"));
        playerDeck.push(new Card("Knight of Pentacles"));
        playerDeck.push(new Card("Queen of Pentacles"));
        playerDeck.push(new Card("King of Pentacles"));
        playerDeck.push(new Card("Ace of Swords"));
        playerDeck.push(new Card("Two of Swords"));
        playerDeck.push(new Card("Page of Swords"));
        playerDeck.push(new Card("Knight of Swords"));
        playerDeck.push(new Card("Queen of Swords"));
        playerDeck.push(new Card("King of Swords"));
        playerDeck.push(new Card("The Fool"));
        playerDeck.push(new Card("The High Priestess"));
        playerDeck.push(new Card("The Magician"));
        playerDeck.push(new Card("The Tower"));
        playerDeck.push(new Card("The Hanged Man"));
        playerDeck.push(new Card("Temperance"));

        int roundCounter = 0;
        //start
        while(playerDeck.size() != 0)
        {
            Random random = new Random();
            int moveRandomizer = random.nextInt(3) + 1;

            if(moveRandomizer == 1)
            {
                drawCards(playerHand, playerDeck);
            }
            else if (moveRandomizer == 2)
            {
                drawCards(discardedPile,playerHand);
            }
            else if (moveRandomizer == 3)
            {
                drawCards(playerHand, discardedPile);
            }

            roundCounter++;
            System.out.println("\n\nRound: " + roundCounter);
            printItems(playerDeck,playerHand,discardedPile);
        }
    }

    static void drawCards(CardStack put, CardStack take)
    {
        Random random = new Random();
        int randomCards = random.nextInt(5) + 1;

        if(randomCards > take.size())
        {
            randomCards = take.size();
        }

        for (int i = 0; i < randomCards; i++)
        {
            put.push(take.pop());
        }
    }

    static void printItems(CardStack playerDeck, CardStack playerHand, CardStack discardPile)
    {
        System.out.println("Cards on hand: ");
        playerHand.printStack();

        System.out.println("\nCards left in Player Deck: " + playerDeck.size());

        System.out.println("Cards in the Discard Pile: " + discardPile.size());
    }

}
