package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.Comparator;

public class BlackJackComparator implements Comparator<Hand<Card>> {

  @Override
  public int compare(Hand<Card> hand1, Hand<Card> hand2) {
    return 0; // TODO IMPLEMENT (consider a helper method that computes a numeric value for a single
    // hand, then compare the 2 numeric values)
    // Rules:
    // - No dealer (e.g. blackjack vs blackjack is a push)
    // - Zero cards beats a bust.
    // - 2-card 21 (Blackjack) beats a 3+-card 21.
    // - Ace can be soft (11) or hard(1). Hint: in any hand, only a single Ace (at most) can be soft.
  }
}


  public Card(Rank rank) {
    this.rank = rank;
  }

//  Hand<Integer> handA = new Hand<>();
 // Hand<Integer> handB = new Hand<>();

  //return handA;
  //return handB;
