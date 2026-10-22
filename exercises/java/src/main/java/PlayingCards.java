package cards;

public class PlayingCards {

    int suit;
    int value; // 1 to 13

    String[] suits = new String[4];
    String[] values = new String[14];

    public PlayingCards(int suit, int value) {
        this.suit = suit;
        this.value = value;

        suits[0] = "clubs";
        suits[1] = "diamonds";
        suits[2] = "hearts";
        suits[3] = "spades";

        values[1] = "ace";
        values[2] = "2";
        values[3] = "3";
        values[4] = "4";
        values[5] = "5";
        values[6] = "6";
        values[7] = "7";
        values[8] = "8";
        values[9] = "9";
        values[10] = "10";
        values[11] = "jack";
        values[12] = "queen";
        values[13] = "king";
    }


    public String getFormatted() {
        return String.format("%s of %s", values[value], suits[suit]);
    }
}

