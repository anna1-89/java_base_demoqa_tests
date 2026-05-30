package tests.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamplesTests {

   @BeforeEach
    void startBrower(){
       System.out.println("browser has started");
   }

    @AfterEach
    void stopBrower(){
        System.out.println("browser has stopped");
    }

    @Test
    void firstTest(){
        System.out.println("- firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("- secondTest");

    }

}
