package dev.harshit.productservicesst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RandomTestCase {
    @Test

    void testIsOnePlusOneisTwo(){
        // 3 A's Arrange , Act , Assert(Check)
        int i = 1 + 1;
        assert i == 2;
        assertEquals(2,i,"I value is not 4, tjats why test case failed");
//        assertThrows(RuntimeException.class , fun(100));
        // assertFalse(), assertTrue()
    }
    @Test
    void testIsTwoMultiplyByTwoIsFour(){
        int i = 2*2;

        assert i== 4;
    }
}
