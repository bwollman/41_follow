/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.io.JTextPaneDestination;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JTextPaneDestinationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.setAutoPositionCaret(true);
      assertEquals(true, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test1()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, true);
      assertNotNull(jTextPaneDestination0);
      
      boolean boolean0 = jTextPaneDestination0.autoPositionCaret();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.removeFilteredView();
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test3()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.addFilteredView();
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test4()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.setJTextArea(jTextPane0);
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      JTextPane jTextPane0 = new JTextPane((StyledDocument) defaultStyledDocument0);
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, true);
      assertNotNull(jTextPaneDestination0);
      
      JTextPane jTextPane1 = jTextPaneDestination0.getJTextPane();
      assertNotNull(jTextPane1);
      assertEquals(true, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test6()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.print("");
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test7()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, true);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.print("");
      assertEquals(true, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      JTextPane jTextPane0 = new JTextPane((StyledDocument) defaultStyledDocument0);
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, false);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.clear();
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test9()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination(jTextPane0, true);
      assertNotNull(jTextPaneDestination0);
      
      jTextPaneDestination0.clear();
      assertEquals(true, jTextPaneDestination0.autoPositionCaret());
  }
}
