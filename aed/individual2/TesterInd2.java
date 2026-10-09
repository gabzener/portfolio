
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
// File generated at: 2026/9/29 -- 15:18:5
// Seed: {1790,687878,192973}
//
//----------------------------------------------------------------------



package aed.individual2;

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
public class TesterInd2 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(267,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_001 () 
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
TestData.testName = new String("test_exists_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_001")) ;
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
    ResultsHandler.stopTest(new String("test_exists_001")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_002 () 
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
TestData.testName = new String("test_exists_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_002")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray())).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_002")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_003 () 
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
TestData.testName = new String("test_exists_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_003")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_003")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_004 () 
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
TestData.testName = new String("test_exists_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_004")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_004")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_005 () 
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
TestData.testName = new String("test_exists_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_005")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_005")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_006 () 
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
TestData.testName = new String("test_exists_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_006")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_006")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_007 () 
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
TestData.testName = new String("test_exists_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_007")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_007")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_008 () 
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
TestData.testName = new String("test_exists_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_008")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_008")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_009 () 
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
TestData.testName = new String("test_exists_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_009")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_009")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_010 () 
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
TestData.testName = new String("test_exists_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_010")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_010")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_011 () 
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
TestData.testName = new String("test_exists_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_011")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_011")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_012 () 
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
TestData.testName = new String("test_exists_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_012")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_012")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_013 () 
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
TestData.testName = new String("test_exists_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_013")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_013")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_014 () 
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
TestData.testName = new String("test_exists_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_014")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_014")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_015 () 
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
TestData.testName = new String("test_exists_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_015")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_015")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_016 () 
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
TestData.testName = new String("test_exists_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_016")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_016")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_017 () 
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
TestData.testName = new String("test_exists_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_017")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_017")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_018 () 
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
TestData.testName = new String("test_exists_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_018")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_018")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_019 () 
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
TestData.testName = new String("test_exists_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_019")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_019")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_020 () 
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
TestData.testName = new String("test_exists_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_020")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_020")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_021 () 
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
TestData.testName = new String("test_exists_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_021")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_021")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_022 () 
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
TestData.testName = new String("test_exists_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_022")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_022")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_023 () 
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
TestData.testName = new String("test_exists_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_023")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_023")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_024 () 
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
TestData.testName = new String("test_exists_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_024")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_024")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_025 () 
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
TestData.testName = new String("test_exists_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_025")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_025")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_026 () 
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
TestData.testName = new String("test_exists_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_026")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_026")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_027 () 
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
TestData.testName = new String("test_exists_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_027")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_027")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_028 () 
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
TestData.testName = new String("test_exists_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_028")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_028")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_029 () 
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
TestData.testName = new String("test_exists_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_029")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_029")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_030 () 
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
TestData.testName = new String("test_exists_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_030")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_030")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_031 () 
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
TestData.testName = new String("test_exists_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_031")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_031")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_032 () 
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
TestData.testName = new String("test_exists_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_032")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_032")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_033 () 
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
TestData.testName = new String("test_exists_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_033")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_033")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_034 () 
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
TestData.testName = new String("test_exists_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_034")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_034")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_035 () 
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
TestData.testName = new String("test_exists_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_035")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_035")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_036 () 
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
TestData.testName = new String("test_exists_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_036")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_036")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_037 () 
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
TestData.testName = new String("test_exists_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_037")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_037")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_038 () 
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
TestData.testName = new String("test_exists_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_038")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_038")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_039 () 
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
TestData.testName = new String("test_exists_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_039")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_039")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_040 () 
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
TestData.testName = new String("test_exists_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_040")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_040")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_041 () 
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
TestData.testName = new String("test_exists_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_041")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_041")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_042 () 
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
TestData.testName = new String("test_exists_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_042")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_042")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_043 () 
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
TestData.testName = new String("test_exists_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_043")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_043")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_044 () 
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
TestData.testName = new String("test_exists_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_044")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_044")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_045 () 
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
TestData.testName = new String("test_exists_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_045")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_045")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_046 () 
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
TestData.testName = new String("test_exists_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_046")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_046")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_047 () 
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
TestData.testName = new String("test_exists_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_047")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_047")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_048 () 
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
TestData.testName = new String("test_exists_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_048")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_048")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_049 () 
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
TestData.testName = new String("test_exists_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_049")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_049")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_050 () 
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
TestData.testName = new String("test_exists_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_050")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_exists_050")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("exists")
  public void test_exists_051 () 
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
TestData.testName = new String("test_exists_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_exists_051")) ;
if (ok_sofar)
  ok_sofar = new Exists(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_exists_051")) ;
    ResultsHandler.add_result(new String("exists"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_052 () 
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
TestData.testName = new String("test_universal_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_052")) ;
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
    ResultsHandler.stopTest(new String("test_universal_052")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_053 () 
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
TestData.testName = new String("test_universal_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_053")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_universal_053")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_054 () 
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
TestData.testName = new String("test_universal_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_054")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_054")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_055 () 
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
TestData.testName = new String("test_universal_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_055")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_055")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_056 () 
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
TestData.testName = new String("test_universal_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_056")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_056")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_057 () 
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
TestData.testName = new String("test_universal_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_057")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_057")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_058 () 
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
TestData.testName = new String("test_universal_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_058")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_058")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_059 () 
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
TestData.testName = new String("test_universal_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_059")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_059")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_060 () 
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
TestData.testName = new String("test_universal_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_060")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_060")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_061 () 
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
TestData.testName = new String("test_universal_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_061")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_061")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_062 () 
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
TestData.testName = new String("test_universal_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_062")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_062")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_063 () 
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
TestData.testName = new String("test_universal_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_063")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_063")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_064 () 
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
TestData.testName = new String("test_universal_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_064")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_064")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_065 () 
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
TestData.testName = new String("test_universal_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_065")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_065")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_066 () 
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
TestData.testName = new String("test_universal_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_066")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_066")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_067 () 
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
TestData.testName = new String("test_universal_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_067")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_universal_067")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_068 () 
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
TestData.testName = new String("test_universal_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_068")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_068")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_069 () 
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
TestData.testName = new String("test_universal_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_069")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_069")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_070 () 
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
TestData.testName = new String("test_universal_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_070")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_070")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_071 () 
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
TestData.testName = new String("test_universal_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_071")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_071")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_072 () 
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
TestData.testName = new String("test_universal_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_072")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_072")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_073 () 
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
TestData.testName = new String("test_universal_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_073")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_073")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_074 () 
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
TestData.testName = new String("test_universal_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_074")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_074")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_075 () 
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
TestData.testName = new String("test_universal_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_075")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_075")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_076 () 
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
TestData.testName = new String("test_universal_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_076")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_076")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_077 () 
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
TestData.testName = new String("test_universal_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_077")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_077")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_078 () 
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
TestData.testName = new String("test_universal_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_078")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_078")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_079 () 
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
TestData.testName = new String("test_universal_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_079")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_079")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_080 () 
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
TestData.testName = new String("test_universal_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_080")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_080")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_081 () 
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
TestData.testName = new String("test_universal_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_081")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_081")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_082 () 
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
TestData.testName = new String("test_universal_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_082")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_082")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_083 () 
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
TestData.testName = new String("test_universal_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_083")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_083")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_084 () 
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
TestData.testName = new String("test_universal_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_084")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_084")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_085 () 
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
TestData.testName = new String("test_universal_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_085")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_085")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_086 () 
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
TestData.testName = new String("test_universal_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_086")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_086")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_087 () 
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
TestData.testName = new String("test_universal_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_087")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_087")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_088 () 
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
TestData.testName = new String("test_universal_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_088")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_088")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_089 () 
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
TestData.testName = new String("test_universal_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_089")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_089")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_090 () 
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
TestData.testName = new String("test_universal_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_090")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_090")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_091 () 
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
TestData.testName = new String("test_universal_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_091")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_091")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_092 () 
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
TestData.testName = new String("test_universal_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_092")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_092")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_093 () 
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
TestData.testName = new String("test_universal_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_093")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_093")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_094 () 
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
TestData.testName = new String("test_universal_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_094")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_094")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_095 () 
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
TestData.testName = new String("test_universal_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_095")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_095")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_096 () 
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
TestData.testName = new String("test_universal_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_096")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_096")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_097 () 
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
TestData.testName = new String("test_universal_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_097")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_097")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_098 () 
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
TestData.testName = new String("test_universal_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_098")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_098")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_099 () 
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
TestData.testName = new String("test_universal_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_099")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_099")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_100 () 
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
TestData.testName = new String("test_universal_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_100")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_100")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_101 () 
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
TestData.testName = new String("test_universal_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_101")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_101")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_102 () 
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
TestData.testName = new String("test_universal_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_102")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_102")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("universal")
  public void test_universal_103 () 
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
TestData.testName = new String("test_universal_103") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_universal_103")) ;
if (ok_sofar)
  ok_sofar = new Universal(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_universal_103")) ;
    ResultsHandler.add_result(new String("universal"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_104 () 
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
TestData.testName = new String("test_precededBy_104") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_104")) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_104")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_105 () 
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
TestData.testName = new String("test_precededBy_105") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_105")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray())).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_105")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_106 () 
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
TestData.testName = new String("test_precededBy_106") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_106")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_106")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_107 () 
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
TestData.testName = new String("test_precededBy_107") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_107")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_107")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_108 () 
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
TestData.testName = new String("test_precededBy_108") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_108")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_108")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_109 () 
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
TestData.testName = new String("test_precededBy_109") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_109")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_109")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_110 () 
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
TestData.testName = new String("test_precededBy_110") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_110")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_110")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_111 () 
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
TestData.testName = new String("test_precededBy_111") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_111")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_111")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_112 () 
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
TestData.testName = new String("test_precededBy_112") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_112")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_112")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_113 () 
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
TestData.testName = new String("test_precededBy_113") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_113")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_113")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_114 () 
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
TestData.testName = new String("test_precededBy_114") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_114")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_114")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_115 () 
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
TestData.testName = new String("test_precededBy_115") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_115")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_115")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_116 () 
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
TestData.testName = new String("test_precededBy_116") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_116")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_116")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_117 () 
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
TestData.testName = new String("test_precededBy_117") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_117")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_117")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_118 () 
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
TestData.testName = new String("test_precededBy_118") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_118")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_118")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_119 () 
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
TestData.testName = new String("test_precededBy_119") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_119")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_119")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_120 () 
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
TestData.testName = new String("test_precededBy_120") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_120")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_120")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_121 () 
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
TestData.testName = new String("test_precededBy_121") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_121")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_121")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_122 () 
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
TestData.testName = new String("test_precededBy_122") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_122")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_122")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_123 () 
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
TestData.testName = new String("test_precededBy_123") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_123")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_123")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_124 () 
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
TestData.testName = new String("test_precededBy_124") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_124")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_124")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_125 () 
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
TestData.testName = new String("test_precededBy_125") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_125")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_125")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_126 () 
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
TestData.testName = new String("test_precededBy_126") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_126")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_126")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_127 () 
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
TestData.testName = new String("test_precededBy_127") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_127")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_127")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_128 () 
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
TestData.testName = new String("test_precededBy_128") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_128")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_128")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_129 () 
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
TestData.testName = new String("test_precededBy_129") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_129")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_129")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_130 () 
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
TestData.testName = new String("test_precededBy_130") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_130")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_130")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_131 () 
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
TestData.testName = new String("test_precededBy_131") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_131")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_131")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_132 () 
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
TestData.testName = new String("test_precededBy_132") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_132")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_132")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_133 () 
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
TestData.testName = new String("test_precededBy_133") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_133")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_133")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_134 () 
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
TestData.testName = new String("test_precededBy_134") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_134")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn"),new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_134")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_135 () 
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
TestData.testName = new String("test_precededBy_135") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_135")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_135")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_136 () 
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
TestData.testName = new String("test_precededBy_136") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_136")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_136")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_137 () 
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
TestData.testName = new String("test_precededBy_137") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_137")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_137")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_138 () 
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
TestData.testName = new String("test_precededBy_138") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_138")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_138")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_139 () 
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
TestData.testName = new String("test_precededBy_139") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_139")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_139")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_140 () 
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
TestData.testName = new String("test_precededBy_140") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_140")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_140")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_141 () 
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
TestData.testName = new String("test_precededBy_141") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_141")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_141")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_142 () 
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
TestData.testName = new String("test_precededBy_142") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_142")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_142")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_143 () 
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
TestData.testName = new String("test_precededBy_143") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_143")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_143")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_144 () 
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
TestData.testName = new String("test_precededBy_144") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_144")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_144")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_145 () 
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
TestData.testName = new String("test_precededBy_145") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_145")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_145")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_146 () 
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
TestData.testName = new String("test_precededBy_146") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_146")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_146")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_147 () 
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
TestData.testName = new String("test_precededBy_147") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_147")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_147")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_148 () 
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
TestData.testName = new String("test_precededBy_148") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_148")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_148")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_149 () 
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
TestData.testName = new String("test_precededBy_149") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_149")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_149")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_150 () 
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
TestData.testName = new String("test_precededBy_150") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_150")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_150")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_151 () 
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
TestData.testName = new String("test_precededBy_151") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_151")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_151")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_152 () 
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
TestData.testName = new String("test_precededBy_152") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_152")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_152")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_153 () 
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
TestData.testName = new String("test_precededBy_153") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_153")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("stop"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_153")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_154 () 
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
TestData.testName = new String("test_precededBy_154") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_154")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_154")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_155 () 
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
TestData.testName = new String("test_precededBy_155") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_155")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_155")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_156 () 
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
TestData.testName = new String("test_precededBy_156") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_156")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_156")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_157 () 
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
TestData.testName = new String("test_precededBy_157") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_157")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_157")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("precededBy")
  public void test_precededBy_158 () 
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
TestData.testName = new String("test_precededBy_158") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_precededBy_158")) ;
if (ok_sofar)
  ok_sofar = new PrecededBy(new String("turn"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_precededBy_158")) ;
    ResultsHandler.add_result(new String("precededBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_159 () 
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
TestData.testName = new String("test_followedBy_159") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_159")) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_159")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_160 () 
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
TestData.testName = new String("test_followedBy_160") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_160")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray())).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_160")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_161 () 
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
TestData.testName = new String("test_followedBy_161") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_161")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray())).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_161")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_162 () 
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
TestData.testName = new String("test_followedBy_162") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_162")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray())).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_162")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_163 () 
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
TestData.testName = new String("test_followedBy_163") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_163")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_163")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_164 () 
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
TestData.testName = new String("test_followedBy_164") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_164")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_164")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_165 () 
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
TestData.testName = new String("test_followedBy_165") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_165")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_165")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_166 () 
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
TestData.testName = new String("test_followedBy_166") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_166")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_166")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_167 () 
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
TestData.testName = new String("test_followedBy_167") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_167")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_167")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_168 () 
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
TestData.testName = new String("test_followedBy_168") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_168")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_168")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_169 () 
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
TestData.testName = new String("test_followedBy_169") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_169")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_169")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_170 () 
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
TestData.testName = new String("test_followedBy_170") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_170")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_170")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_171 () 
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
TestData.testName = new String("test_followedBy_171") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_171")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_171")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_172 () 
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
TestData.testName = new String("test_followedBy_172") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_172")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("open_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_172")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_173 () 
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
TestData.testName = new String("test_followedBy_173") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_173")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_173")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_174 () 
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
TestData.testName = new String("test_followedBy_174") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_174")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_174")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_175 () 
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
TestData.testName = new String("test_followedBy_175") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_175")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_175")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_176 () 
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
TestData.testName = new String("test_followedBy_176") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_176")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_176")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_177 () 
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
TestData.testName = new String("test_followedBy_177") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_177")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_177")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_178 () 
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
TestData.testName = new String("test_followedBy_178") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_178")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_178")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_179 () 
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
TestData.testName = new String("test_followedBy_179") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_179")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_179")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_180 () 
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
TestData.testName = new String("test_followedBy_180") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_180")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_180")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_181 () 
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
TestData.testName = new String("test_followedBy_181") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_181")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_181")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_182 () 
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
TestData.testName = new String("test_followedBy_182") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_182")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_182")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_183 () 
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
TestData.testName = new String("test_followedBy_183") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_183")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_183")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_184 () 
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
TestData.testName = new String("test_followedBy_184") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_184")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_184")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_185 () 
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
TestData.testName = new String("test_followedBy_185") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_185")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_185")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_186 () 
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
TestData.testName = new String("test_followedBy_186") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_186")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_186")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_187 () 
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
TestData.testName = new String("test_followedBy_187") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_187")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_187")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_188 () 
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
TestData.testName = new String("test_followedBy_188") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_188")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_188")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_189 () 
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
TestData.testName = new String("test_followedBy_189") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_189")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_189")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_190 () 
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
TestData.testName = new String("test_followedBy_190") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_190")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn"),new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_190")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_191 () 
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
TestData.testName = new String("test_followedBy_191") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_191")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_191")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_192 () 
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
TestData.testName = new String("test_followedBy_192") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_192")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_192")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_193 () 
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
TestData.testName = new String("test_followedBy_193") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_193")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_193")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_194 () 
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
TestData.testName = new String("test_followedBy_194") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_194")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_194")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_195 () 
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
TestData.testName = new String("test_followedBy_195") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_195")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_195")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_196 () 
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
TestData.testName = new String("test_followedBy_196") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_196")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_196")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_197 () 
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
TestData.testName = new String("test_followedBy_197") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_197")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_197")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_198 () 
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
TestData.testName = new String("test_followedBy_198") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_198")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_198")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_199 () 
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
TestData.testName = new String("test_followedBy_199") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_199")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_199")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_200 () 
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
TestData.testName = new String("test_followedBy_200") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_200")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_200")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_201 () 
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
TestData.testName = new String("test_followedBy_201") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_201")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_201")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_202 () 
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
TestData.testName = new String("test_followedBy_202") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_202")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_202")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_203 () 
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
TestData.testName = new String("test_followedBy_203") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_203")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_203")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_204 () 
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
TestData.testName = new String("test_followedBy_204") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_204")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_204")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_205 () 
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
TestData.testName = new String("test_followedBy_205") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_205")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_205")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_206 () 
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
TestData.testName = new String("test_followedBy_206") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_206")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_206")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_207 () 
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
TestData.testName = new String("test_followedBy_207") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_207")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_207")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_208 () 
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
TestData.testName = new String("test_followedBy_208") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_208")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn"),new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_208")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_209 () 
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
TestData.testName = new String("test_followedBy_209") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_209")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("stop"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_209")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_210 () 
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
TestData.testName = new String("test_followedBy_210") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_210")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_210")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_211 () 
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
TestData.testName = new String("test_followedBy_211") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_211")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("turn"),new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(true) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_211")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_212 () 
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
TestData.testName = new String("test_followedBy_212") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_212")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_212")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_213 () 
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
TestData.testName = new String("test_followedBy_213") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_213")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("close_door"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_213")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_214 () 
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
TestData.testName = new String("test_followedBy_214") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_214")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("move"),new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_214")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("followedBy")
  public void test_followedBy_215 () 
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
TestData.testName = new String("test_followedBy_215") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_followedBy_215")) ;
if (ok_sofar)
  ok_sofar = new FollowedBy(new String("open_door"),new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(false) ;
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
    ResultsHandler.stopTest(new String("test_followedBy_215")) ;
    ResultsHandler.add_result(new String("followedBy"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_216 () 
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
TestData.testName = new String("test_deleteStates_216") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_216")) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_216")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_217 () 
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
TestData.testName = new String("test_deleteStates_217") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_217")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_217")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_218 () 
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
TestData.testName = new String("test_deleteStates_218") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_218")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_218")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_219 () 
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
TestData.testName = new String("test_deleteStates_219") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_219")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_219")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_220 () 
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
TestData.testName = new String("test_deleteStates_220") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_220")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_220")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_221 () 
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
TestData.testName = new String("test_deleteStates_221") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_221")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_221")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_222 () 
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
TestData.testName = new String("test_deleteStates_222") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_222")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_222")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_223 () 
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
TestData.testName = new String("test_deleteStates_223") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_223")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_223")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_224 () 
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
TestData.testName = new String("test_deleteStates_224") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_224")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_224")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_225 () 
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
TestData.testName = new String("test_deleteStates_225") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_225")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_225")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_226 () 
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
TestData.testName = new String("test_deleteStates_226") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_226")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_226")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_227 () 
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
TestData.testName = new String("test_deleteStates_227") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_227")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_227")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_228 () 
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
TestData.testName = new String("test_deleteStates_228") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_228")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_228")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_229 () 
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
TestData.testName = new String("test_deleteStates_229") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_229")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_229")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_230 () 
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
TestData.testName = new String("test_deleteStates_230") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_230")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_230")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_231 () 
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
TestData.testName = new String("test_deleteStates_231") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_231")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_231")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_232 () 
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
TestData.testName = new String("test_deleteStates_232") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_232")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_232")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_233 () 
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
TestData.testName = new String("test_deleteStates_233") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_233")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_233")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_234 () 
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
TestData.testName = new String("test_deleteStates_234") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_234")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_234")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_235 () 
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
TestData.testName = new String("test_deleteStates_235") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_235")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_235")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_236 () 
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
TestData.testName = new String("test_deleteStates_236") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_236")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_236")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_237 () 
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
TestData.testName = new String("test_deleteStates_237") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_237")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_237")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_238 () 
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
TestData.testName = new String("test_deleteStates_238") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_238")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_238")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_239 () 
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
TestData.testName = new String("test_deleteStates_239") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_239")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_239")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_240 () 
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
TestData.testName = new String("test_deleteStates_240") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_240")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_240")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_241 () 
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
TestData.testName = new String("test_deleteStates_241") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_241")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_241")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_242 () 
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
TestData.testName = new String("test_deleteStates_242") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_242")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_242")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_243 () 
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
TestData.testName = new String("test_deleteStates_243") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_243")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_243")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_244 () 
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
TestData.testName = new String("test_deleteStates_244") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_244")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_244")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_245 () 
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
TestData.testName = new String("test_deleteStates_245") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_245")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_245")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_246 () 
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
TestData.testName = new String("test_deleteStates_246") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_246")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_246")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_247 () 
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
TestData.testName = new String("test_deleteStates_247") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_247")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_247")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_248 () 
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
TestData.testName = new String("test_deleteStates_248") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_248")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_248")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_249 () 
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
TestData.testName = new String("test_deleteStates_249") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_249")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_249")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_250 () 
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
TestData.testName = new String("test_deleteStates_250") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_250")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_250")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_251 () 
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
TestData.testName = new String("test_deleteStates_251") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_251")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_251")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_252 () 
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
TestData.testName = new String("test_deleteStates_252") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_252")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_252")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_253 () 
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
TestData.testName = new String("test_deleteStates_253") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_253")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_253")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_254 () 
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
TestData.testName = new String("test_deleteStates_254") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_254")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_254")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_255 () 
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
TestData.testName = new String("test_deleteStates_255") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_255")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move"),new String("turn") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_255")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_256 () 
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
TestData.testName = new String("test_deleteStates_256") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_256")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_256")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_257 () 
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
TestData.testName = new String("test_deleteStates_257") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_257")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_257")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_258 () 
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
TestData.testName = new String("test_deleteStates_258") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_258")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_258")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_259 () 
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
TestData.testName = new String("test_deleteStates_259") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_259")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("close_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_259")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_260 () 
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
TestData.testName = new String("test_deleteStates_260") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_260")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_260")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_261 () 
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
TestData.testName = new String("test_deleteStates_261") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_261")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("move"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_261")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_262 () 
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
TestData.testName = new String("test_deleteStates_262") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_262")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_262")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_263 () 
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
TestData.testName = new String("test_deleteStates_263") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_263")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_263")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_264 () 
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
TestData.testName = new String("test_deleteStates_264") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_264")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("close_door") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_264")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_265 () 
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
TestData.testName = new String("test_deleteStates_265") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_265")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("open_door"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("turn") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_265")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_266 () 
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
TestData.testName = new String("test_deleteStates_266") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_266")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("stop"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_266")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("deleteStates")
  public void test_deleteStates_267 () 
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
TestData.testName = new String("test_deleteStates_267") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_deleteStates_267")) ;
if (ok_sofar)
  ok_sofar = new DeleteStates(new String("turn"),new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))).doCall().checkResult(new NodePositionList<es.upm.aedlib.set.Set<String>>(TestUtils.toGenericArray(new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("move") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] { new String("open_door"),new String("stop") }),new es.upm.aedlib.set.PositionListSet<String>(new String[] {  })))) ;
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
    ResultsHandler.stopTest(new String("test_deleteStates_267")) ;
    ResultsHandler.add_result(new String("deleteStates"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd2";
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

static class Exists extends TestCall<Boolean,Boolean>
{
  String x_1;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_2;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_2_orig;
  String callString;
  
  public Exists (String x_1,NodePositionList<es.upm.aedlib.set.Set<String>> x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = new NodePositionList<es.upm.aedlib.set.Set<String>>(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Patterns.exists")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Patterns.exists(x_1,x_2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class DeleteStates extends TestCall<Void,NodePositionList<es.upm.aedlib.set.Set<String>>>
{
  String x_1;
  NodePositionList<es.upm.aedlib.set.Set<String>> lista;
  String callString;
  
  public DeleteStates (String x_1,NodePositionList<es.upm.aedlib.set.Set<String>> lista)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.lista = lista ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Patterns.deleteStates")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(lista)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Void call () 
  {
    Patterns.deleteStates(x_1,lista) ;
    return null ;
  }
  
  public boolean checkResult (NodePositionList<es.upm.aedlib.set.Set<String>> expected) 
  {
    if (!noException())
      return false ;
    if (!TestUtils.attributeEquals(this,new String("lista"),this.lista,expected))
      return false ;
    return true ;
  }
  
}


static class PrecededBy extends TestCall<Boolean,Boolean>
{
  String x_1;
  String x_2;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_3;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_3_orig;
  String callString;
  
  public PrecededBy (String x_1,String x_2,NodePositionList<es.upm.aedlib.set.Set<String>> x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    if (x_3 == null)
      x_3_orig = null ;
    else
      x_3_orig = new NodePositionList<es.upm.aedlib.set.Set<String>>(x_3) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Patterns.precededBy")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Patterns.precededBy(x_1,x_2,x_3) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_3)))
      return false ;
    if (!unchanged(x_3,x_3_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class FollowedBy extends TestCall<Boolean,Boolean>
{
  String x_1;
  String x_2;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_3;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_3_orig;
  String callString;
  
  public FollowedBy (String x_1,String x_2,NodePositionList<es.upm.aedlib.set.Set<String>> x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    if (x_3 == null)
      x_3_orig = null ;
    else
      x_3_orig = new NodePositionList<es.upm.aedlib.set.Set<String>>(x_3) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Patterns.followedBy")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_3_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Patterns.followedBy(x_1,x_2,x_3) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_3)))
      return false ;
    if (!unchanged(x_3,x_3_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Universal extends TestCall<Boolean,Boolean>
{
  String x_1;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_2;
  NodePositionList<es.upm.aedlib.set.Set<String>> x_2_orig;
  String callString;
  
  public Universal (String x_1,NodePositionList<es.upm.aedlib.set.Set<String>> x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = new NodePositionList<es.upm.aedlib.set.Set<String>>(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Patterns.universal")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return Patterns.universal(x_1,x_2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_2,x_2_orig))
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
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
