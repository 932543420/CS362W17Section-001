/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:41:10 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Board;
import dominion.Card;
import dominion.Player;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((Board) null, 11);
      player0.removeTreasure();
      player0.showPoubelle();
      player0.showHand();
      List<Card> list0 = player0.poubelle;
      player0.deck = list0;
      player0.mix();
      player0.showPoubelle();
      player0.getMoney();
      player0.defausse = list0;
      Card card0 = new Card(11);
      // Undeclared exception!
      try { 
        player0.play(card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Board board0 = new Board(0);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      board0.embargo = intArray0;
      Player player0 = new Player(board0, (-929));
      player0.showPoubelle();
      int[] intArray1 = new int[7];
      player0.showHand();
      intArray1[0] = 0;
      Card[] cardArray0 = new Card[1];
      Card card0 = board0.giveCard(2);
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      intArray1[1] = (-929);
      intArray1[2] = 0;
      intArray1[3] = 0;
      Card card1 = board0.giveCard(0);
      intArray1[4] = (-929);
      intArray1[5] = 0;
      intArray1[6] = 0;
      card1.valeur = 0;
      board0.pioche_number = intArray1;
      player0.clear();
      player0.showPoubelle();
      player0.displayAction();
      player0.hand = null;
      player0.mix();
      player0.getAction();
      // Undeclared exception!
      try { 
        player0.showHand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Board board0 = new Board(611);
      int[] intArray0 = new int[7];
      intArray0[0] = 611;
      intArray0[1] = 611;
      intArray0[2] = 611;
      intArray0[3] = 611;
      intArray0[4] = 611;
      intArray0[5] = 611;
      intArray0[6] = 611;
      board0.pioche_number = intArray0;
      Player player0 = new Player(board0, (-131));
      Card card0 = board0.giveCard(611);
      Board board1 = new Board(295);
      Player player1 = new Player(board1, 611);
      List<Card> list0 = player0.hand;
      player0.deck = list0;
      List<Card> list1 = player1.defausse;
      player0.poubelle = list1;
      player0.play(card0);
      player0.showBoard();
      player0.playTreasure();
      player0.draw();
      board1.copperToTrash = board0.embargo;
      Player player2 = new Player(board0, 0);
      player2.getScore();
      board1.pioche_card = board0.pioche_card;
      player1.gameTurn();
      player2.clear();
      player0.defausse = null;
      // Undeclared exception!
      try { 
        player0.getScore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Board board0 = new Board((-475));
      int[] intArray0 = new int[2];
      Card card0 = board0.giveCard((-475));
      intArray0[0] = (-475);
      intArray0[1] = (-475);
      board0.embargo = intArray0;
      Player player0 = new Player(board0, 7);
      player0.removeTreasure();
      player0.play(card0);
      player0.clear();
      board0.pioche_number = intArray0;
      player0.getAction();
      player0.showHand();
      player0.showBoard();
      player0.getScore();
      player0.achat(0, board0);
      player0.hand = null;
      player0.getAction();
      player0.play(card0);
      player0.getMoney();
      board0.pioche_number = intArray0;
      // Undeclared exception!
      try { 
        player0.playTreasure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((Board) null, 0);
      player0.hand = null;
      Board board0 = new Board((-448));
      Card card0 = board0.giveCard((-448));
      player0.play(card0);
      // Undeclared exception!
      try { 
        player0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Board board0 = new Board((-1043));
      Player player0 = new Player(board0, (-353));
      player0.getScore();
      Board board1 = new Board((-1043));
      Card card0 = board1.giveCard(7);
      player0.play(card0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Board board0 = new Board((-3659));
      Player player0 = new Player(board0, (-3386));
      player0.showPoubelle();
      player0.showHand();
      Card card0 = new Card((-3659));
      card0.print();
      Card card1 = board0.giveCard((-3659));
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      card0.pointVictoire = 0;
      intArray0[1] = 1956;
      card1.print();
      card1.type = "";
      intArray0[2] = (-3386);
      intArray0[3] = (-3659);
      intArray0[4] = (-3386);
      board0.pioche_number = intArray0;
      card1.print();
      card0.valeur = 0;
      board0.giveCard((-3386));
      card0.pointVictoire = 0;
      player0.play(card0);
      Player player1 = new Player(board0, 0);
      player1.achat(0, board0);
      player1.getMoney();
      player1.getAction();
      List<Card> list0 = player1.poubelle;
      player1.displayAction();
      player1.getScore();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Random.setNextRandom(3);
      Board board0 = new Board((-6));
      Player player0 = new Player(board0, 4);
      player0.gameTurn();
      Card card0 = board0.giveCard(3);
      int[] intArray0 = new int[1];
      board0.pioche_number = intArray0;
      intArray0[0] = 1;
      board0.pioche_number = intArray0;
      player0.getScore();
      player0.showBoard();
      player0.showHand();
      player0.draw();
      player0.play(card0);
      Player player1 = new Player(board0, (-6));
      player1.showHand();
      List<Card> list0 = player1.poubelle;
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Board board0 = new Board(0);
      Player player0 = new Player(board0, 0);
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      List<Card> list1 = player0.poubelle;
      player0.defausse = list1;
      // Undeclared exception!
      try { 
        player0.getScore();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((Board) null, (-1));
      player0.gameTurn();
      List<Card> list0 = player0.hand;
      player0.defausse = list0;
      player0.showHand();
      player0.showPoubelle();
      // Undeclared exception!
      try { 
        player0.achat(5, (Board) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((Board) null, (-1342));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.displayAction();
      player0.hand = (List<Card>) linkedList0;
      Card card0 = new Card(6);
      card0.id = (-1342);
      linkedList0.add(card0);
      player0.removeTreasure();
      player0.playTreasure();
      player0.poubelle = (List<Card>) linkedList0;
      player0.showHand();
      player0.mix();
      // Undeclared exception!
      try { 
        player0.gameTurn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Board board0 = new Board((-5267));
      int[] intArray0 = new int[0];
      board0.pioche_number = intArray0;
      Card[] cardArray0 = new Card[1];
      Card card0 = board0.giveCard(591);
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      Player player0 = new Player(board0, 17);
      player0.mix();
      player0.getAction();
      List<Card> list0 = player0.poubelle;
      player0.deck = list0;
      player0.getScore();
      player0.showHand();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Board board0 = new Board(0);
      board0.copperToTrash = null;
      Player player0 = new Player(board0, (-335));
      board0.embargo = null;
      List<Card> list0 = player0.defausse;
      player0.hand = list0;
      player0.removeTreasure();
      player0.gameTurn();
      board0.copperToTrash = null;
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.displayAction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((Board) null, (-743));
      player0.clear();
      player0.getScore();
      player0.playTreasure();
      // Undeclared exception!
      try { 
        player0.showBoard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Board board0 = new Board(4);
      int[] intArray0 = new int[6];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[2] = 4;
      intArray0[3] = 4;
      intArray0[4] = 4;
      intArray0[5] = 4;
      board0.copperToTrash = intArray0;
      Player player0 = new Player(board0, 4);
      Card card0 = board0.giveCard((-2671));
      card0.id = 4;
      player0.play(card0);
      card0.type = "..";
      player0.achat(0, board0);
      player0.deck = null;
      player0.showBoard();
      // Undeclared exception!
      try { 
        player0.gameTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Board board0 = new Board((-2233));
      Player player0 = new Player(board0, (-858));
      player0.gameTurn();
      player0.displayAction();
      player0.gameTurn();
      int[] intArray0 = new int[2];
      intArray0[0] = (-2233);
      intArray0[1] = (-858);
      board0.copperToTrash = intArray0;
      player0.playTreasure();
      player0.achat(0, board0);
      board0.copperToTrash = intArray0;
      Player player1 = new Player(board0, 0);
      player0.clear();
      player1.getScore();
      player0.showPoubelle();
      player1.draw();
      player0.removeTreasure();
      player1.showBoard();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Board board0 = new Board(2222);
      Player player0 = new Player(board0, 0);
      player0.getScore();
      player0.achat(0, board0);
      player0.showBoard();
      player0.gameTurn();
      player0.showBoard();
      // Undeclared exception!
      try { 
        player0.achat((-132), board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -132
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Board board0 = new Board(3309);
      board0.copperToTrash = board0.pioche_number;
      Player player0 = new Player(board0, 3309);
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      player0.removeTreasure();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Board board0 = new Board(2998);
      Player player0 = new Player(board0, 2998);
      player0.removeTreasure();
      player0.getMoney();
      player0.gameTurn();
      Card card0 = board0.giveCard(0);
      card0.prix = 4;
      card0.print();
      card0.id = (-2061);
      List<Card> list0 = player0.defausse;
      card0.print();
      card0.valeur = 2998;
      player0.defausse = list0;
      player0.draw();
      player0.play(card0);
      player0.getMoney();
      player0.mix();
      player0.gameTurn();
      // Undeclared exception!
      try { 
        player0.achat(2998, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2998
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((Board) null, (-2379));
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.draw();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Board board0 = new Board(0);
      Player player0 = new Player(board0, 7);
      List<Card> list0 = player0.poubelle;
      player0.deck = list0;
      board0.giveCard((-1400));
      Card card0 = board0.giveCard(7);
      card0.type = null;
      card0.type = "";
      player0.play(card0);
      player0.getAchat();
      player0.showHand();
      player0.getAction();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Board board0 = new Board(1000);
      Player player0 = new Player(board0, (-681));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card card0 = new Card(1000);
      linkedList0.addFirst(card0);
      Card card1 = board0.giveCard(30);
      card1.type = "8X";
      card1.print();
      linkedList0.add(card1);
      player0.showBoard();
      player0.defausse = (List<Card>) linkedList0;
      player0.getScore();
      player0.getAchat();
      player0.draw();
      player0.showHand();
      int int0 = (-2119);
      // Undeclared exception!
      try { 
        linkedList0.subList(1, (-2119));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(1) > toIndex(-2119)
         //
         assertThrownBy("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Board board0 = new Board((-4302));
      Player player0 = new Player(board0, (-4302));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.defausse = (List<Card>) linkedList0;
      player0.clear();
      Player player1 = new Player(board0, 3);
      player1.achat(6, board0);
      List<Card> list0 = player1.deck;
      player1.deck = player0.defausse;
      player0.showBoard();
      player0.hand = player1.hand;
      Card card0 = board0.giveCard(6);
      card0.id = 0;
      card0.id = 1000;
      player1.play(card0);
      player1.getMoney();
      Player player2 = new Player(board0, (-4302));
      player1.gameTurn();
      player1.draw();
      List<Card> list1 = player1.poubelle;
      List<Card> list2 = player0.hand;
      Player player3 = new Player(board0, (-4302));
      List<Card> list3 = player3.defausse;
      player0.getAction();
      List<Card> list4 = player2.poubelle;
      player2.draw();
      player0.defausse = list4;
      player2.displayAction();
      player1.getScore();
      player1.removeTreasure();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Board board0 = new Board(0);
      Player player0 = new Player(board0, 16);
      board0.giveCard((-1400));
      int[] intArray0 = new int[0];
      board0.copperToTrash = intArray0;
      Card card0 = board0.giveCard(16);
      card0.type = "";
      board0.copperToTrash = intArray0;
      player0.play(card0);
      player0.getAchat();
      player0.showHand();
      player0.showBoard();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Board board0 = new Board(2518);
      Player player0 = new Player(board0, 2518);
      player0.gameTurn();
      player0.showHand();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = (List<Card>) linkedList0;
      player0.showHand();
      player0.showHand();
      List<Card> list0 = player0.poubelle;
      Card card0 = board0.giveCard(2518);
      linkedList0.add(card0);
      player0.hand = list0;
      player0.removeTreasure();
      player0.playTreasure();
      board0.giveCard(0);
      player0.showBoard();
      player0.showBoard();
      player0.playTreasure();
      player0.draw();
      player0.showHand();
      player0.displayAction();
      List<Card> list1 = player0.deck;
      player0.mix();
      // Undeclared exception!
      try { 
        player0.clear();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Board board0 = new Board(2518);
      Player player0 = new Player(board0, 2518);
      player0.gameTurn();
      player0.showHand();
      List<Card> list0 = player0.hand;
      player0.deck = list0;
      player0.showHand();
      player0.showHand();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.hand = (List<Card>) linkedList0;
      player0.showBoard();
      player0.removeTreasure();
      player0.playTreasure();
      player0.showBoard();
      Card card0 = new Card(2518);
      linkedList0.add(card0);
      player0.showBoard();
      player0.playTreasure();
      player0.draw();
      player0.showHand();
      player0.displayAction();
      List<Card> list1 = player0.deck;
      player0.mix();
      player0.clear();
      // Undeclared exception!
      try { 
        player0.play((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Board board0 = new Board((-1478));
      Player player0 = new Player(board0, (-1478));
      player0.displayAction();
      player0.getAction();
      player0.achat(1, board0);
      player0.getScore();
      player0.gameTurn();
      Card card0 = board0.giveCard((-1478));
      player0.play(card0);
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.mix();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Board board0 = new Board(0);
      Player player0 = new Player(board0, 7);
      player0.gameTurn();
      List<Card> list0 = player0.poubelle;
      player0.deck = list0;
      board0.giveCard((-1400));
      int[] intArray0 = new int[2];
      board0.copperToTrash = intArray0;
      Card card0 = board0.giveCard(7);
      card0.type = null;
      card0.type = "";
      player0.play(card0);
      player0.getAchat();
      player0.showHand();
      player0.getAction();
      player0.showHand();
      assertEquals(0, player0.getAction());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Board board0 = new Board((-2233));
      Player player0 = new Player(board0, (-858));
      player0.gameTurn();
      player0.displayAction();
      player0.gameTurn();
      int[] intArray0 = new int[2];
      intArray0[0] = (-2233);
      intArray0[1] = (-858);
      board0.copperToTrash = intArray0;
      player0.playTreasure();
      player0.achat(13, board0);
      board0.copperToTrash = intArray0;
      Player player1 = new Player(board0, 13);
      player0.clear();
      player1.getScore();
      Card[] cardArray0 = new Card[1];
      Card card0 = board0.giveCard((-1379));
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      player0.showPoubelle();
      player1.draw();
      player0.removeTreasure();
      player1.showBoard();
      Player player2 = new Player(board0, (-623));
      Random.setNextRandom((-2233));
      // Undeclared exception!
      try { 
        player0.gameTurn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }
}
