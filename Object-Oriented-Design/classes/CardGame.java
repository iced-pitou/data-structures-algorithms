package classes;

import java.util.Set;

public class CardGame {

    protected Set<Card> cards;

    protected CardGame() {
    }

    public static CardGame create(GameType type) {
        switch (type) {
            case BLACKJACK:
                return new BlackJackGame();
            default:
                return null;
        }
    }

    public Set<Card> getCards() {
        return this.cards;
    }

    @Override
    public String toString() {
        StringBuilder strBldr = new StringBuilder();
        for (Card card : cards) {
            strBldr.append(card.toString() + ", ");
        }
        return strBldr.substring(0, strBldr.length() - 2) + "\n";
    }

}
