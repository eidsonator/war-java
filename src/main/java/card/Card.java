package card;

public class Card {
  private final Suit suit;
  private final Value value;

  Card(Value value, Suit suit) {
    this.suit = suit;
    this.value = value;
  }

  public Suit getSuit() {
    return suit;
  }

  public Value getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.format("%s of %s", value, suit);
  }
}
