package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveCharsRemoveTest {
    @Test
    void process() {

        ConsecutiveCharsRemove ccp=new ConsecutiveCharsRemove();

        String results=ccp.process("bbbaaccccvmmmmsddm");

        assertEquals(results,"aavsddm");

    }

}
