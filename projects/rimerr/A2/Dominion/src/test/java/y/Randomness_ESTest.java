/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 00:54:21 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Randomness;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 60 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. dominion.Randomness.reset(J)V: root-Branch
   * Goal 3. dominion.Randomness.main([Ljava/lang/String;)V: I11 Branch 4 IF_ICMPGE L42 - true
   * Goal 4. dominion.Randomness.main([Ljava/lang/String;)V: I11 Branch 4 IF_ICMPGE L42 - false
   * Goal 5. Branch dominion.Randomness.nextRandomInt(I)I: root-Branch in context: dominion.Randomness:nextRandomInt(I)I
   * Goal 6. Branch dominion.Randomness.main([Ljava/lang/String;)V: I11 Branch 4 IF_ICMPGE L42 - false in context: dominion.Randomness:main([Ljava/lang/String;)V
   * Goal 7. Branch dominion.Randomness.main([Ljava/lang/String;)V: I11 Branch 4 IF_ICMPGE L42 - true in context: dominion.Randomness:main([Ljava/lang/String;)V
   * Goal 8. main([Ljava/lang/String;)V_org.evosuite.runtime.System$SystemExitException_IMPLICIT
   * Goal 9. [Output]: dominion.Randomness.nextRandomInt(I)I:Zero
   * Goal 10. dominion.Randomness.main([Ljava/lang/String;)V: Line 40
   * Goal 11. dominion.Randomness.main([Ljava/lang/String;)V: Line 42
   * Goal 12. dominion.Randomness.main([Ljava/lang/String;)V: Line 43
   * Goal 13. dominion.Randomness.main([Ljava/lang/String;)V: Line 45
   * Goal 14. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 15. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 16. dominion.Randomness.reset(J)V: Line 19
   * Goal 17. dominion.Randomness.reset(J)V: Line 20
   * Goal 18. [METHOD] dominion.Randomness.main([Ljava/lang/String;)V
   * Goal 19. [METHOD] dominion.Randomness.nextRandomInt(I)I
   * Goal 20. [METHODNOEX] dominion.Randomness.nextRandomInt(I)I
   * Goal 21. Weak Mutation 0: dominion.Randomness.reset(J)V:19 - ReplaceVariable newSeed -> SEED
   * Goal 22. Weak Mutation 1: dominion.Randomness.reset(J)V:19 - InsertUnaryOp Negation of newSeed
   * Goal 23. Weak Mutation 2: dominion.Randomness.reset(J)V:19 - ReplaceComparisonOperator == -> !=
   * Goal 24. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 25. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 26. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 27. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 28. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 29. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 30. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 31. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 32. Weak Mutation 11: dominion.Randomness.nextRandomInt(I)I:30 - ReplaceVariable i -> totalCallsToRandom
   * Goal 33. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 34. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 35. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   * Goal 36. Weak Mutation 24: dominion.Randomness.main([Ljava/lang/String;)V:40 - ReplaceConstant - 11 -> 0
   * Goal 37. Weak Mutation 25: dominion.Randomness.main([Ljava/lang/String;)V:40 - ReplaceConstant - 11 -> 1
   * Goal 38. Weak Mutation 26: dominion.Randomness.main([Ljava/lang/String;)V:40 - ReplaceConstant - 11 -> -1
   * Goal 39. Weak Mutation 27: dominion.Randomness.main([Ljava/lang/String;)V:40 - ReplaceConstant - 11 -> 10
   * Goal 40. Weak Mutation 28: dominion.Randomness.main([Ljava/lang/String;)V:40 - ReplaceConstant - 11 -> 12
   * Goal 41. Weak Mutation 29: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 0 -> 1
   * Goal 42. Weak Mutation 30: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceVariable i -> totalCallsToRandom
   * Goal 43. Weak Mutation 31: dominion.Randomness.main([Ljava/lang/String;)V:42 - InsertUnaryOp Negation of i
   * Goal 44. Weak Mutation 32: dominion.Randomness.main([Ljava/lang/String;)V:42 - InsertUnaryOp IINC 1 i
   * Goal 45. Weak Mutation 33: dominion.Randomness.main([Ljava/lang/String;)V:42 - InsertUnaryOp IINC -1 i
   * Goal 46. Weak Mutation 34: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 10 -> 0
   * Goal 47. Weak Mutation 35: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 10 -> 1
   * Goal 48. Weak Mutation 36: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 10 -> -1
   * Goal 49. Weak Mutation 37: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 10 -> 9
   * Goal 50. Weak Mutation 38: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceConstant - 10 -> 11
   * Goal 51. Weak Mutation 39: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceComparisonOperator >= -> -1
   * Goal 52. Weak Mutation 40: dominion.Randomness.main([Ljava/lang/String;)V:42 - ReplaceComparisonOperator >= -> >
   * Goal 53. Weak Mutation 42: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - value=:  -> 
   * Goal 54. Weak Mutation 43: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - 10 -> 0
   * Goal 55. Weak Mutation 44: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - 10 -> 1
   * Goal 56. Weak Mutation 45: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - 10 -> -1
   * Goal 57. Weak Mutation 46: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - 10 -> 9
   * Goal 58. Weak Mutation 47: dominion.Randomness.main([Ljava/lang/String;)V:43 - ReplaceConstant - 10 -> 11
   * Goal 59. Weak Mutation 48: dominion.Randomness.main([Ljava/lang/String;)V:45 - ReplaceConstant - 0 -> 1
   * Goal 60. Weak Mutation 49: dominion.Randomness.main([Ljava/lang/String;)V:45 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Randomness.nextRandomInt((-134));
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 1
  /*
   * 29 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false
   * Goal 3. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true
   * Goal 4. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true
   * Goal 5. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 6. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 7. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 8. [Output]: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:NonNull
   * Goal 9. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 10. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 11. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 33
   * Goal 12. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 35
   * Goal 13. [METHOD] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 14. [METHODNOEX] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 15. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 16. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 17. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 18. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 19. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 20. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 21. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 22. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 23. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 24. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 25. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   * Goal 26. Weak Mutation 15: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator = null -> != null
   * Goal 27. Weak Mutation 17: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator <= -> ==
   * Goal 28. Weak Mutation 20: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceConstant - 0 -> 1
   * Goal 29. Weak Mutation 21: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      LinkedList linkedList1 = (LinkedList)Randomness.randomMember((List<Object>) linkedList0);
      assertEquals(1, linkedList1.size());
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. Branch dominion.Randomness.nextRandomInt(I)I: root-Branch in context: dominion.Randomness:nextRandomInt(I)I
   * Goal 3. [Output]: dominion.Randomness.nextRandomInt(I)I:Positive
   * Goal 4. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 5. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 6. [METHOD] dominion.Randomness.nextRandomInt(I)I
   * Goal 7. [METHODNOEX] dominion.Randomness.nextRandomInt(I)I
   * Goal 8. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 9. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 10. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 11. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 12. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 13. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 14. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 15. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 16. Weak Mutation 11: dominion.Randomness.nextRandomInt(I)I:30 - ReplaceVariable i -> totalCallsToRandom
   * Goal 17. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 18. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 19. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Random.setNextRandom(1621);
      int int0 = Randomness.nextRandomInt((-134));
      assertEquals(13, int0);
  }

  //Test case number: 3
  /*
   * 28 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false
   * Goal 3. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true
   * Goal 4. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true
   * Goal 5. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 6. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 7. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 8. randomMember(Ljava/util/List;)Ljava/lang/Object;_java.lang.NullPointerException_IMPLICIT
   * Goal 9. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 10. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 11. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 33
   * Goal 12. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 35
   * Goal 13. [METHOD] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 14. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 15. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 16. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 17. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 18. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 19. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 20. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 21. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 22. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 23. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 24. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   * Goal 25. Weak Mutation 15: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator = null -> != null
   * Goal 26. Weak Mutation 17: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator <= -> ==
   * Goal 27. Weak Mutation 20: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceConstant - 0 -> 1
   * Goal 28. Weak Mutation 21: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Randomness.random = null;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  //Test case number: 4
  /*
   * 18 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. Branch dominion.Randomness.nextRandomInt(I)I: root-Branch in context: dominion.Randomness:nextRandomInt(I)I
   * Goal 3. nextRandomInt(I)I_java.lang.NullPointerException_IMPLICIT
   * Goal 4. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 5. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 6. [METHOD] dominion.Randomness.nextRandomInt(I)I
   * Goal 7. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 8. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 9. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 10. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 11. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 12. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 13. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 14. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 15. Weak Mutation 11: dominion.Randomness.nextRandomInt(I)I:30 - ReplaceVariable i -> totalCallsToRandom
   * Goal 16. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 17. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 18. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  //Test case number: 5
  /*
   * 18 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. Branch dominion.Randomness.nextRandomInt(I)I: root-Branch in context: dominion.Randomness:nextRandomInt(I)I
   * Goal 3. nextRandomInt(I)I_java.lang.ArithmeticException_IMPLICIT
   * Goal 4. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 5. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 6. [METHOD] dominion.Randomness.nextRandomInt(I)I
   * Goal 7. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 8. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 9. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 10. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 11. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 12. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 13. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 14. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 15. Weak Mutation 11: dominion.Randomness.nextRandomInt(I)I:30 - ReplaceVariable i -> totalCallsToRandom
   * Goal 16. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 17. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 18. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * Goal 1. dominion.Randomness.reset(J)V: root-Branch
   * Goal 2. Branch dominion.Randomness.reset(J)V: root-Branch in context: dominion.Randomness:reset(J)V
   * Goal 3. dominion.Randomness.reset(J)V: Line 19
   * Goal 4. dominion.Randomness.reset(J)V: Line 20
   * Goal 5. [METHOD] dominion.Randomness.reset(J)V
   * Goal 6. [METHODNOEX] dominion.Randomness.reset(J)V
   * Goal 7. Weak Mutation 1: dominion.Randomness.reset(J)V:19 - InsertUnaryOp Negation of newSeed
   * Goal 8. Weak Mutation 2: dominion.Randomness.reset(J)V:19 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Randomness.reset(0L);
  }

  //Test case number: 7
  /*
   * 29 covered goals:
   * Goal 1. dominion.Randomness.nextRandomInt(I)I: root-Branch
   * Goal 2. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false
   * Goal 3. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true
   * Goal 4. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true
   * Goal 5. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 6. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 7. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 8. [Output]: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:Null
   * Goal 9. dominion.Randomness.nextRandomInt(I)I: Line 29
   * Goal 10. dominion.Randomness.nextRandomInt(I)I: Line 30
   * Goal 11. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 33
   * Goal 12. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 35
   * Goal 13. [METHOD] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 14. [METHODNOEX] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 15. Weak Mutation 3: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp Negation
   * Goal 16. Weak Mutation 4: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp +1
   * Goal 17. Weak Mutation 5: dominion.Randomness.nextRandomInt(I)I:29 - InsertUnaryOp -1
   * Goal 18. Weak Mutation 6: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceConstant - 1 -> 0
   * Goal 19. Weak Mutation 7: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> %
   * Goal 20. Weak Mutation 8: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> -
   * Goal 21. Weak Mutation 9: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> *
   * Goal 22. Weak Mutation 10: dominion.Randomness.nextRandomInt(I)I:29 - ReplaceArithmeticOperator + -> /
   * Goal 23. Weak Mutation 12: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp Negation of i
   * Goal 24. Weak Mutation 13: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC 1 i
   * Goal 25. Weak Mutation 14: dominion.Randomness.nextRandomInt(I)I:30 - InsertUnaryOp IINC -1 i
   * Goal 26. Weak Mutation 15: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator = null -> != null
   * Goal 27. Weak Mutation 17: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator <= -> ==
   * Goal 28. Weak Mutation 20: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceConstant - 0 -> 1
   * Goal 29. Weak Mutation 21: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      String string0 = Randomness.randomMember((List<String>) linkedList0);
      assertNull(string0);
  }

  //Test case number: 8
  /*
   * 16 covered goals:
   * Goal 1. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false
   * Goal 2. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - false
   * Goal 3. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - false
   * Goal 4. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I6 Branch 2 IFLE L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 5. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I12 Branch 3 IFEQ L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 6. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - false in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 7. randomMember(Ljava/util/List;)Ljava/lang/Object;_java.lang.IllegalArgumentException_EXPLICIT
   * Goal 8. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 33
   * Goal 9. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 34
   * Goal 10. [METHOD] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 11. Weak Mutation 15: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator = null -> != null
   * Goal 12. Weak Mutation 16: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator <= -> -1
   * Goal 13. Weak Mutation 19: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceConstant - 1 -> 0
   * Goal 14. Weak Mutation 21: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator == -> !=
   * Goal 15. Weak Mutation 22: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:34 - ReplaceConstant - Expected non-empty list -> 
   * Goal 16. Weak Mutation 23: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:34 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<String>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  //Test case number: 9
  /*
   * 9 covered goals:
   * Goal 1. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - true
   * Goal 2. Branch dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: I3 Branch 1 IFNULL L33 - true in context: dominion.Randomness:randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 3. randomMember(Ljava/util/List;)Ljava/lang/Object;_java.lang.IllegalArgumentException_EXPLICIT
   * Goal 4. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 33
   * Goal 5. dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;: Line 34
   * Goal 6. [METHOD] dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;
   * Goal 7. Weak Mutation 15: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:33 - ReplaceComparisonOperator = null -> != null
   * Goal 8. Weak Mutation 22: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:34 - ReplaceConstant - Expected non-empty list -> 
   * Goal 9. Weak Mutation 23: dominion.Randomness.randomMember(Ljava/util/List;)Ljava/lang/Object;:34 - ReplaceComparisonOperator == -> !=
   */

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }
}
