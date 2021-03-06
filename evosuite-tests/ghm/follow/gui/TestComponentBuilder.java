/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.gui.ComponentBuilder;
import ghm.follow.gui.FollowAppAction;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestComponentBuilder {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z");
      HashMap<String, FollowAppAction> hashMap0 = new HashMap<String, FollowAppAction>();
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle((Reader) stringReader0);
      // Undeclared exception!
      try {
        ComponentBuilder.buildToolsMenu((ResourceBundle) propertyResourceBundle0, hashMap0);
        fail("Expecting exception: MissingResourceException");
      } catch(MissingResourceException e) {
        /*
         * Can't find resource for bundle java.util.PropertyResourceBundle, key menu.Tools.name
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      HashMap<String, FollowAppAction> hashMap0 = new HashMap<String, FollowAppAction>();
      // Undeclared exception!
      try {
        ComponentBuilder.buildToolBar(hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      HashMap<String, FollowAppAction> hashMap0 = new HashMap<String, FollowAppAction>();
      // Undeclared exception!
      try {
        ComponentBuilder.buildHelpMenu((ResourceBundle) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      HashMap<String, FollowAppAction> hashMap0 = new HashMap<String, FollowAppAction>();
      // Undeclared exception!
      try {
        ComponentBuilder.buildEditMenu((ResourceBundle) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      HashMap<String, FollowAppAction> hashMap0 = new HashMap<String, FollowAppAction>();
      // Undeclared exception!
      try {
        ComponentBuilder.buildMenuBar((ResourceBundle) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        ComponentBuilder.buildPopupMenu((HashMap<String, FollowAppAction>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        ComponentBuilder.buildWindowMenu((ResourceBundle) null, (HashMap<String, FollowAppAction>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
