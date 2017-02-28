/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 23:28:21 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.Game;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Game_ESTest extends Game_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Estate;
      // Undeclared exception!
      try { 
        game0.buyCard(card0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not enough coins
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = Integer.valueOf(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.playTreasure(5);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        game0.playAction(4, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Random.setNextRandom(3);
      Integer integer0 = new Integer(3);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.reshuffleForTesting(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Curse;
      game0.handCount(1, card0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      game0.getCurrentPlayer();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = Integer.valueOf(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      game0.getCoins();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Card card0 = Card.Copper;
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.buyCard(card0);
      game0.getBuys();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Ambassador;
      // Undeclared exception!
      try { 
        game0.takeForTesting(2997, card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.GreatHall;
      // Undeclared exception!
      try { 
        game0.takeForTesting(2997, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2997, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Estate;
      // Undeclared exception!
      try { 
        game0.takeForTesting((-76), card0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Game.swap((List<Card>) null, 252, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.shuffle(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.shuffle((-847));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.scoreFor(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.scoreFor((-561));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.reshuffleForTesting(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.printHand(12);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 12, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = Integer.valueOf(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.printHand((-23));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = Integer.valueOf(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.printDeck(3098);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3098, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.printDeck((-1173));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Village;
      // Undeclared exception!
      try { 
        game0.handCount(1643, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1643, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.GreatHall;
      // Undeclared exception!
      try { 
        game0.handCount((-289), card0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Curse;
      // Undeclared exception!
      try { 
        game0.fullDeckCount(2989, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2989, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Ambassador;
      // Undeclared exception!
      try { 
        game0.fullDeckCount((-1775), card0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Game.swap((List<Object>) linkedList0, 14, 14);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.shuffle(0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.printDeck(0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.printHand(3);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.scoreFor(1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      game0.fullDeckCount(0, (Card) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Mine;
      game0.fullDeckCount(2, card0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(2);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = game0.handCard(0);
      game0.handCount(0, card0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.supplyCount((Card) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.handCard(2581);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = game0.handCard(4);
      game0.supplyCount(card0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.handCard((-332));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Copper;
      game0.playTreasure(4);
      game0.buyCard(card0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Ambassador;
      // Undeclared exception!
      try { 
        game0.buyCard(card0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // there are no more of that card left
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Curse;
      game0.buyCard(card0);
      // Undeclared exception!
      try { 
        game0.buyCard(card0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // you have no buys left
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.Copper;
      game0.buyCard(card0);
      game0.playTreasure(4);
      assertEquals(4, game0.numHandCards());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.playTreasure(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not a treasure card
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.playTreasure(10);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.playTreasure((-131));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        game0.playAction(0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not an action
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        game0.playAction(4, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not an action
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        game0.playAction((-432), objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      // Undeclared exception!
      try { 
        Game.swap((List<Boolean>) linkedList0, 1975, 2989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1975, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Integer integer0 = new Integer(1204);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // numPlayers must be between 2 and 4
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer((-2277));
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // numPlayers must be between 2 and 4
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Integer integer0 = Integer.decode("6");
      Game game0 = null;
      try {
        game0 = new Game((Integer) null, (List<Card>) linkedList0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // must supply 10 kingdom cards
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.getNumPlayers();
      assertEquals(0, game0.getCurrentPlayer());
      assertEquals(1, game0.getActions());
      assertEquals(5, game0.numHandCards());
      assertEquals(0, game0.getCoins());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = Integer.valueOf(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      int int0 = game0.getCoins();
      assertEquals(1, game0.getBuys());
      assertEquals(0, int0);
      assertEquals(0, game0.getCurrentPlayer());
      assertEquals(5, game0.numHandCards());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.reshuffleForTesting((-1117));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      int int0 = game0.getActions();
      assertEquals(0, game0.getPhase());
      assertEquals(1, int0);
      assertEquals(5, game0.numHandCards());
      assertEquals(0, game0.getCoins());
      assertEquals(0, game0.getCurrentPlayer());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.GreatHall;
      int int0 = game0.takeForTesting(1, card0);
      assertEquals(0, game0.getCoins());
      assertEquals(5, game0.numHandCards());
      assertEquals(5, int0);
      assertEquals(1, game0.getBuys());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      int int0 = game0.getCurrentPlayer();
      assertEquals(0, game0.getPhase());
      assertEquals(0, int0);
      assertEquals(5, game0.numHandCards());
      assertEquals(1, game0.getBuys());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      assertEquals(10, arrayList0.size());
      
      Integer integer0 = new Integer(2);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.getPhase();
      assertEquals(1, game0.getActions());
      assertEquals(0, game0.getCurrentPlayer());
      assertEquals(5, game0.numHandCards());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      int int0 = game0.numHandCards();
      assertEquals(0, game0.getPhase());
      assertEquals(5, int0);
      assertEquals(1, game0.getActions());
      assertEquals(0, game0.getCoins());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      int int0 = game0.getBuys();
      assertEquals(5, game0.numHandCards());
      assertEquals(0, game0.getCoins());
      assertEquals(1, int0);
      assertEquals(1, game0.getActions());
  }
}
