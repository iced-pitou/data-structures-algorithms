package classes;

public class Card {

    public final CardSuit suit;
    public final CardRank rank;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

}
