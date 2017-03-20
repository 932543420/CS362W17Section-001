/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 02:25:52 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.MAX_HAND = (-1077);
      player0.shuffle();
      player0.handcount = 16;
      player0.deckCount = 10;
      int[] intArray0 = new int[6];
      player0.MAX_DECK = 0;
      intArray0[2] = 10;
      intArray0[3] = 10;
      intArray0[4] = 10;
      intArray0[5] = 10;
      player0.hand = intArray0;
      player0.DEBUG = true;
      player0.hand = intArray0;
      int int0 = player0.MAX_DECK;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.shuffle();
      player0.handcount = 16;
      player0.deckCount = 10;
      int[] intArray0 = new int[6];
      intArray0[0] = 10;
      player0.MAX_DECK = 39;
      intArray0[2] = 10;
      intArray0[3] = 10;
      intArray0[3] = 10;
      intArray0[5] = 10;
      player0.hand = intArray0;
      player0.DEBUG = true;
      player0.hand = intArray0;
      int int0 = player0.MAX_DECK;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.shuffle();
      player0.handcount = 16;
      player0.deckCount = 10;
      int[] intArray0 = new int[6];
      player0.deck = intArray0;
      intArray0[0] = 10;
      player0.MAX_DECK = 0;
      intArray0[2] = 10;
      intArray0[3] = 10;
      intArray0[4] = 10;
      intArray0[5] = 10;
      player0.hand = intArray0;
      player0.DEBUG = true;
      player0.hand = intArray0;
      int int0 = player0.MAX_DECK;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      player0.handcount = 3;
      player0.discardCount = 3;
      player0.MAX_DECK = (-349);
      player0.MAX_DECK = 500;
      Random.setNextRandom((-1032));
      player0.drawCard();
      Player player1 = new Player();
      int[] intArray0 = player1.hand;
      Player player2 = new Player();
      player2.MAX_DECK = 487;
      player0.discard = intArray0;
      player2.discardCount = 500;
      player1.drawCard();
      player2.discard = intArray0;
      int[] intArray1 = player2.deck;
      player0.discard = player2.discard;
      int int0 = player1.handcount;
      player1.DEBUG = true;
  }

  
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.scoreFor();
      player0.deckCount = 0;
      player0.scoreFor();
      int[] intArray0 = new int[7];
      intArray0[0] = 500;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = (-1);
      intArray0[4] = 500;
      intArray0[5] = 500;
      intArray0[6] = 0;
      player0.discard = intArray0;
      player0.discard = null;
      int int0 = player0.MAX_DECK;
      player0.hand = null;
      player0.hand = null;
      player0.deck = null;
      player0.deckCount = 500;
      // Undeclared exception!
      try { 
        player0.shuffle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      player0.DEBUG = false;
      int[] intArray0 = new int[0];
      player0.hand = intArray0;
      int[] intArray1 = player0.discard;
      int[] intArray2 = player0.deck;
      boolean boolean0 = player0.DEBUG;
      Player player1 = new Player();
      player0.discard = intArray1;
      player1.DEBUG = false;
      boolean boolean1 = player0.DEBUG;
      int int0 = player0.deckCount;
      player0.shuffle();
      player0.fullDeckCount((-1));
      player1.DEBUG = false;
      player1.shuffle();
      player0.MAX_HAND = 0;
      Player.findMinimum(player0.hand, (-1), 0);
      player1.shuffle();
      int[] intArray3 = new int[8];
      intArray3[0] = (-1);
      intArray3[1] = 0;
      player1.handcount = 1;
      intArray3[2] = 0;
      intArray3[3] = (-1);
      intArray3[4] = (-1);
      intArray3[5] = (-1);
      intArray3[6] = (-1);
      intArray3[7] = (-1);
      Player.sortArrayAsc(intArray3, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[3];
      intArray0[0] = 2682;
      intArray0[1] = 0;
      intArray0[2] = (-1);
      player0.hand = intArray0;
      player0.scoreFor();
      player0.handcount = 0;
      player0.drawCard();
      player0.discardCount = 13;
      int[] intArray1 = player0.discard;
      player0.handcount = 412;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player.sortArrayAsc((int[]) null, 12, 12);
      Player player0 = new Player();
      player0.shuffle();
      player0.discard = null;
      player0.discard = null;
      player0.discardCount = 12;
      int int0 = player0.deckCount;
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.shuffle();
      player0.handcount = 16;
      player0.deckCount = 10;
      int[] intArray0 = new int[6];
      intArray0[0] = 10;
      player0.MAX_DECK = 0;
      intArray0[3] = 10;
      intArray0[4] = 10;
      intArray0[5] = 10;
      player0.hand = intArray0;
      player0.hand = intArray0;
      // Undeclared exception!
      try { 
        player0.fullDeckCount(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.hand = null;
      player0.hand = null;
      int int0 = player0.handcount;
      Player player1 = new Player();
      Player player2 = new Player();
      player1.discardCount = 0;
      player2.DEBUG = true;
      int int1 = player0.deckCount;
      player2.discardCount = 785;
      player2.DEBUG = true;
      player1.scoreFor();
      boolean boolean0 = player1.DEBUG;
      player0.discard = null;
      player0.shuffle();
      player1.shuffle();
      player0.deck = null;
      player1.handcount = 0;
      player2.shuffle();
      // Undeclared exception!
      try { 
        player2.fullDeckCount(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 500
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[4];
      intArray0[0] = (-1965);
      intArray0[1] = 1089;
      player0.DEBUG = true;
      intArray0[2] = 0;
      intArray0[3] = 1597;
      player0.discard = intArray0;
      player0.drawCard();
      int int0 = player0.MAX_HAND;
      player0.discardCount = 500;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.discardCount = 400;
      // Undeclared exception!
      try { 
        Player.sortArrayAsc((int[]) null, 400, (-1740));
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
      Player player0 = new Player();
      player0.hand = null;
      player0.DEBUG = true;
      player0.scoreFor();
      player0.DEBUG = true;
      int int0 = player0.MAX_DECK;
      player0.scoreFor();
      player0.MAX_DECK = 3428;
      int[] intArray0 = new int[1];
      intArray0[0] = 500;
      player0.discardCount = 31;
      // Undeclared exception!
      try { 
        player0.drawCard();
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
      Player player0 = new Player();
      player0.deckCount = 923;
      player0.discardCount = 6;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 922
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.MAX_DECK = 322;
      player0.MAX_HAND = 322;
      player0.DEBUG = true;
      Player player1 = new Player();
      player1.handcount = (-65);
      player0.deckCount = 10;
      player1.DEBUG = true;
      player0.shuffle();
      boolean boolean0 = player1.DEBUG;
      int[] intArray0 = new int[2];
      player1.discard = intArray0;
      intArray0[0] = 10;
      player1.deck = intArray0;
      intArray0[1] = 10;
      player1.DEBUG = true;
      player1.shuffle();
      player0.DEBUG = false;
      player0.deck = intArray0;
      int int0 = player0.handcount;
      player0.discard = intArray0;
      player0.discardCount = 322;
      int int1 = player0.deckCount;
      int[] intArray1 = player0.deck;
      player1.shuffle();
      int[] intArray2 = player1.discard;
      // Undeclared exception!
      try { 
        Player.findMinimum(intArray2, 10, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Player.findMinimum((int[]) null, 2573, 850);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      player0.handcount = 2651;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 500
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      player0.deckCount = (-2091);
      player0.fullDeckCount(1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      player0.discardCount = (-308);
      int[] intArray0 = player0.discard;
      int int0 = player0.MAX_DECK;
      int[] intArray1 = new int[7];
      intArray1[0] = 500;
      intArray1[1] = (-308);
      intArray1[2] = (-308);
      intArray1[3] = 500;
      intArray1[4] = 500;
      player0.hand = intArray1;
      intArray1[5] = (-308);
      player0.shuffle();
      intArray1[6] = (-308);
      player0.discard = intArray1;
      Player.sortArrayAsc(player0.discard, (-308), (-308));
      player0.scoreFor();
      int[] intArray2 = player0.hand;
      Player player1 = new Player();
      player0.fullDeckCount((-308));
      int int1 = player0.handcount;
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      player0.discardCount = (-1);
      int[] intArray0 = player0.deck;
      player0.scoreFor();
      player0.MAX_DECK = (-1040);
      Player player1 = new Player();
      player1.shuffle();
      player1.DEBUG = false;
      player1.deckCount = 90;
      boolean boolean0 = player1.DEBUG;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      player0.MAX_HAND = 882;
      int[] intArray0 = new int[1];
      player0.deck = intArray0;
      intArray0[0] = 882;
      player0.deck = intArray0;
      player0.MAX_DECK = 400;
      player0.deckCount = 400;
      // Undeclared exception!
      try { 
        player0.shuffle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[3];
      intArray0[0] = 2682;
      intArray0[1] = 0;
      intArray0[2] = (-20);
      player0.hand = intArray0;
      player0.scoreFor();
      player0.handcount = (-20);
      int int0 = player0.handcount;
      player0.discardCount = 13;
      int[] intArray1 = player0.discard;
      player0.scoreFor();
      player0.fullDeckCount(13);
      player0.DEBUG = false;
      int[] intArray2 = player0.discard;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -20
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      player0.discardCount = (-1919);
      player0.DEBUG = true;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1920
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-317);
      intArray0[1] = (-485);
      intArray0[2] = 0;
      intArray0[3] = 2110;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 31;
      intArray0[7] = 0;
      intArray0[8] = (-3070);
      // Undeclared exception!
      try { 
        Player.sortArrayAsc(intArray0, 0, (-3070));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.handcount = 500;
      int[] intArray0 = new int[5];
      intArray0[0] = 500;
      intArray0[1] = 500;
      intArray0[2] = 500;
      intArray0[3] = 500;
      intArray0[4] = 500;
      player0.hand = intArray0;
      int[] intArray1 = player0.hand;
      player0.MAX_HAND = 500;
      player0.MAX_DECK = 500;
      // Undeclared exception!
      try { 
        player0.fullDeckCount(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player();
      player0.discardCount = 15;
      player0.shuffle();
      Player player1 = new Player();
      int[] intArray0 = new int[0];
      player1.deck = intArray0;
      player1.handcount = 15;
      Player player2 = new Player();
      player2.deck = player0.deck;
      player2.handcount = 15;
      player1.fullDeckCount((-1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player();
      player0.MAX_DECK = (-811);
      player0.discardCount = 6;
      // Undeclared exception!
      try { 
        player0.shuffle();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[0];
      player0.hand = intArray0;
      player0.discard = intArray0;
      player0.discardCount = 0;
      player0.DEBUG = true;
      Player.sortArrayAsc(player0.hand, 0, 0);
      player0.MAX_DECK = (-2055);
      player0.fullDeckCount((-2055));
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player();
      player0.handcount = 4;
      player0.DEBUG = true;
      player0.handcount = 306;
      player0.drawCard();
      player0.discardCount = 500;
      int[] intArray0 = player0.deck;
      Player player1 = new Player();
      int int0 = player1.discardCount;
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player();
      player0.deckCount = (-1935);
      player0.DEBUG = true;
      player0.drawCard();
      player0.shuffle();
      player0.deckCount = 3;
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      intArray0[1] = (-1935);
      intArray0[2] = 3;
      intArray0[3] = (-1);
      intArray0[4] = (-1935);
      intArray0[5] = 3;
      intArray0[6] = 3;
      // Undeclared exception!
      try { 
        Player.sortArrayAsc(intArray0, 500, 2879);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 501
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = player0.hand;
      player0.discardCount = 59;
      player0.deck = null;
      player0.MAX_HAND = 1845;
      player0.deckCount = 1845;
      player0.hand = intArray0;
      player0.handcount = (-799);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player();
      player0.scoreFor();
      int int0 = player0.deckCount;
      player0.scoreFor();
      player0.scoreFor();
      player0.drawCard();
      player0.MAX_HAND = (-1);
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      intArray0[1] = (-1);
      intArray0[2] = 343;
      // Undeclared exception!
      try { 
        Player.findMinimum(intArray0, 0, 343);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.shuffle();
      player0.handcount = 16;
      player0.deckCount = 10;
      int[] intArray0 = new int[6];
      intArray0[0] = 10;
      player0.MAX_DECK = 0;
      intArray0[2] = 10;
      intArray0[3] = 10;
      intArray0[4] = 10;
      intArray0[5] = 10;
      player0.hand = intArray0;
      player0.DEBUG = true;
      player0.hand = intArray0;
      int int0 = player0.MAX_DECK;
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player();
      player0.drawCard();
      player0.scoreFor();
      player0.drawCard();
      player0.DEBUG = false;
      player0.scoreFor();
      player0.fullDeckCount((-1));
      player0.deckCount = 14;
      player0.fullDeckCount(0);
      player0.drawCard();
      player0.scoreFor();
      int int0 = player0.handcount;
      player0.MAX_DECK = (-4368);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.MAX_HAND;
      Player player1 = new Player();
      int int1 = player1.discardCount;
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[3];
      intArray0[0] = 2682;
      intArray0[1] = 0;
      intArray0[2] = (-1);
      player0.hand = intArray0;
      player0.scoreFor();
      player0.handcount = 0;
      player0.drawCard();
      player0.discardCount = 13;
      int[] intArray1 = player0.discard;
      player0.scoreFor();
      player0.fullDeckCount(13);
      player0.DEBUG = false;
      int[] intArray2 = player0.discard;
      player0.drawCard();
      player0.discardCount = 1743;
      // Undeclared exception!
      try { 
        Player.sortArrayAsc(intArray1, 939, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 940
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[3];
      intArray0[0] = 6;
      player0.DEBUG = false;
      player0.MAX_HAND = 6;
      player0.MAX_HAND = 10;
      player0.discardCount = 0;
      player0.drawCard();
      intArray0[1] = 0;
      intArray0[2] = (-1214);
      player0.discard = intArray0;
      int int0 = player0.deckCount;
      int[] intArray1 = player0.discard;
      player0.drawCard();
      player0.drawCard();
      player0.shuffle();
      player0.shuffle();
      player0.handcount = (-1);
      player0.handcount = 0;
      player0.scoreFor();
      player0.MAX_HAND = (-1);
      player0.drawCard();
      player0.DEBUG = true;
      int int1 = player0.discardCount;
      boolean boolean0 = player0.DEBUG;
      player0.shuffle();
      player0.shuffle();
      // Undeclared exception!
      try { 
        Player.findMinimum(intArray1, 65, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 66
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[4];
      intArray0[0] = 28;
      player0.hand = intArray0;
      intArray0[1] = 1;
      player0.shuffle();
      player0.deck = intArray0;
      player0.discardCount = 28;
      intArray0[2] = 132;
      intArray0[3] = 1356;
      player0.hand = intArray0;
      player0.shuffle();
      player0.deckCount = 0;
      int int0 = player0.MAX_DECK;
      int int1 = player0.MAX_DECK;
      Player.sortArrayAsc(intArray0, 500, 500);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Player player0 = new Player();
      int[] intArray0 = new int[6];
      intArray0[0] = 60000;
      intArray0[1] = 1;
      intArray0[2] = 6;
      intArray0[3] = (-5287);
      intArray0[4] = 840;
      intArray0[5] = 0;
      player0.deck = intArray0;
  }
}
