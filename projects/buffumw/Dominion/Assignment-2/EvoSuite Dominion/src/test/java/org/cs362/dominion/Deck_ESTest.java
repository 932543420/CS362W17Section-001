/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:40:03 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Card;
import org.cs362.dominion.Deck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Deck_ESTest extends Deck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.addCardToBottom((Card) null);
      deck0.getBottomCard();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.addCardToBottom((Card) null);
      deck0.cardAt(1);
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Deck deck0 = new Deck(arrayList0);
      // Undeclared exception!
      try { 
        deck0.cardAt(19);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.size();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.toggleEmbargo();
      boolean boolean0 = deck0.getEmbargoStatus();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.embargoed = true;
      boolean boolean0 = deck0.toggleEmbargo();
      assertFalse(deck0.getEmbargoStatus());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      // Undeclared exception!
      try { 
        deck0.removeCard((Card) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.removeCard((Card) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToBottom((Card) null);
      // Undeclared exception!
      try { 
        deck0.compare("[null]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.compare("Great_Hall");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.filterBy((Card.Type[]) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      Card.Type[] card_TypeArray0 = new Card.Type[8];
      // Undeclared exception!
      try { 
        deck0.filterBy(card_TypeArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.removeNull();
      assertEquals(0, deck0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.removeNull();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.getBottomCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.getTopCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToBottom((Card) null);
      deck0.getTopCard();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.draw();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.draw();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Deck deck0 = new Deck();
      boolean boolean0 = deck0.isEmpty();
      assertTrue(boolean0);
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.cardAt((-458));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try { 
        deck0.cardAt(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Error: index out of bounds
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.getDeck();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.shuffle();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.addCardToTop((Card) null);
      deck0.cardAt(0);
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Deck deck0 = new Deck();
      assertTrue(deck0.isEmpty());
      
      deck0.addCardToBottom((Card) null);
      boolean boolean0 = deck0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Deck deck0 = new Deck();
      boolean boolean0 = deck0.getEmbargoStatus();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Deck deck0 = null;
      try {
        deck0 = new Deck((ArrayList<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.toString();
      assertFalse(deck0.getEmbargoStatus());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.size();
      assertFalse(deck0.getEmbargoStatus());
  }
}
