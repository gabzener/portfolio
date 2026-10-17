
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//----------------------------------------------------------------------
//
// File generated at: 2026/10/16 -- 11:39:59
// Seed: {1792,143597,745879}
//
//----------------------------------------------------------------------



package aed.individual3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd3 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(112,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(4,0,2) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_001 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_001")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_001")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_002")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] {  })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_002")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_003")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_003")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_004")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,2 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_004")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_005")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -13,13 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_005")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_006")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -9,4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_006")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_007")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_007")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_008")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_008")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_009")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,2,3 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_009")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_010")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,4,6 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_010")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_011")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-5,-6 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_011")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_012")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,14,-2 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_012")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_013")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -13,-6,-8,1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_013")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_014")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -12,8,12,null })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_014")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_015")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -10,-1,8,null })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_015")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_016")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,-2,-1,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_016")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_017")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,1,0,-1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_017")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_018")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-8,null,-16 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_018")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_019")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_019")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_020")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,null,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_020")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_021")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,1,2,0 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_021")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_022")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,3,7,11 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_022")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_023")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-2,0,2,4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_023")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_024")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,2,0,-2,-4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_024")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_025")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,6,-5,-7,-9 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_025")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_026")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,-8,-20,null,-32 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_026")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_027")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,-3,-10,-17,null })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_027")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_028")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 5,10,15,20,-7 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_028")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_029")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-2,0,2,4,5 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_029")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_030")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,-2,-1,0,-1,1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_030")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_031")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -2,-5,-4,-8,-11,-14 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_031")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_032 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_032")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -2,-1,0,null,1,2,3 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_032")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_033 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_033")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -2,3,8,13,-3,18,23 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_033")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_034 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_034")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,null,0,null,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_034")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_035 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_035")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-11,-18,-25,-32,-39,null,-46 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_035")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_036 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_036")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,1,null,1,3,5,7,9 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_036")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_037 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_037")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,-2,-3,-6,-4,-5,null,null,-6 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_037")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_038 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_038")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 3,-5,-13,-21,null,-29,null,-37,-45 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_038")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_039 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_039")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,6,6,10,null,6,null,6,6 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_039")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_040 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_040")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -10,7,24,41,null,null,58,75,92,109 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_040")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_041 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_041")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-3,null,-6,-9,-12,-15,-18,-21,null })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_041")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_042 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_042")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,2,4,null,6,-1,8,10,12,14 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_042")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_043 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_043")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,7,8,9,null,10,11,12,13,14 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_043")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_044 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_044")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 13,-10,-33,-56,null,-79,-102,-125,-148,-171 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_044")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_045 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_045")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -13,-2,8,null,29,50,71,null,null,92,113 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_045")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_046 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_046")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 7,1,-1,-5,-11,-17,-23,-29,-35,null,-41 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_046")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_047 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_047")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 10,-8,-26,-44,-62,-80,null,-98,-116,-134,-152 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_047")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_048 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_048")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -7,-1,5,11,17,23,29,35,41,47,53,59 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_048")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_049 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_049")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,2,-3,null,-8,-13,-18,-23,-28,-33,-38,null })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_049")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_050 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_050")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_050")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_051 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_051")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,0,-2,-4,-6,2,-8,-10,-12,-14,-16,-18 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_051")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_052 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_052")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 8,-5,-18,-31,-44,-57,null,-70,-83,4,-96,-109 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_052")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_053 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_053")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 10,-11,-32,-53,-74,1,-95,-116,null,-137,-158,-179 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_053")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_054 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_054")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -11,-2,7,16,25,null,null,34,43,52,61,70,79 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_054")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_055 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_055")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,3,9,15,null,21,null,27,33,39,null,45,51 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_055")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_056 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_056")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,2,5,8,11,14,17,20,2,23,26,29,32,35 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_056")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_057 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_057")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,0,-1,null,-2,-3,-4,-5,null,null,-6,-7,-8,null })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_057")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_058 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_058")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,2,5,8,11,14,17,20,23,4,26,29,32,35,38 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_058")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("isArithmeticSequence")
  public void test_isArithmeticSequence_059 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_isArithmeticSequence_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_isArithmeticSequence_059")) ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,0,0,0,0,null,0,0,0,0,0,0,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_isArithmeticSequence_059")) ;
    ResultsHandler.add_result(new String("isArithmeticSequence"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_060 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_060")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_060")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_061 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_061")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_061")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_062 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_062")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,14,13,19,11,1,1,20 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_062")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_063 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_063")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,18,8,14,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_063")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_064 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_064")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 14,12,11,6,3,9,17,15,5,10,14,3,3,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_064")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_065 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_065")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 3,9,16 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_065")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_066 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_066")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,4,11,4 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_066")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_067 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_067")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_067")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_068 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_068")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 2,13,13,6,3,6,9,3,10,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_068")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_069 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_069")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,8,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_069")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_070 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_070")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 15,16,12,9,8,4,13,20,8,4,15,19,12,12,5,4,11,8,11,10 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_070")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_071 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_071")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 16,1,17,6,20,12,2,12,17,17,11,13,16,19,18,19,16,1,9 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_071")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_072 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_072")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,12,19,19,15,9,6,5,16,15,11,20,18,11 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_072")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_073 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_073")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,17,9,15,6,8,17,4,15,17,19,6,9,6,8,6,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_073")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_074 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_074")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,5,10,2,16,5,11,12,3,7,3,10,7,2,19,16 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_074")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_075 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_075")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 20,9 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_075")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_076 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_076")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 18,2,8,14,9,18,15,20,8,10,12,19,1,15,18,19,2 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_076")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_077 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_077")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_077")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_078 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_078")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 12,10 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_078")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_079 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_079")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 14,18,11,11 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(14) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_079")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_080 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_080")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 11,18,8,16,12,14,17,14,5,18 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_080")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_081 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_081")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 2,1,15,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_081")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_082 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_082")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 8,12,15,19,6 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_082")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_083 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_083")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,7,4,7,10,13,18,13,12,8,13,11,13 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_083")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_084 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_084")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 20,15,1 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_084")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_085 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_085")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 4,20,6,12,14,6,13,13,7,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(4) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_085")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_086 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_086")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 5,15,10,2,9,4,3,13,20 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_086")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_087 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_087")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,13,19,17,9,10,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(1) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_087")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_088 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_088")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,2,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_088")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_089 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_089")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,2,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_089")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_090 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_090")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 8,18,10,1 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(8) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(18) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_090")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_091 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_091")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 14,17,3,13 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_091")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_092 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_092")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 15,8,15,18,17,12,18,5,15,6,14,5,6 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(15) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_092")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_093 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_093")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,15,17,3,11,16 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_093")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_094 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_094")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,20,9,12,5,7,1,12,4,1,5,9,14,19,18,16,2,3,3,10 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_094")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_095 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_095")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,9,18,8,17,6,1,9,11,20,11,4,7,8 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_095")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_096 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_096")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_096")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_097 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_097")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 3,2,6,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(6) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_097")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_098 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_098")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 11,9,8,3,2,6,19,3,11,2,10,18,12 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_098")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_099 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_099")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 11,13,5,9,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_099")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_100 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_100")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 11 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_100")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_101 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_101")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 13,7,7,12,1,18,19,3,11,16,6,9,2,2,5,14 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(18) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(13) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_101")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_102 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_102")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,7,19,2,18,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(9) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_102")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_103 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_103") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_103")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,19,18,13,8,13,9,4,12,6,2 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_103")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_104 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_104") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_104")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,7,11,1,15,18,6,9,5,9,16,2,16,4,6,8,9,16,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(15) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_104")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_105 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_105") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_105")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 18,14,19,2,17,12,10 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(18) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_105")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_106 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_106") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_106")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,10,14 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_106")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_107 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_107") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_107")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_107")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_108 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_108") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_108")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 3,17,8,2,19,15,6,9,13,9,11,7,6,12 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(3) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_108")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_109 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_109") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_109")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 3,19,3,14,17,12,16,18,6,8,4,8 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_109")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_110 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_110") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_110")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 7,20,18,10,1,3,5,12,17,19,19,16,11,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(7) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_13).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_110")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_111 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_111") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_111")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,4,11,13,20,8,12,13,20,20,8,2,5,5 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_111")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("ordered_iterator")
  public void test_ordered_iterator_112 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<NodePositionList<Integer>,Void> v_0 = null ;
NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TestResult<Iterator<Integer>,Void> v_14 = null ;
Iterator<Integer> v_15 = null ;
TestResult<Iterator<Integer>,Void> v_16 = null ;
Iterator<Integer> v_17 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_ordered_iterator_112") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_ordered_iterator_112")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 13,20,14,8,11,18,7,15,4,5,7,17,13,12,9,4,6,5,1 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_14 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_14.checkResult(null) ;
}
if (ok_sofar)
  v_15 = v_14.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_15).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_16 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_16.checkResult(null) ;
}
if (ok_sofar)
  v_17 = v_16.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(13) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_ordered_iterator_112")) ;
    ResultsHandler.add_result(new String("ordered_iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd3";
}


static class NIteratorUtils {
  static HashMap<Object,String> names = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    names = null;
    nameCounter = 0;
  }

  static String getName(Object obj, String nameType) {
    if (names == null)
      names = new HashMap<Object,String>();
    String name = names.get(obj);
    if (name == null) {
      name = nameType+"_"+nameCounter.toString();
      names.put(obj,name);
      nameCounter++;
    }
    return name;
  }

  public static String printer(Object obj) {
    if (obj instanceof OrderedIterator) {
      return getName(obj, "iterator");
    } else if (obj instanceof PositionList<?>) {
      return getName(obj, "positionlist");
    } else return TestUtils.printer(obj, x -> printer(x));
  }

}





























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.left())+","+print.apply(p.right())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Tree<?>) {
      Tree<?> t = (Tree<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("\n");
      buf.append(t.toString());
      buf.append("\n");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  static <E> boolean attributeEquals(TestCall<?,?> call, String attributeName, E value, E expected) {
    if (expected == null) {
      if (value != null) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value null");
        return false;
      }
    } else {
      if (!expected.equals(value)) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value \n  "+TestUtils.print(expected));
        return false;
      }
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> Iterable<E> returnIterable(Iterable<E> iterable) {
    return iterable;
  }

  static boolean redefinesToString(TestCall<?,?> call, Object obj, String result) {
    String objectToString =
      obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
    if (result.equals(objectToString)) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned the same result as the Object toString method.\n"+
           "The class should redefine the public toString() method.\n");
        return false;
    }
    return true;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class Construct_iterator extends TestCall<Iterator<Integer>,Void>
{
  NodePositionList<Integer> x_1;
  NodePositionList<Integer> x_1_orig;
  String callString;
  
  public Construct_iterator (NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("new Iterator<Integer>")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Iterator<Integer> call () 
  {
    return new OrderedIterator(x_1) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    return true ;
  }
  
}


static class Construct_list extends TestCall<NodePositionList<Integer>,Void>
{
  Integer[] x_1;
  Integer[] x_1_orig;
  String callString;
  
  public Construct_list (Integer[] x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = x_1.clone() ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("new NodePositionList<Integer>")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public NodePositionList<Integer> call () 
  {
    return new NodePositionList<Integer>(x_1) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged_array(x_1,x_1_orig))
      return false ;
    return true ;
  }
  
}


static class HasNext extends TestCall<Boolean,Boolean>
{
  java.util.Iterator<Integer> x_1;
  String callString;
  
  public HasNext (java.util.Iterator<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".hasNext")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.hasNext() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Next extends TestCall<Integer,Object>
{
  java.util.Iterator<Integer> x_1;
  String callString;
  
  public Next (java.util.Iterator<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".next")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Integer call () 
  {
    return x_1.next() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class IsArithmeticSequence extends TestCall<Boolean,Boolean>
{
  NodePositionList<Integer> x_1;
  NodePositionList<Integer> x_1_orig;
  String callString;
  
  public IsArithmeticSequence (NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Utils.isArithmeticSequence")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Utils.isArithmeticSequence(x_1) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}










static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
    NIteratorUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return NIteratorUtils.printer(obj) ;
  }
  
}


}
