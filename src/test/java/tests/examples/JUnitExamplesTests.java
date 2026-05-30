package tests.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTests {

    @BeforeAll
    static void startUp(){
        System.out.println("tests startup");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("tests ended");
    }

    @BeforeEach
    void startBrower(){
       System.out.println("-  browser has started");
   }

    @AfterEach
    void stopBrower(){
        System.out.println("-  browser has stopped");
    }

    @Test
    void firstTest(){
        System.out.println("-- firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("-- secondTest");

    }

}
