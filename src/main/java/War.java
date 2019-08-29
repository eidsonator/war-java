import card.Card;
import card.Deck;
import card.Hand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class War {
  public static void main(String[] args) throws IOException {
    Deck deck = new Deck();
    deck.shuffle();
    Hand p1 = new Hand();
    Hand p2 = new Hand();
    int count = 0;
    while (deck.getCardsLeftInDeck() != 0) {
      p1.addToHand(deck.dealCard());
      p2.addToHand(deck.dealCard());
    }

    List<Card> p1PlayCards = new ArrayList<>();
    List<Card> p2PlayCards = new ArrayList<>();

    p1PlayCards.add(p1.getFirstCard());
    p2PlayCards.add(p2.getFirstCard());
    while (!p1PlayCards.isEmpty() && !p2PlayCards.isEmpty() && count < 10000) {
      System.out.println("Player 1 Card:");
      System.out.println(p1PlayCards.get(0).toString());
      System.out.println("Player 2 Card:");
      System.out.println(p2PlayCards.get(0).toString());
      int p1PlayCard = p1PlayCards.get(0).getValue().getValue();
      int p2PlayCard = p2PlayCards.get(0).getValue().getValue();
      if (p1PlayCard > p2PlayCard) {
        System.out.println("Player 1 wins battle");
        p1.addCardsToHand(p2PlayCards);
        p1.addCardsToHand(p1PlayCards);
        p1PlayCards.clear();
        p2PlayCards.clear();
      } else if (p1PlayCard < p2PlayCard) {
        System.out.println("Player 2 wins battle");
        p2.addCardsToHand(p2PlayCards);
        p2.addCardsToHand(p1PlayCards);
        p1PlayCards.clear();
        p2PlayCards.clear();
      } else {
        System.out.println("War!");
      }
      if (p1.getCardsLeftInHand() > 0 && p2.getCardsLeftInHand() > 0) {
        p1PlayCards.add(0, p1.getFirstCard());
        p2PlayCards.add(0, p2.getFirstCard());
      } else {
        String winner = p1.getCardsLeftInHand() > 0 ? "Player 1" : "Player 2";
        System.out.println(String.format("%s Wins!", winner));
      }
      count++;
    }
  }
}
