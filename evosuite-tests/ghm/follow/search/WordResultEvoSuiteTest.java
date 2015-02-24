/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.search.WordResult;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WordResultEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WordResult wordResult0 = new WordResult(0, 0, (String) null, 0);
      assertNotNull(wordResult0);
      
      String string0 = wordResult0.toString();
      assertNotNull(string0);
      assertEquals(1, wordResult0.termStartLine);
      assertEquals(0, wordResult0.termEndLine);
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      WordResult wordResult0 = new WordResult(1144, 362, "", 0);
      assertNotNull(wordResult0);
      
      wordResult0.start = (-1237);
      wordResult0.setLineOffset(362);
      wordResult0.toString();
      assertEquals((-1598), wordResult0.termStartLine);
  }

  @Test
  public void test2()  throws Throwable  {
      WordResult wordResult0 = new WordResult(1303, 1303, "HD<=`R }t'[M");
      assertEquals(0, wordResult0.termStartLine);
      
      wordResult0.setLineOffset(0);
      String string0 = wordResult0.toString();
      assertEquals(1304, wordResult0.termStartLine);
      assertEquals("1304-1303", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      WordResult wordResult0 = new WordResult(1303, 1303, "HD<=`R }t'[M");
      wordResult0.setLineOffset(0);
      wordResult0.termStartLine = 1303;
      String string0 = wordResult0.toString();
      assertEquals("1303", wordResult0.toString());
      assertEquals("1303", string0);
  }
}