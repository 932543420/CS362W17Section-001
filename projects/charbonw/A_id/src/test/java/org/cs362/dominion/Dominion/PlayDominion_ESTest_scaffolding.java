/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 27 04:25:37 GMT 2017
 */

package org.cs362.dominion.Dominion;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PlayDominion_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.cs362.dominion.Dominion.PlayDominion"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("os.name", "Windows 10"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Cole"); 
    java.lang.System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_121\\jre"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Cole\\workspace\\Project 3\\A_id"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Cole\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("line.separator", "\r\n"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.windows.WToolkit"); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("file.separator", "\\"); 
    java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.Win32GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.awt.windows.WPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "C:\\Users\\Cole\\AppData\\Local\\Temp\\EvoSuite_pathingJar4932859462292942667.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
    java.lang.System.setProperty("java.endorsed.dirs", "C:\\Program Files\\Java\\jdk1.8.0_121\\jre\\lib\\endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "C:\\Program Files\\Java\\jdk1.8.0_121\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_121-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_121"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.version", "25.121-b13"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.version", "10.0"); 
    java.lang.System.setProperty("path.separator", ";"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Cole"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PlayDominion_ESTest_scaffolding.class.getClassLoader() ,
      "org.cs362.dominion.Dominion.Card$Type",
      "org.cs362.dominion.Dominion.GameState",
      "org.cs362.dominion.Dominion.Card$1",
      "org.cs362.dominion.Dominion.Card$2",
      "org.cs362.dominion.Dominion.Card$5",
      "org.cs362.dominion.Dominion.PlayDominion",
      "org.cs362.dominion.Dominion.Card$6",
      "org.cs362.dominion.Dominion.Card$3",
      "org.cs362.dominion.Dominion.Card$4",
      "org.cs362.dominion.Dominion.Card$9",
      "org.cs362.dominion.Dominion.Card$7",
      "org.cs362.dominion.Dominion.Card$8",
      "org.cs362.dominion.Dominion.Player",
      "org.cs362.dominion.Dominion.Card$10",
      "org.cs362.dominion.Dominion.Card",
      "org.cs362.dominion.Dominion.Card$11",
      "org.cs362.dominion.Dominion.Card$12",
      "org.cs362.dominion.Dominion.Card$13",
      "org.cs362.dominion.Dominion.GameState$Supply"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PlayDominion_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.cs362.dominion.Dominion.Card$Type",
      "org.cs362.dominion.Dominion.Card$1",
      "org.cs362.dominion.Dominion.Card$2",
      "org.cs362.dominion.Dominion.Card$3",
      "org.cs362.dominion.Dominion.Card$4",
      "org.cs362.dominion.Dominion.Card$5",
      "org.cs362.dominion.Dominion.Card$6",
      "org.cs362.dominion.Dominion.Card$7",
      "org.cs362.dominion.Dominion.Card$8",
      "org.cs362.dominion.Dominion.Card$9",
      "org.cs362.dominion.Dominion.Card$10",
      "org.cs362.dominion.Dominion.Card$11",
      "org.cs362.dominion.Dominion.Card$12",
      "org.cs362.dominion.Dominion.Card$13",
      "org.cs362.dominion.Dominion.Card"
    );
  }
}
