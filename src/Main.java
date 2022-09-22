import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal a1 = new BigDecimal("0.2456").setScale(2, RoundingMode.CEILING);
        BigDecimal a2 = new BigDecimal("0.1578").setScale(2, RoundingMode.CEILING);
        BigDecimal result1 = a1.divide(a2);
       // round(a2);
      // System.out.println(round(result1));
       System.out.println(reverseSign(a1));


        //System.out.println(a1);
        //System.out.println(a2);
     //   System.out.println(result1);

    }

    private static double round (BigDecimal x) {

        return x.setScale(2, RoundingMode.CEILING).doubleValue();
    }
    private static double reverseSign (BigDecimal x) {

        return x.setScale(1, RoundingMode.CEILING).negate().doubleValue();
    }

}