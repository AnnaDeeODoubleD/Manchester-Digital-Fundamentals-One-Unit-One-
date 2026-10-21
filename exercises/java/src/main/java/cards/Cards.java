package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();

        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }

    // Add this method so CardsTest can call cards.getCards()
    public String[] getCards() {
        Deck deck = new Deck();
        return deck.getCards();
    }
}