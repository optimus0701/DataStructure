package com.datastructure.algorithm.hw2_20001904_ViVanDo;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleCardEx {
    // Exercise 7
    public static void main(String[] args) {
        Card[] cards = SortCardEx.createCard();
        CardComparator cardComparator = new CardComparator();
        Arrays.sort(cards, cardComparator);
        shuffle(cards);
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static void shuffle(Card[] cards) {
        Random random = ThreadLocalRandom.current();
        for (int i = cards.length - 1; i > 0; i--)
        {
            int index = random.nextInt(i + 1);
            // Simple swap
            Card card = cards[index];
            cards[index] = cards[i];
            cards[i] = card;
        }
    }
}
