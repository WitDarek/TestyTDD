package CzescI;

import CzescI.MathClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathClassTest {
    MathClass mathClass=new MathClass ();

    @Test
    void MathTest(){
        assertEquals (10,mathClass.Sum(5,5));
    }

    @Test
    void MathTest1(){
        assertEquals (20,mathClass.diff(30,10));
    }
    @Test
    void MathTest2(){
        assertEquals (15,mathClass.mul(3,5));
    }
    @Test
    void MathTest3(){
        assertEquals (5,mathClass.div(25,5));
    }
    @Test
    void MathTest4(){
        assertEquals (5,mathClass.funkcja ("div",25,5));
    }
    @Test
    @DisplayName("test 6")
    void MathTest5() {
        assertEquals (50, mathClass.funkcja ("Sum", 25, 25));
    }

}