package card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeckTest {
  @Test
  void testCanCreateDeck() {
    Deck deck = new Deck();
    assertEquals(52, deck.getCardsLeftInDeck());
  }
}
