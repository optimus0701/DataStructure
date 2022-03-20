package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;

public class SortCardEx {
    // Exercise 6
    public static void main(String[] args) {
        CardComparator cardComparator = new CardComparator();

        Card[] cards = createCard();
        Arrays.sort(cards, cardComparator);
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static Card[] createCard() {
        Card[] cards = new Card[52];
        for (int i = 1; i < 14; i++) {
            cards[i * 4 - 4] = new Card(i + "", "hearts");
            cards[i * 4 - 3] = new Card(i + "", "diamonds");
            cards[i * 4 - 2] = new Card(i + "", "clubs");
            cards[i * 4 - 1] = new Card(i + "", "spades");
        }
        return cards;
    }
}
