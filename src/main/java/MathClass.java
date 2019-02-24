import java.util.Scanner;

public class MathClass {



    public int Sum(int i, int i1) {
        return i + i1;
    }

    public int diff(int i, int i1) {
        return i - i1;
    }

    public int mul(int i, int i1) {
        return i * i1;
    }

    public int div(int i, int i1) {
        return i / i1;
    }
    public int funkcja(String x,int i,int i1){
        switch (dzialanie.valueOf (x))
        {
            case div:
                return div (i,i1);
            case mul:
                return mul (i,i1);
            case Sum:
                return Sum (i,i1);
            case diff:
                return diff (i,i1);
        }
        return 0;
    }

   public enum dzialanie {
        Sum,diff,mul,div;
    }
    

}


