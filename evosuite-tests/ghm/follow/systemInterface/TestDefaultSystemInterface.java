/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.systemInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.FollowApp;
import ghm.follow.systemInterface.DefaultSystemInterface;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDefaultSystemInterface {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultSystemInterface defaultSystemInterface0 = new DefaultSystemInterface((FollowApp) null);
      // Undeclared exception!
      try {
        defaultSystemInterface0.exit((-169));
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }
}