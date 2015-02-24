/*
 * This file was automatically generated by EvoSuite
 */

package ghm.follow.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ghm.follow.config.FollowAppAttributes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestFollowAppAttributes {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          FollowAppAttributes followAppAttributes0 = null;
          try {
            followAppAttributes0 = new FollowAppAttributes();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"/home/ac1gf/.followApp.properties\" \"write\")
             * java.lang.Thread.getStackTrace(Thread.java:1567)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:165)
             * ghm.follow.config.FollowAppAttributes.getDefaultProperties(FollowAppAttributes.java:678)
             * ghm.follow.config.FollowAppAttributes.<init>(FollowAppAttributes.java:116)
             * ghm.follow.config.FollowAppAttributes.<init>(FollowAppAttributes.java:95)
             * sun.reflect.GeneratedConstructorAccessor15.newInstance(Unknown Source)
             * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             * java.lang.reflect.Constructor.newInstance(Constructor.java:525)
             * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             * java.util.concurrent.FutureTask.run(FutureTask.java:166)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             * java.lang.Thread.run(Thread.java:722)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("", "");
      FollowAppAttributes followAppAttributes0 = null;
      try {
        followAppAttributes0 = new FollowAppAttributes(file0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * / (Is a directory)
         */
      }
  }
}
