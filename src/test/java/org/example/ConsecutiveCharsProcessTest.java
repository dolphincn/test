package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveCharsProcessTest {
    @Test
    void consecutiveCharsRemove() {

        ConsecutiveCharsProcess ccp= new ConsecutiveCharsProcess();

        System.out.println("=================\n");
        ccp.setChars("aaazzldddddxcccc");
        ccp.setCharsProcess(new ConsecutiveCharsReplace());
        String results=ccp.Process();

        assertEquals(results,"ylcxb");
    }
    @Test
    void consecutiveCharsReplace() {

        ConsecutiveCharsProcess ccp= new ConsecutiveCharsProcess();

        System.out.println("=================\n");
        ccp.setChars("bbbaaccccvmmmmsddm");
        ccp.setCharsProcess(new ConsecutiveCharsRemove());
        String results=ccp.Process();

        assertEquals(results,"aavsddm");
    }
}
