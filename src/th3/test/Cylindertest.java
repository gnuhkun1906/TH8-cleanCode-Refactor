package th3.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import th3.Cylinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cylindertest {
    @Test
    @DisplayName("Test volume 0 and 0")
    void testgetVolume0and0(){
        int radius=0;
        int height=0;
        double expected=0;
        double result= Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test volume 1 and 2")
    void testVolume1and2(){
        int radius = 1;
        int height=2;
        double expected=78.95683520871486;
        double result=Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Area")
    void testArea(){
        int radius=2;
        double expected=12.566370614359172;
        double result=Cylinder.getBaseArea(radius);
        assertEquals(expected,result);
    }

}
