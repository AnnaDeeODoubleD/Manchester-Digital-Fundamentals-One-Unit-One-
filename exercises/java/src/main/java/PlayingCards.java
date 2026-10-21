package cards;
public class PlayingCards {

    int suit;
    int value; // 1 to 13

   String[] SUITS = {
            "clubs", "diamonds", "hearts", "spades"
    };

    String[] values = {
            "", "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"
    };

    public PlayingCards(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public String getFormatted() {
        return "%s of %s".formatted(values[value], SUITS[suit]);
    }
}

