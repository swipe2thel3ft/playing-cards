package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.Collection;

public class BlackJackHand extends Hand<Card> {

  private final boolean dealer;

  public BlackJackHand(boolean dealer) {
    super();
    this.dealer = dealer;
  }

  public BlackJackHand(boolean dealer, Collection<Card> source) {
    super(source);
    this.dealer = dealer;
  }

  public boolean isDealer() {
    return dealer;
  }

}
