package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private final List<Card> cards = new ArrayList<>();

  public Deck() {
    for (Suit suit : Suit.values()) {
      for (Value value : Value.values()) {
        Card card = new Card(value, suit);
        cards.add(card);
      }
    }
  }

  public int getCardsLeftInDeck() {
    return cards.size();
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card dealCard() {
    return cards.remove(0);
  }
}
