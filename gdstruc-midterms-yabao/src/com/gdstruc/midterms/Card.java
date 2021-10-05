package com.gdstruc.midterms;

import java.util.Objects;

public class Card {

    private String cardName;

    public Card (String name)
    {
        this.cardName = name;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName);
    }

    @Override
    public String toString() {
        return cardName;
    }
}
