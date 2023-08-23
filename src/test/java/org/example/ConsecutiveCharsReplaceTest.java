package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveCharsReplaceTest {
    @Test
    void process() {

        ConsecutiveCharsReplace ccp=new ConsecutiveCharsReplace();

        String results=ccp.process("xaaazzldddddxcccc");

        assertEquals(results,"xylcxb");

    }
}
