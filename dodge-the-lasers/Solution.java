import java.math.BigDecimal;

public class Solution {
    public final BigDecimal helperConstant = new BigDecimal(Math.sqrt(2) - 1);

    public BigDecimal helper(BigDecimal n) {
      BigDecimal current = n.multiply(helperConstant);
      BigDecimal altered = current.setScale(0, BigDecimal.ROUND_FLOOR);
      return altered;
    }

    public BigDecimal recurrence(BigDecimal a, BigDecimal n) {
      if (n.equals(BigDecimal.ZERO)) {
        return BigDecimal.ZERO;
      }

      BigDecimal h = this.helper(n);

      BigDecimal arg1 = n.multiply(h);
      BigDecimal arg2 = n.multiply(n.add(new BigDecimal(1))).divide(new BigDecimal(2));
      BigDecimal arg3 = h.multiply(h.add(new BigDecimal(1))).divide(new BigDecimal(2));
      BigDecimal arg4 = recurrence(new BigDecimal(Math.sqrt(2)), h);

      return arg1.add(arg2).subtract(arg3).subtract(arg4);
    }

    public String solution(String s) {
      return this.recurrence(new BigDecimal(Math.sqrt(2)), new BigDecimal(s)).toString();
    }
}
