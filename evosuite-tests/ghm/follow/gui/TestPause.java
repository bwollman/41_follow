/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.FollowAppAction;
import ghm.follow.gui.Pause;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.plaf.FontUIResource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestPause {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Pause pause0 = new Pause((FollowApp) null);
      pause0.setIconByState(true);
      assertEquals(FollowAppAction.ActionContext.SINGLE_FILE, pause0.getContext());
  }

  @Test
  public void test1()  throws Throwable  {
      Pause pause0 = new Pause((FollowApp) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "ToolTipText", (-1056), "ToolTipText");
      // Undeclared exception!
      try {
        pause0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Pause pause0 = new Pause((FollowApp) null);
      assertNotNull(pause0);
      
      File file0 = new File(")", ")");
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(")", (Icon) null, false);
      FontUIResource fontUIResource0 = (FontUIResource)jRadioButtonMenuItem0.getFont();
      FileFollowingPane fileFollowingPane0 = new FileFollowingPane(file0, 30, 30, false, (Font) fontUIResource0, 30);
      pause0.playPausePane(fileFollowingPane0);
      assertEquals(false, fileFollowingPane0.isFollowingPaused());
  }
}
