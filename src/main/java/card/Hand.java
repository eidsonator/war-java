package card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private final List<Card> cards = new ArrayList<>();

  public Card getFirstCard() {
    return cards.remove(0);
  }

  public void addToHand(Card card) {
    cards.add(card);
  }

  public int getCardsLeftInHand() {
    return cards.size();
  }

  public void addCardsToHand(List<Card> newCards) {
    cards.addAll(newCards);
  }
}
