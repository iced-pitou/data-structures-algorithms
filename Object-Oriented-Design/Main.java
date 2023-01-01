import classes.CardGame;
import classes.GameType;

public class Main {

    public static void main(String[] args) {
        CardGame game = CardGame.create(GameType.BLACKJACK);
        System.out.println(game.getCards().size());
    }

}
