package classes;

import java.util.HashSet;
import java.util.Set;

public class BlackJackGame extends CardGame {

    protected BlackJackGame() {
        Set<Card> cards = new HashSet<>();

        for (CardRank rank : CardRank.values()) {
            for (CardSuit suit : CardSuit.values()) {
                cards.add(new Card(rank, suit));
            }
        }

        super.cards = cards;
    }

}
