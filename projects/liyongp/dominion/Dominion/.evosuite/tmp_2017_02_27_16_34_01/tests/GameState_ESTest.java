/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 00:42:11 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.play();
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      vector0.trimToSize();
      Player player0 = new Player(gameState0, "4'q:t#I#");
      Player player1 = player0.clone();
      player0.drawCard();
      player1.toString();
      Integer integer0 = new Integer(1);
      Card.createCards();
      hashMap0.put((Card) null, integer0);
      player1.drawCard();
      gameState0.addPlayer(player1);
      gameState0.gameBoard = hashMap0;
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "");
      stack0.stream();
      player0.coins = (-26);
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      player1.player_username = "";
      gameState0.toString();
      player1.coins = (-26);
      gameState0.play();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      player0.discard((Card) null);
      gameState0.isGameOver();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      player0.drawCard();
      Random.setNextRandom((-2063));
      player0.hand = (List<Card>) stack0;
      Random.setNextRandom((-2063));
      Integer integer0 = new Integer((-26));
      hashMap0.put((Card) null, integer0);
      Random.setNextRandom(30);
      player1.toString();
      Vector<Player> vector0 = new Vector<Player>();
      gameState0.players = (List<Player>) vector0;
      gameState0.play();
      List<Card> list0 = gameState0.cards;
      Random.setNextRandom(354);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "");
      stack0.stream();
      player0.coins = 1;
      Player player1 = player0.clone();
      player1.numBuys = 4;
      gameState0.addPlayer(player1);
      player1.player_username = "";
      gameState0.toString();
      player1.coins = 1;
      gameState0.play();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      player0.discard((Card) null);
      gameState0.isGameOver();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      player0.drawCard();
      Random.setNextRandom((-2063));
      player0.hand = (List<Card>) stack0;
      Random.setNextRandom((-2063));
      Integer integer0 = new Integer(1);
      hashMap0.put((Card) null, integer0);
      Random.setNextRandom(30);
      player1.toString();
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player1);
      gameState0.players = (List<Player>) vector0;
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 13
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.Type.values();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      GameState gameState1 = gameState0.clone();
      gameState0.toString();
      gameState0.play();
      gameState0.toString();
      gameState1.initializeGame();
      gameState1.gameBoard = gameState0.gameBoard;
      Player player0 = new Player(gameState0, "The board game is embty you need to intialize the game!!!!");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      player1.playKingdomCard();
      gameState0.addPlayer(player0);
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Randomness.reset((-1364L));
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "DN=CHfVzkB{");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      gameState0.cards = (List<Card>) arrayList0;
      Card.Type.values();
      gameState0.getWinners();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.Type.values();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.clone();
      GameState gameState1 = gameState0.clone();
      gameState0.toString();
      Player player0 = new Player(gameState1, "yMD`u8z]");
      Player player1 = player0.clone();
      player1.drawCard();
      linkedList0.add((Card) null);
      gameState1.play();
      linkedList0.pollLast();
      gameState1.cards = null;
      // Undeclared exception!
      try { 
        gameState1.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(stack0, card_Type0);
      GameState gameState0 = new GameState(list0);
      gameState0.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(arrayList0, card_CardName0);
      arrayList0.add((Card) null);
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "");
      stack0.stream();
      player0.coins = 1;
      Player player1 = player0.clone();
      player1.player_username = "";
      gameState0.addPlayer(player1);
      gameState0.toString();
      player1.coins = 1;
      gameState0.isGameOver();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      player0.drawCard();
      Random.setNextRandom((-2063));
      player0.hand = (List<Card>) stack0;
      Random.setNextRandom((-2063));
      Integer integer0 = new Integer(1);
      hashMap0.put((Card) null, integer0);
      Random.setNextRandom(30);
      player1.toString();
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player1);
      gameState0.players = (List<Player>) vector0;
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "");
      stack0.stream();
      player0.coins = 1;
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      player1.player_username = "";
      gameState0.toString();
      player1.coins = 1;
      gameState0.play();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      player0.discard((Card) null);
      gameState0.isGameOver();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      player0.drawCard();
      Random.setNextRandom((-2063));
      player0.hand = (List<Card>) stack0;
      Random.setNextRandom((-2063));
      Integer integer0 = new Integer(1);
      hashMap0.put((Card) null, integer0);
      Random.setNextRandom(30);
      player1.toString();
      Vector<Player> vector0 = new Vector<Player>();
      gameState0.players = (List<Player>) vector0;
      gameState0.play();
      List<Card> list0 = gameState0.cards;
      vector0.add(player1);
      Random.setNextRandom(354);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(arrayList0, card_CardName0);
      arrayList0.removeAll(gameState0.players);
      hashMap0.put((Card) null, (Integer) null);
      gameState0.gameBoard = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      GameState gameState1 = gameState0.clone();
      gameState0.toString();
      gameState0.play();
      gameState1.initializeGame();
      gameState1.gameBoard = gameState0.gameBoard;
      Player player2 = new Player(gameState0, "The board game is embty you need to intialize the game!!!!");
      Player player3 = player2.clone();
      gameState0.addPlayer(player3);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.addPlayer(player2);
      Randomness.random = null;
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      List<Player> list1 = gameState0.players;
      gameState0.initializeGame();
      gameState0.toString();
      String string0 = "\"ZPh|Oh7T9*";
      Player player0 = new Player(gameState0, "\"ZPh|Oh7T9*");
      Player player1 = player0.clone();
      LinkedList<Card> linkedList0 = player0.deck;
      Card.CardName card_CardName0 = Card.CardName.Copper;
      player0.drawCard();
      player0.gain((Card) null);
      Card.getCard(linkedList0, card_CardName0);
      gameState0.addPlayer(player0);
      player0.deck = linkedList0;
      player0.discard = list0;
      player0.playKingdomCard();
      gameState0.addPlayer(player1);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>();
      assertTrue(linkedHashSet0.isEmpty());
  }
}
