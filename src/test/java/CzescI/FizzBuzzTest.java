package CzescI;

import CzescI.FizzBuzz;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz=new FizzBuzz ();
    static long start;


    @BeforeAll
    static void Time(){
        System.out.println (LocalDateTime.now ());
        start=System.currentTimeMillis ();
    }


    @Test
    void FizzBuzzTest(){
        Assertions.assertAll ("Asseert HW",
                //Podzielne przez 3
                ()-> assertEquals ("fizz",fizzBuzz.FizzBuzzMetod(12)),
                //Podzielne przez 5
                ()-> assertEquals ("buzz",fizzBuzz.FizzBuzzMetod (5)),
                //Podzielne przez 3 i 5
                ()-> assertEquals ("fizzbuzz",fizzBuzz.FizzBuzzMetod (15)),
                //Wypisanie liczby jak nie spełnia żadnych warunków
                ()-> assertEquals ("7",fizzBuzz.FizzBuzzMetod (7)),
                //Zawiera liczbe 3
                ()-> assertEquals ("fizz",fizzBuzz.FizzBuzzMetod(31)),
                //Zawiera liczbe 5
                ()-> assertEquals ("buzz",fizzBuzz.FizzBuzzMetod(58)),
                //Zawiera liczbe 5 oraz 3
                ()-> assertEquals ("fizzbuzz",fizzBuzz.FizzBuzzMetod(53)),
                //Zawiera liczbe 5 oraz jest podzielne przez 3
                ()-> assertEquals ("fizzbuzz",fizzBuzz.FizzBuzzMetod(51)),
                //zawiera liczbe 3 i jest podzielne przez 5
                ()-> assertEquals ("fizzbuzz",fizzBuzz.FizzBuzzMetod(35)),
                //Liczba 3 cyfrowa
                ()-> assertEquals ("Wersja demo",fizzBuzz.FizzBuzzMetod(135)));


    }
    @AfterAll
    public static void Time1(){
        System.out.println (LocalDateTime.now ());
        System.out.println (System.currentTimeMillis ()-start+" ms");
    }

}