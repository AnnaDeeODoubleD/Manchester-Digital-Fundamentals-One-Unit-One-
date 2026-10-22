package cards;
public class Deck {

        private final PlayingCards[] cards = new PlayingCards[52];

        //taken from original code
        public Deck() {
            int index = 0;
            for (int suit = 0; suit < 4; suit++) {
                for (int value = 1; value <= 13; value++) {
                    cards[index++] = new PlayingCards(suit, value);
                }
            }
        }
//taken from original code, but added getFormatted.
        public String[] getCards() {
            String[] cardNames = new String[52];
            for (int i = 0; i < cards.length; i++) {
                cardNames[i] = cards[i].getFormatted();
            }
            return cardNames;
        }
    }

