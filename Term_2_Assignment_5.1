import java.util.*;
import java.lang.*;

public class GameWheel {
  private ArrayList<PrizeCard> prizeCards;
  private int currentPos;

  public GameWheel() {
    currentPos = 0;
    prizeCards = initGameWheel();
    prizeCards = scramble();
  }

  public ArrayList<PrizeCard> initGameWheel() {
    ArrayList<PrizeCard> init = new ArrayList<PrizeCard>();
    for (int i=1; i <= 40; i++) {
      if (i%2 == 1)
        init.add(new PrizeCard(i, "red", i*10));
      else if (i%10 == 0)
        init.add(new PrizeCard(i, "black", i*200));
      else
        init.add(new PrizeCard(i, "blue", i*100));
    }
    return init;
  }

  public ArrayList<PrizeCard> getPrizeCards() {
    return prizeCards;
  }

  public ArrayList<PrizeCard> scramble() {
    // Create temp ArrayList to hold PrizeCards, specific to color
    ArrayList<PrizeCard> scrambledRed = new ArrayList<PrizeCard>();
    ArrayList<PrizeCard> scrambledBlue = new ArrayList<PrizeCard>();
    ArrayList<PrizeCard> scrambledBlack = new ArrayList<PrizeCard>();
    // Combine temp ArrayLists at end to form complete Prize Wheel
    ArrayList<PrizeCard> scrambled = new ArrayList<PrizeCard>();

    while (prizeCards.size() != 0) {
      // Randomly choose a PrizeCard from wheel
      int index = (int)(Math.random()*prizeCards.size());
      PrizeCard prizeCard = prizeCards.get(index);

      // Check PrizeCard's ID to determine which temp
      // ArrayList to store in
      if (prizeCard.getID()%2 == 1)
        scrambledRed.add(prizeCard);
      else if (prizeCard.getID()%10 == 0)
        scrambledBlack.add(prizeCard);
      else
        scrambledBlue.add(prizeCard);
      prizeCards.remove(index);
    }

    // Combine temp ArrayList
    for (int i=1; i<=40; i++) {
      if (i%2 == 1) {
        if (!scrambledRed.isEmpty()) {
          scrambled.add(scrambledRed.get(0));
          scrambledRed.remove(0);
        }
      }
      else if (i%10 == 0) {
        if (!scrambledBlack.isEmpty()) {
          scrambled.add(scrambledBlack.get(0));
          scrambledBlack.remove(0);
        }
      }
      else {
        if (!scrambledBlue.isEmpty()) {
          scrambled.add(scrambledBlue.get(0));
          scrambledBlue.remove(0);
        }
      }
    }
    return scrambled;
  }

  public PrizeCard spinWheel() {
    //spin power between range of 1-100 (inclusive)
    int power = (int)(Math.random()*100 + 1);
    int newPos = (currentPos + power) % prizeCards.size();
    currentPos = newPos;
    return prizeCards.get(currentPos);
  }

}
