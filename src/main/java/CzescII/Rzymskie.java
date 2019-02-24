package CzescII;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rzymskie {
    public static int Convert(String i) {
        if (i.equals ("I")) {
            return 1;
        }
        if (i.equals ("V")) {
            return 5;
        }
        if (i.equals ("X")) {
            return 10;
        }
        if (i.equals ("L")) {
            return 50;
        }
        if (i.equals ("C")) {
            return 100;
        }
        if (i.equals ("D")) {
            return 500;
        }
        if (i.equals ("M")) {

            return 1000;
        }
        return 0;
    }

    public static int Sum(String val) {
        char[] chars = val.toCharArray ();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Convert (String.valueOf (chars[i]));
        }
        return sum;
    }

    public static boolean isValid(String val) {
        Pattern pattern = Pattern.compile ("[IVXLMCD]");
        Matcher matcher = pattern.matcher (val);

        return matcher.matches ();

    }

    public static boolean Reapiting(String val) {
        Pattern pattern = Pattern.compile ("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
        Matcher matcher = pattern.matcher (val);

        return matcher.matches ();

    }

    public static int Sum2(String val) {
        if (Reapiting (val)) {
            int sum = 0;
            char[] chars = val.toCharArray ();
            for (int i = 0; i < chars.length -1; i++) {
                if (Convert (String.valueOf (chars[i])) > (Convert (String.valueOf (chars[i + 1])))) {
                    sum += Convert (String.valueOf (chars[i]));
                    if((i+1)==chars.length-1){
                        sum+=Convert (String.valueOf (chars[i+1]));
                    }
                }
                if (Convert (String.valueOf (chars[i])) < (Convert (String.valueOf (chars[i + 1])))) {
                    sum += (Convert (String.valueOf (chars[i + 1]))) - (Convert (String.valueOf (chars[i])));
                    i++;
                    if((i+1)==chars.length-1){
                        sum+=Convert (String.valueOf (chars[i+1]));
                    }
                }


            }
            return sum;
        }
        return 0;
    }

    public static long CeonvertBinary(String znaki) {
        long liczba=0;
        if(znaki.length ()<2) {
            liczba = Convert (znaki);
        }
        liczba=Sum2(znaki);
        int i=0;
        long[] tab=new long[31];
        long suma=0;
        while (liczba>0) {

            tab[i++] = liczba % 2;
            liczba/=2;
        }

        for (int j = 0; j < tab.length; j++) {
            suma+=(tab[j]*(Math.pow (10,j)));
        }
        return suma;

    }


    public static String CeonvertHex(String znaki) {
        long liczba =0;
        String wynik=null;
        if(znaki.length ()<2) {
            liczba = Convert (znaki);
        }
        liczba=Sum2(znaki);
        int i=0;
        long[] tab=new long[31];
        String[] tab1=new String[31];
        long suma=0;
        while (liczba>0) {

            tab[i++] = liczba % 16;
            liczba/=16;
        }
        for (int j = 0; j < tab.length; j++) {
            if(tab[j]==10){
                tab1[j]="A";
            }
            if(tab[j]==11){
                tab1[j]="B";
            }
            if(tab[j]==12){
                tab1[j]="C";
            }
            if(tab[j]==13){
                tab1[j]="D";
            }
            if(tab[j]==14){
                tab1[j]="E";
            }
            if(tab[j]==15){
                tab1[j]="F";
            }
            else
                tab1[j]=Long.toString (tab[j]);
        }
        for (int j = 0; j < tab.length; j++) {
            wynik+=tab1[j];

    }
       return wynik;
}}


/*
I    1
        V    5
        X    10
        L    50
        C    100
        D    500
        M    1000*/
