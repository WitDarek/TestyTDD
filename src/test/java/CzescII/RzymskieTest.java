package CzescII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RzymskieTest {


    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"1,I","5,V","10,X","50,L","100,C","500,D","1000,M"})

    void LiczbyRzymskieTest(int liczby,String znaki){
        Assertions.assertEquals (liczby,Rzymskie.Convert(znaki));
      /*  Assertions.assertEquals (5,Rzymskie.Convert("V"));
        Assertions.assertEquals (10,Rzymskie.Convert("X"));
        Assertions.assertEquals (50,Rzymskie.Convert("L"));
        Assertions.assertEquals (100,Rzymskie.Convert("C"));
        Assertions.assertEquals (500,Rzymskie.Convert("D"));
        Assertions.assertEquals (1000,Rzymskie.Convert("M"));
        Assertions.assertEquals (10010,Rzymskie.Convert("0"));*/
    }

    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"6,IV","15,VX","4300,MMCCCMM"})
    void LiczbyRzymskieSumTest(int wynik,String val){
        Assertions.assertEquals (wynik, Rzymskie.Sum(val));
    }
    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"I","V","X","L","C","D","M"})
    void LiczbyRzymskieisValidTest(String val){
        Assertions.assertTrue (Rzymskie.isValid(val));
    }
    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"A","B","E","F","G","H","J","K","N","O","P","R","S","T","U","W","Y","Z"})
    void LiczbyRzymskieisValidTestFail(String val){
        Assertions.assertFalse (Rzymskie.isValid(val));
    }

    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"IV","XV","MMCCCII"})
    void LiczbyRzymskieReapitingTest(String val){
        Assertions.assertTrue (Rzymskie.Reapiting(val));
    }
    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"IVI","VX","MMCCCMM"})
    void LiczbyRzymskieReapitingTestFail(String val){
        Assertions.assertFalse (Rzymskie.Reapiting(val));
    }

    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"9,IX","14,XIV","1915,MCMXCV"})
    void LiczbyRzymskieSum2(int wynik,String val){
        Assertions.assertEquals (wynik,Rzymskie.Sum2(val));
    }

    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"1,I","101,V","1010,X","110010,L","1100100,C","111110100,D","1111101000,M"})
        void LiczbyRzymskieBinaryTest(int liczba,String znaki){
            Assertions.assertEquals (liczba,Rzymskie.CeonvertBinary(znaki));
        }

    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"1001,IX","1110,XIV","11111001011,MCMXCV"})
    void LiczbyRzymskieBinary2Test(long liczba,String znaki){
        Assertions.assertEquals (liczba,Rzymskie.CeonvertBinary(znaki));
    }
    @ParameterizedTest(name = "run #{index} with [{arguments}]")
    @CsvSource ({"1,I","5,V","A,X","32,L","64,C","1F4,D","3E8,M"})
    void LiczbyRzymskieHexTest(String liczbaHex,String znaki){
        Assertions.assertEquals (liczbaHex,Rzymskie.CeonvertHex(znaki));
    }





}