/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.search.ClearHighlights;
import java.awt.event.ActionEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestClearHighlights {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClearHighlights clearHighlights0 = new ClearHighlights((FollowApp) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "LOWER_LEADING_CORNER", 0, "LOWER_LEADING_CORNER", 0);
      // Undeclared exception!
      try {
        clearHighlights0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}