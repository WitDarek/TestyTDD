package CzescI;

public class FizzBuzz {
    public String FizzBuzzMetod(int i) {



        String temp= Integer.toString (i);
        if(temp.length ()>2){
            return "Wersja demo";
        }

        boolean have3=false;
        boolean have5=false;

        if(temp.contains ("3")){
            have3=true;
        }
        if(temp.contains ("5")){
            have5=true;
        }


        if((i%3==0 && i%5==0||(have3&&have5))||(i%3==0&&have5)||(i%5==0&&have3)){
            return "fizzbuzz";
        }
        if(i%3==0|| have3){
            return "fizz";
        }
        if(i%5==0 ||have5){
            return "buzz";
        }
        return ""+i+"";
    }
}
