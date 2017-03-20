package dominion;

/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:56:33 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Deck_ESTest extends Deck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.treasureCount = (-380);
      // Undeclared exception!
      try { 
        deck0.swap((-380), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Baron baron0 = new Baron();
      baron0.playOrder = (-716);
      Deck deck0 = new Deck((Card) baron0, (-716));
      deck0.getSize();
      deck0.victoryCount = (-1);
      deck0.getSize();
      // Undeclared exception!
      try { 
        deck0.drawTop();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Silver silver0 = new Silver();
      silver0.cost = 1225;
      silver0.print();
      Deck deck0 = new Deck((Card) silver0, 1);
      silver0.print();
      deck0.addCard(silver0);
      deck0.update();
      deck0.update();
      deck0.value = 1;
      silver0.cost = 1225;
      silver0.value = 1;
      deck0.swap(1, 1);
      silver0.actions = (-1944);
      deck0.print();
      deck0.update();
      int int0 = deck0.treasureCount;
      Feast feast0 = new Feast();
      Deck deck1 = new Deck((Card) feast0, 0);
      deck1.value = 0;
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Great_Hall great_Hall0 = new Great_Hall();
      Card.Type card_Type0 = Card.Type.VICTORY;
      great_Hall0.cardType = card_Type0;
      great_Hall0.playOrder = 50;
      Deck deck0 = new Deck((Card) great_Hall0, 4);
      great_Hall0.buys = 0;
      deck0.getTreasure();
      deck0.print();
      deck0.getAction();
      int int0 = deck0.victoryCount;
      deck0.addCard(great_Hall0);
      great_Hall0.points = 4;
      deck0.swap(0, 4);
      deck0.points = 4;
      deck0.drawTop();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gold gold0 = new Gold();
      Deck deck0 = new Deck((Card) gold0, (-603));
      int int0 = deck0.points;
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.Type.values();
      MockRandom mockRandom0 = new MockRandom((long) 0);
      mockRandom0.nextBoolean();
      Player player0 = new Player(0, (Random) mockRandom0);
      Deck deck0 = player0.discard;
      int int0 = deck0.points;
      Deck deck1 = null;
      try {
        deck1 = new Deck((Card) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Deck deck0 = new Deck();
      int int0 = deck0.points;
      List<Card> list0 = deck0.cards;
      deck0.cards = list0;
      // Undeclared exception!
      try { 
        deck0.removeCard((-5192));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.printCards();
      deck0.value = 1;
      deck0.getValue();
      deck0.size = 0;
      int int0 = deck0.value;
      deck0.update();
      deck0.getAction();
      deck0.getAction();
      deck0.getTreasure();
      deck0.getAction();
      Gold gold0 = new Gold();
      gold0.actions = 0;
      gold0.buys = 0;
      deck0.addCard(gold0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      Player player0 = new Player(2402, (Random) mockRandom0);
      Deck deck0 = player0.discard;
      // Undeclared exception!
      try { 
        deck0.drawTop();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.printCards();
      Baron baron0 = new Baron();
      baron0.name = "";
      deck0.size = (-4712);
      Embargo embargo0 = new Embargo();
      deck0.addCard(embargo0);
      baron0.buys = (-4711);
      baron0.name = " Value: ";
      deck0.addCard(baron0);
      deck0.getAction();
      List<Card> list0 = deck0.cards;
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Copper copper0 = new Copper();
      Card.Type card_Type0 = Card.Type.TREASURE;
      copper0.cardType = card_Type0;
      copper0.cardDraw = 0;
      Deck deck0 = new Deck((Card) copper0, 0);
      copper0.cardDraw = 0;
      deck0.getTreasure();
      deck0.embargoes = 11;
      deck0.print();
      deck0.getTreasure();
      deck0.getVictory();
      // Undeclared exception!
      try { 
        deck0.removeCard(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Player player0 = new Player(195, (Random) mockRandom0);
      Deck deck0 = player0.hand;
      deck0.getTreasure();
      deck0.update();
      // Undeclared exception!
      try { 
        deck0.swap(195, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 195, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.getAction();
      deck0.getAction();
      deck0.points = (-1);
      deck0.update();
      Curse curse0 = new Curse();
      curse0.print();
      deck0.addCard(curse0);
      deck0.victoryCount = 0;
      deck0.update();
      String string0 = "";
      deck0.getSize();
      // Undeclared exception!
      try { 
        Card.Type.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant Card.Type.
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Player player0 = new Player(3, (Random) mockRandom0);
      Deck deck0 = player0.draw;
      mockRandom0.setSeed(0L);
      deck0.treasureCount = 0;
      deck0.getSize();
      player0.bonusCoins = 0;
      mockRandom0.nextInt(5);
      player0.getAverageValue();
      player0.discard.value = 0;
      deck0.points = 4137;
      // Undeclared exception!
      try { 
        player0.draw.swap(30, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 30, Size: 10
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.print();
      deck0.print();
      deck0.getVictory();
      Deck deck1 = new Deck();
      deck1.getSize();
      // Undeclared exception!
      try { 
        deck1.removeCard(3828);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3828, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Council_Room council_Room0 = new Council_Room();
      council_Room0.points = (-588);
      int int0 = 0;
      council_Room0.cost = 0;
      Deck deck0 = new Deck((Card) council_Room0, 0);
      List<Card> list0 = deck0.cards;
      deck0.cards = list0;
      deck0.getSize();
      council_Room0.value = 0;
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.longs(0L);
      deck0.shuffle(mockRandom0);
      // Undeclared exception!
      try { 
        deck0.removeCard(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}