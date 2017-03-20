/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:58:45 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Board_ESTest extends Board_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      Card card0 = new Card();
      card0.type = "";
      card0.cost = 769;
      arrayList0.add(card0);
      board0.time_to_end();
      arrayList0.add((Card) null);
      board0.on_board = arrayList0;
      ArrayList<Card> arrayList1 = board0.in_trash;
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        board0.time_to_end();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card card0 = new Card();
      arrayList0.add(card0);
      Board board0 = new Board(arrayList0);
      ArrayList<Card> arrayList1 = board0.in_trash;
      board0.on_board = null;
      ArrayList<Card> arrayList2 = board0.in_trash;
      // Undeclared exception!
      try { 
        board0.shuffle_board();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.in_trash = arrayList0;
      board0.in_trash.add((Card) null);
      board0.get_count_by_type((String) null);
      // Undeclared exception!
      try { 
        board0.print_in_trash();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      Card card0 = new Card();
      arrayList0.add(card0);
      board0.on_board = arrayList0;
      board0.on_board.add(card0);
      board0.print_board();
      board0.in_trash = arrayList0;
      board0.in_trash.clone();
      board0.print_in_trash();
      board0.on_board = arrayList0;
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        board0.get_count_by_type(" Not Treasure: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.print_in_trash();
      Board board1 = new Board(arrayList0);
      board1.in_trash = arrayList0;
      board1.on_board = arrayList0;
      board1.on_board("yD|H>%`+6y)_");
      arrayList0.add((Card) null);
      board1.shuffle_board();
      board0.on_board = arrayList0;
      board1.shuffle_board();
      // Undeclared exception!
      try { 
        board1.print_board();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.print_board();
      board0.in_trash = arrayList0;
      arrayList0.add((Card) null);
      board0.in_trash.add((Card) null);
      board0.print_board();
      arrayList0.add((Card) null);
      board0.print_board();
      board0.on_board = arrayList0;
      // Undeclared exception!
      try { 
        board0.on_board(".;%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card card0 = new Card();
      card0.cost = 2;
      card0.name = "@i:)k0<DxM:&7;N";
      arrayList0.add(card0);
      arrayList0.add(card0);
      Board board0 = new Board(arrayList0);
      board0.print_in_trash();
      board0.get_count_by_type((String) null);
      arrayList0.add(card0);
      board0.print_board();
      board0.on_board("");
      board0.print_in_trash();
      ArrayList<Card> arrayList1 = board0.on_board;
      board0.print_in_trash();
      ArrayList<Card> arrayList2 = board0.in_trash;
      board0.print_board();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.print_board();
      board0.on_board = arrayList0;
      board0.on_board.add((Card) null);
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        board0.on_board_by_value(2512);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card card0 = new Card();
      card0.value = 0;
      arrayList0.add(card0);
      Board board0 = new Board(arrayList0);
      board0.shuffle_board();
      board0.on_board = arrayList0;
      board0.shuffle_board();
      board0.on_board((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Board board0 = null;
      try {
        board0 = new Board((ArrayList<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.in_trash = arrayList0;
      arrayList0.add((Card) null);
      ArrayList<Card> arrayList1 = board0.in_trash;
      board0.get_count_by_name("silver");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.time_to_end();
      Board board1 = new Board(arrayList0);
      ArrayList<Card> arrayList1 = board1.on_board;
      ArrayList<Card> arrayList2 = new ArrayList<Card>();
      Card card0 = new Card();
      arrayList1.add(card0);
      Board board2 = new Board(arrayList2);
      board1.print_board();
      arrayList0.listIterator(0);
      board0.in_trash = arrayList1;
      arrayList0.add(card0);
      board0.get_count_by_name("X}");
      board0.on_board_by_value(0);
      arrayList2.addAll(0, (Collection<? extends Card>) arrayList0);
      board2.print_board();
      Board board3 = new Board(arrayList1);
      ArrayList<Card> arrayList3 = board1.on_board;
      board0.on_board_by_value(0);
      board3.get_count_by_name("X}");
      ArrayList<Card> arrayList4 = board1.in_trash;
      board0.on_board(" Card: ");
      ArrayList<Card> arrayList5 = board1.on_board;
      assertSame(arrayList5, arrayList1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      String string0 = "c@KVu*CAhEGp";
      board0.on_board("c@KVu*CAhEGp");
      String string1 = "";
      arrayList0.iterator();
      board0.on_board = arrayList0;
      board0.get_count_by_type("");
      Board board1 = new Board(arrayList0);
      board1.in_trash = board0.on_board;
      board0.get_count_by_name("c@KVu*CAhEGp");
      board0.on_board = arrayList0;
      board1.on_board("");
      board0.shuffle_board();
      board1.time_to_end();
      String string2 = "u8/WreAw(`E6<|kEW|O";
      board1.in_trash = arrayList0;
      // Undeclared exception!
      try { 
        board0.in_trash.replaceAll((UnaryOperator<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      board0.print_board();
      board0.in_trash = arrayList0;
      ArrayList<Card> arrayList1 = board0.on_board;
      Card card0 = new Card();
      arrayList0.add(card0);
      board0.print_board();
      board0.print_in_trash();
      board0.print_in_trash();
      // Undeclared exception!
      try { 
        board0.in_trash.replaceAll((UnaryOperator<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      arrayList0.retainAll(linkedList0);
      int int0 = board0.on_board("silver");
      //  // Unstable assertion: assertEquals((-1), int0);
      
      int int1 = board0.get_count_by_type("");
      int int2 = board0.on_board_by_value(80);
      //  // Unstable assertion: assertTrue(int2 == int1);
      //  // Unstable assertion: assertEquals(0, int2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Board board0 = new Board(arrayList0);
      ArrayList<Card> arrayList1 = board0.in_trash;
      Board board1 = new Board(arrayList0);
      ArrayList<Card> arrayList2 = board1.in_trash;
      Card card0 = new Card();
      arrayList2.add(card0);
      board0.on_board_by_value((-1650));
      board1.print_board();
      ArrayList<Card> arrayList3 = board0.in_trash;
      Card card1 = new Card();
      card1.name = "Bgn71RHV~mR5B_SJ~";
      arrayList0.add(card1);
      board1.on_board("");
      board1.in_trash = arrayList0;
      board1.on_board_by_value((-1));
      Board board2 = new Board(arrayList3);
      board2.on_board = arrayList2;
      board2.time_to_end();
      board1.shuffle_board();
      assertNotSame(board1, board2);
  }
}