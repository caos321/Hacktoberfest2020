import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FibonacciJava {

    public static List<BigDecimal> calculate(final int size) {
        final int n = size - 1;

        if(n < 0) {
            return List.of();
        }

        if(n < 1) {
            return List.of(BigDecimal.ONE);
        }

        if(n < 2) {
            return List.of(BigDecimal.ONE, BigDecimal.ONE);
        }

        final List<BigDecimal> list = new ArrayList<>(List.of(BigDecimal.ONE, BigDecimal.ONE));

        for(int i = 2; i < n + 1; i++) {
            final BigDecimal result = list.get(i - 1).add(list.get(i - 2));
            list.add(result);
        }

        return list;
    }

    public static void main(final String[] args) {
        {
            final List<BigDecimal> list = calculate(10);
            System.out.println(list);
            System.out.println(list.get(list.size() - 1)); // 55
        }
        {
            final List<BigDecimal> list = calculate(20);
            System.out.println(list);
            System.out.println(list.get(list.size() - 1)); // 6765
        }
        {
            final List<BigDecimal> list = calculate(30);
            System.out.println(list);
            System.out.println(list.get(list.size() - 1)); // 832040
        }
        {
            final List<BigDecimal> list = calculate(40);
            System.out.println(list);
            System.out.println(list.get(list.size() - 1)); // 102334155
        }
        {
            final List<BigDecimal> list = calculate(50);
            System.out.println(list);
            System.out.println(list.get(list.size() - 1)); // 12586269025
        }
    }
}
