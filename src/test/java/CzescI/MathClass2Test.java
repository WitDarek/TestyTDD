package CzescI;

import CzescI.MathClass2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathClass2Test {
    MathClass2 mathClass2=new MathClass2 ();

    @Test
    void MatClass2(){
        Assertions.assertAll ("Assercja HW",
        ()-> assertEquals (true,
                mathClass2.even(6)),
        ()-> assertEquals (false,mathClass2.even (5)));
    }

}