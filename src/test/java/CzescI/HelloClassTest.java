package CzescI;

import CzescI.HelloClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class HelloClassTest {
    HelloClass helloClass = new HelloClass ();

    @Test
    void HelloTest() {
        Assertions.assertAll ("Asercje do HW",
                () -> assertEquals ("Hello World",
                        helloClass.getMessage ()),
                () -> assertEquals ("World",
                        helloClass.getMessage ()),
                () -> assertEquals ("World2",
                helloClass.getMessage ()));


    }
}