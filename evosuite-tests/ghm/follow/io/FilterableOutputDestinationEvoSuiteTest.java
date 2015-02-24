/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.io.FilteredDestination;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.JTextPaneDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchEngine;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FilterableOutputDestinationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      JTextComponentDestination jTextComponentDestination0 = new JTextComponentDestination((JTextComponent) jTextArea0, false);
      jTextComponentDestination0.addView((OutputDestination) jTextComponentDestination0);
      // Undeclared exception!
      try {
        jTextComponentDestination0.notifyViews("");
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JEditorPane jEditorPane0 = new JEditorPane();
      JTextComponentDestination jTextComponentDestination0 = new JTextComponentDestination((JTextComponent) jEditorPane0, false);
      JTextPaneDestination jTextPaneDestination0 = new JTextPaneDestination((JTextPane) null, false);
      jTextComponentDestination0.removeView((OutputDestination) jTextPaneDestination0);
      assertEquals(false, jTextPaneDestination0.autoPositionCaret());
  }

  @Test
  public void test2()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      JTextComponentDestination jTextComponentDestination0 = new JTextComponentDestination((JTextComponent) jTextArea0, false);
      FilteredDestination filteredDestination0 = new FilteredDestination((JTextComponent) jTextArea0, (SearchEngine) null, "6N4G\"/m:E", false);
      filteredDestination0.addView((OutputDestination) jTextComponentDestination0);
      filteredDestination0.removeView((OutputDestination) filteredDestination0);
      assertEquals(false, filteredDestination0.autoPositionCaret());
  }

  @Test
  public void test3()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      JTextComponentDestination jTextComponentDestination0 = new JTextComponentDestination((JTextComponent) jTextArea0, false);
      FilteredDestination filteredDestination0 = new FilteredDestination((JTextComponent) jTextArea0, (SearchEngine) null, "6N4G\"/m:E", false);
      filteredDestination0.addView((OutputDestination) jTextComponentDestination0);
      filteredDestination0.removeView((OutputDestination) jTextComponentDestination0);
      assertEquals(false, filteredDestination0.autoPositionCaret());
  }

  @Test
  public void test4()  throws Throwable  {
      JEditorPane jEditorPane0 = new JEditorPane();
      SearchEngine searchEngine0 = new SearchEngine(1);
      FilteredDestination filteredDestination0 = new FilteredDestination((JTextComponent) jEditorPane0, searchEngine0, "", false);
      filteredDestination0.notifyViews("");
      assertEquals(false, filteredDestination0.autoPositionCaret());
  }
}
