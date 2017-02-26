/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 00:26:18 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Random.setNextRandom(2);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState(stack0);
      Player player0 = new Player(gameState0, "cZD!Tq9+?c+)A;a");
      gameState0.addPlayer(player0);
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.getWinners();
      gameState0.gameBoard = hashMap0;
      Integer integer0 = new Integer(2);
      hashMap0.put((Card) null, integer0);
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
  public void test01()  throws Throwable  {
      Card.CardName.values();
      Random.setNextRandom((-3100));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState(stack0);
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.getWinners();
      gameState0.gameBoard = hashMap0;
      Integer integer0 = new Integer((-3100));
      hashMap0.put((Card) null, integer0);
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState(linkedList0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(linkedList0, card_CardName0);
      Integer integer0 = new Integer(7);
      hashMap0.put((Card) null, integer0);
      gameState0.cards = (List<Card>) linkedList0;
      gameState0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      gameState0.players = (List<Player>) arrayList0;
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
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      gameState0.players = (List<Player>) arrayList0;
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
  public void test05()  throws Throwable  {
      Card.Type.values();
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.embargoTokens = null;
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      gameState0.getWinners();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
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
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list1);
      Player player0 = new Player((GameState) null, ">Lu9(L|t2,Q%b\"Ba+V");
      gameState0.addPlayer(player0);
      Card.CardName.values();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      arrayList0.add((Player) null);
      gameState0.players = (List<Player>) arrayList0;
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
  public void test09()  throws Throwable  {
      Card.CardName.values();
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      List<Card> list1 = gameState0.cards;
      int int0 = 342;
      Random.setNextRandom(342);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Player player0 = new Player(gameState0, "<!e~t^U{TGgz]MQX%.");
      gameState0.addPlayer(player0);
      gameState0.gameBoard = hashMap0;
      Integer.getInteger("_[6@nIt:4EI.Tcwee");
      Integer.max(62, 192);
      Integer.max(733, 733);
      gameState0.addPlayer((Player) null);
      hashMap0.getOrDefault(gameState0.gameBoard, (Integer) null);
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
  public void test10()  throws Throwable  {
      Random.setNextRandom(1);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState(stack0);
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.getWinners();
      gameState0.gameBoard = hashMap0;
      Integer integer0 = new Integer(1);
      hashMap0.put((Card) null, integer0);
      gameState0.play();
      Player player0 = new Player(gameState0, "Hour");
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState(linkedList0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(linkedList0, card_CardName0);
      Integer integer0 = new Integer(0);
      hashMap0.put((Card) null, integer0);
      gameState0.cards = (List<Card>) linkedList0;
      boolean boolean0 = gameState0.isGameOver();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      arrayList0.add(player0);
      arrayList0.add(player0);
      gameState0.players = (List<Player>) arrayList0;
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
      GameState gameState0 = new GameState((List<Card>) null);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      arrayList0.add(player0);
      gameState0.players = (List<Player>) arrayList0;
      Card.Type.values();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.initializeGame();
      Card.CardName.values();
      gameState0.gameBoard = hashMap0;
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player(gameState0, "**DObPSAqw[{");
      arrayList0.add(player0);
      player0.drawCard();
      GameState.addEmbargo((Card) null);
      arrayList0.add(player0);
      gameState0.players = (List<Player>) arrayList0;
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
  public void test15()  throws Throwable  {
      Player player0 = new Player((GameState) null, "org.apache.oro.io.Perl5FilenameFilter");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState(linkedList0);
      gameState0.addPlayer(player0);
      assertEquals(0, linkedList0.size());
      
      HashMap<Player, Integer> hashMap0 = gameState0.play();
      assertEquals(1, hashMap0.size());
      
      String string0 = gameState0.toString();
      assertEquals("The board game is empty you need to intialize the game!!!!", string0);
  }
}
