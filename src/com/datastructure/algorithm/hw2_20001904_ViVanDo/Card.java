package com.datastructure.algorithm.hw2_20001904_ViVanDo;

public class Card implements Comparable<Card> {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public int compareTo(Card another) {
        if (getRankValue() == another.getRankValue()) {
            if (getSuitValue() > another.getSuitValue()) {
                return 1;
            } else if (getSuitValue() == another.getSuitValue()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return Integer.compare(getRankValue(), another.getRankValue());
        }
    }

    public int getSuitValue() {
        return switch (suit.toLowerCase()) {
            case "hearts" -> 4;
            case "diamonds" -> 3;
            case "clubs" -> 2;
            case "spades" -> 1;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return switch (rank) {
            case "1" -> "A " + suit;
            case "11" -> "J " + suit;
            case "12" -> "Q " + suit;
            case "13" -> "K " + suit;
            default -> rank + " " + suit;
        };
    }

    public int getRankValue() {
        return switch (rank.toUpperCase()) {
            case "A" -> 1;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            default -> 0;
        };
    }

}
