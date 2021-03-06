/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 23:44:38 GMT 2017
 */

package Dominion.RandomTestDominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Dominion.RandomTestDominion.Board;
import Dominion.RandomTestDominion.Card;
import Dominion.RandomTestDominion.Player;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((-1046));
      Board board0 = new Board((-1));
      player0.hand = player0.deck;
      Card card0 = new Card("Great Hall");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      List<Card> list0 = player0.shuffle(linkedList0);
      player0.gain(card0, list0);
      player0.trash(card0);
      player0.discard = (List<Card>) linkedList0;
      int int0 = player0.purchases;
      player0.gain(card0, list0);
      player0.discardAll(player0.deck);
      List<Card> list1 = player0.shuffle(player0.hand);
      player0.trash(card0);
      player0.trash(card0);
      Board board1 = new Board(236);
      List<Card> list2 = board1.supply;
      player0.discardAll(list2);
      player0.hand = list1;
      Random.setNextRandom(7);
      player0.gain(card0, list2);
      Random.setNextRandom(236);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((-5217));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.shuffle(linkedList0);
      List<Player> list0 = player0.opponents;
      player0.opponents = list0;
      int int0 = player0.playerNum;
      Card.draw(linkedList0, linkedList0, (-5217));
      player0.turnMoney = 0;
      Board board0 = new Board(195);
      List<Card> list1 = board0.supply;
      List<Card> list2 = player0.shuffle(list1);
      linkedList0.add((Card) null);
      Card.draw(linkedList0, list2, (-5217));
      player0.turnMoney = player0.turnMoney;
      player0.playerNum = (-5217);
      List<Card> list3 = player0.hand;
      player0.playK("Feast", board0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player(0);
      List<Card> list0 = player0.deck;
      player0.discard = list0;
      Board board0 = new Board(0);
      Card card0 = new Card("Treasure", 0);
      player0.discard(card0);
      player0.actions = 0;
      player0.playK("Adventurer", board0);
      List<Card> list1 = player0.discard;
      player0.gain(card0, list1);
      player0.playK("Adventurer", board0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player(16);
      List<Card> list0 = player0.deck;
      Player.readCards(list0);
      player0.hand = list0;
      Board board0 = new Board(6);
      player0.turn(board0, "-r_k,VtB*:");
      List<Card> list1 = player0.discard;
      Card card0 = new Card("-r_k,VtB*:");
      player0.trash(card0);
      player0.playK("Mine", (Board) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(0);
      List<Card> list0 = player0.deck;
      Player.readCards(list0);
      player0.playerNum = (-1955);
      Board board0 = new Board(0);
      Player player1 = new Player(0);
      List<Card> list1 = player1.hand;
      board0.supply = list1;
      player0.playK("Baron", board0);
      player0.playK("f2RDq,uh", board0);
      player0.actions = 0;
      player0.playK("", board0);
      player0.drawDeck((-315));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player(4094);
      player0.drawDeck(4094);
      player0.discard = null;
      Card card0 = new Card("N5$d");
      player0.actions = 4094;
      card0.buy(player0, 4094);
      card0.buy(player0, (-4786));
      // Undeclared exception!
      try { 
        player0.drawDeck(4094);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((-1189));
      List<Card> list0 = player0.hand;
      Card card0 = new Card(".#>My]a#%8=FD5ozT-+", (-1189));
      card0.action(player0, 0);
      player0.gain(card0, list0);
      Player.readCards(list0);
      player0.discardAll(list0);
      int int0 = player0.purchases;
      int int1 = player0.turnMoney;
      Board board0 = new Board(5);
      player0.playK("Council Room", board0);
      player0.playK("]^KFy3[^4|Q4sCyU", board0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Player.readCards(linkedList0);
      Card card0 = new Card("[O>Xdop");
      linkedList0.offerFirst(card0);
      Player player0 = new Player((-463));
      Card card1 = new Card("c,#`{GqrY?};a>J1-");
      player0.gain(card1, linkedList0);
      Board board0 = new Board(0);
      player0.turn(board0, "c,#`{GqrY?};a>J1-");
      player0.hand = player0.discard;
      player0.trash(card1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player(0);
      player0.playerNum = 0;
      player0.purchases = 0;
      Board board0 = new Board(0);
      Card card0 = new Card("Treasure");
      player0.discard(card0);
      player0.turn(board0, "Wm6:g<EsXrS");
      player0.actions = 0;
      player0.playK("Adventurer", board0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((-21));
      Card card0 = new Card("Adventurer");
      player0.trash(card0);
      Player.readCards(player0.discard);
      Board board0 = new Board(0);
      player0.playK("Adventurer", board0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player(1731);
      Card card0 = new Card("", 803);
      card0.buy(player0, 6);
      player0.trash(card0);
      Board board0 = new Board(803);
      board0.gameEnd();
      int[] intArray0 = new int[2];
      intArray0[0] = 1731;
      intArray0[1] = 0;
      board0.em = intArray0;
      player0.playK("", board0);
      Card card1 = new Card("");
      card1.buy(player0, 0);
      Card card2 = new Card("");
      Card.move(card2, board0.supply, board0.supply);
      board0.available(0);
      player0.shuffle(board0.supply);
      player0.gain(card1, board0.curse);
      player0.trash(card0);
      int int0 = player0.actions;
      List<Player> list0 = player0.opponents;
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add(card2);
      linkedList0.removeAll(player0.deck);
      Player.readCards(linkedList0);
      Player.readCards(board0.curse);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player(2610);
      player0.turnMoney = 2009;
      Board board0 = new Board(1);
      board0.curse = player0.hand;
      int[] intArray0 = new int[0];
      board0.em = intArray0;
      // Undeclared exception!
      try { 
        player0.turn(board0, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("Dominion.RandomTestDominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Player.readCards(linkedList0);
      Player player0 = new Player((-463));
      Card card0 = new Card("c,#`{GqrY?};a>J1-");
      player0.gain(card0, linkedList0);
      Board board0 = new Board(0);
      List<Card> list0 = board0.curse;
      board0.supply = list0;
      player0.turn(board0, "c,#`{GqrY?};a>J1-");
      player0.hand = player0.discard;
      player0.discard = (List<Card>) linkedList0;
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Player.readCards((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player(5);
      Card card0 = new Card("xj^Y[U}5");
      player0.trash(card0);
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.discardAll((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((-631));
      player0.purchases = (-631);
      player0.actions = (-2967);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add((Card) null);
      linkedList0.pollLast();
      player0.shuffle(linkedList0);
      List<Player> list0 = player0.opponents;
      player0.getMoney();
      // Undeclared exception!
      try { 
        player0.discard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player(0);
      List<Card> list0 = player0.hand;
      player0.discardAll(list0);
      int int0 = player0.actions;
      player0.drawDeck((-462));
      Player player1 = new Player((-3454));
      player0.deck = player1.deck;
      int int1 = player0.actions;
      player1.playerNum = (-959);
      player0.drawDeck(0);
      Board board0 = new Board((-400));
      board0.gameEnd();
      player0.playK("Embargo", board0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((-2243));
      Card card0 = new Card((String) null);
      player0.discard(card0);
      // Undeclared exception!
      try { 
        player0.shuffle((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Random.setNextRandom(16);
      Player player0 = new Player(16);
      Card card0 = new Card("", 16);
      Board board0 = new Board(0);
      player0.turn(board0, "");
      player0.trash(card0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player(953);
      List<Card> list0 = player0.deck;
      player0.discardAll(list0);
      Player.readCards(list0);
      player0.getMoney();
      Card card0 = new Card("Copper");
      player0.trash(card0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player(1620);
      player0.getMoney();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player(31);
      player0.purchases = 31;
      int int0 = player0.vPoints;
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      Board board0 = new Board(31);
      board0.available(0);
      board0.kList = null;
      player0.playK("Great Hall", board0);
      player0.opponents = (List<Player>) linkedList0;
      List<Card> list0 = player0.hand;
      player0.playerNum = 31;
      List<Card> list1 = player0.discard;
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((-1643));
      List<Card> list0 = player0.discard;
      Card card0 = new Card("ug");
      player0.discard(card0);
      Card card1 = new Card("Minion");
      player0.gain(card1, list0);
      player0.vPoints = (-1643);
      Board board0 = new Board(3);
      player0.playK("Minion", board0);
      player0.turn(board0, "ug");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(1195);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.shuffle(linkedList0);
      List<Player> list0 = player0.opponents;
      player0.opponents = list0;
      int int0 = player0.playerNum;
      Card.draw(linkedList0, linkedList0, 1195);
      player0.turnMoney = 0;
      Board board0 = new Board(195);
      List<Card> list1 = board0.supply;
      List<Card> list2 = player0.shuffle(list1);
      linkedList0.add((Card) null);
      Card.draw(linkedList0, list2, 1195);
      player0.turnMoney = player0.turnMoney;
      player0.playerNum = 1195;
      List<Card> list3 = player0.hand;
      Board board1 = new Board((-2619));
      player0.playK("Feast", board1);
      player0.getMoney();
      player0.actions = 5;
      // Undeclared exception!
      try { 
        player0.trash((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((-1046));
      Board board0 = new Board((-1));
      List<Card> list0 = board0.supply;
      player0.hand = list0;
      Card card0 = new Card("Great Hall");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      List<Card> list1 = player0.shuffle(linkedList0);
      player0.gain(card0, list1);
      player0.trash(card0);
      player0.discard = (List<Card>) linkedList0;
      int int0 = player0.purchases;
      player0.gain(card0, list1);
      // Undeclared exception!
      player0.discardAll(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player(0);
      List<Card> list0 = player0.discard;
      player0.deck = list0;
      player0.playerNum = 0;
      player0.drawDeck(1744);
      Board board0 = new Board((-516));
      board0.gameEnd();
      List<Player> list1 = player0.opponents;
      Player player1 = new Player(0);
      player1.playK("Player  drew a ", board0);
      player1.playK("Ambassador", board0);
      Player player2 = new Player(0);
      Card card0 = new Card((String) null);
      player2.gain(card0, player0.deck);
      int int0 = player2.actions;
      Player player3 = new Player(5);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player3.deck = (List<Card>) linkedList0;
      player3.drawDeck(0);
      player2.getMoney();
      int int1 = player2.actions;
      int int2 = player2.actions;
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player(16);
      List<Card> list0 = player0.deck;
      Player.readCards(list0);
      player0.hand = list0;
      Board board0 = new Board(6);
      player0.turn(board0, "-r_k,VtB*:");
      List<Card> list1 = player0.discard;
      Card card0 = new Card("-r_k,VtB*:");
      player0.trash(card0);
      player0.playK("Mine", board0);
      Player player1 = new Player(0);
      List<Card> list2 = player1.deck;
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player(16);
      player0.getMoney();
      Board board0 = new Board(60);
      Player player1 = new Player(0);
      player1.discard = player0.deck;
      List<Card> list0 = player1.shuffle(player0.hand);
      board0.supply = list0;
      List<String> list1 = board0.kList;
      board0.embargo = list1;
      player0.turn(board0, "l-Xm3j8$O");
      board0.embargo = list1;
      player0.vPoints = 0;
      player0.turn(board0, "}k:E4lI2v#~^Q_a ");
      player0.vPoints = (-1463);
      Card card0 = new Card("l-Xm3j8$O", 2315);
      List<Card> list2 = player0.hand;
      player1.discardAll(list2);
      player0.discard(card0);
      player0.drawDeck(2176);
      Player.readCards(list0);
      List<Card> list3 = player1.deck;
      Player player2 = new Player(987);
      player0.deck = player2.discard;
      player0.discardAll(list3);
      player2.turn(board0, "}k:E4lI2v#~^Q_a ");
      List<Card> list4 = player2.discard;
      player2.turn(board0, "}k:E4lI2v#~^Q_a ");
      player2.playerNum = 2;
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player(0);
      List<Card> list0 = player0.deck;
      Player.readCards(list0);
      player0.vPoints = (-1955);
      Board board0 = new Board(0);
      player0.playK("Baron", board0);
      player0.playK("Baron", board0);
      player0.actions = 0;
      player0.playK("", board0);
      player0.drawDeck((-315));
      Player player1 = new Player(0);
      int int0 = player1.turnMoney;
      Player.readCards(player1.hand);
      player1.opponents = player0.opponents;
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(2);
      List<Card> list0 = player0.deck;
      Player.readCards(list0);
      player0.vPoints = (-1955);
      Board board0 = new Board(0);
      player0.playK("Baron", board0);
      player0.playK("Baron", board0);
      board0.gameEnd();
      player0.actions = 0;
      player0.playK("", board0);
      player0.drawDeck((-315));
      Player player1 = new Player(0);
      int int0 = player1.turnMoney;
      player0.discardAll(player1.discard);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player(68);
      player0.turnMoney = 68;
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = (List<Card>) linkedList0;
      int int0 = 557;
      // Undeclared exception!
      try { 
        player0.turn((Board) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Dominion.RandomTestDominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player(0);
      player0.playerNum = 0;
      List<Card> list0 = player0.deck;
      player0.discard = list0;
      player0.playerNum = 0;
      Board board0 = new Board(0);
      Card card0 = new Card("Treasure", 0);
      player0.discard(card0);
      player0.turn(board0, "Wm6:g<EsXrS");
      player0.actions = 0;
      player0.playK("Adventurer", board0);
      List<Card> list1 = player0.discard;
      player0.hand = list1;
      player0.gain(card0, list1);
      player0.playerNum = 0;
      player0.playK("Adventurer", board0);
      player0.turnMoney = 5;
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player(16);
      Board board0 = new Board(0);
      List<Card> list0 = board0.curse;
      List<String> list1 = board0.embargo;
      board0.embargo = list1;
      List<Card> list2 = player0.shuffle(list0);
      int int0 = 0;
      player0.drawDeck(0);
      player0.shuffle(board0.curse);
      List<Card> list3 = board0.supply;
      player0.playerNum = 16;
      Player.readCards(list3);
      player0.hand = list3;
      player0.getMoney();
      List<Card> list4 = player0.shuffle(list2);
      player0.playK("FC9U", board0);
      player0.discardAll(list4);
      board0.available(0);
      String string0 = ">";
      // Undeclared exception!
      player0.turn(board0, ">");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((-3071));
      Card card0 = new Card("?ED7d\")`RWC).\"L~\"nu");
      player0.discard(card0);
      Card card1 = new Card("Gardens", 16);
      card1.action(player0, 0);
      Board board0 = new Board((-3071));
      player0.turn(board0, "Gardens");
      // Undeclared exception!
      try { 
        player0.gain(card1, (List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
