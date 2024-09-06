import java.math.BigInteger;

public class LastNonZeroDigit {

public static int lastNonZeroDigit(int n) {
BigInteger fact = BigInteger.ONE;

for (int i = 2; i <= n; i++) {
fact = fact.multiply(BigInteger.valueOf(i));
}

while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
fact = fact.divide(BigInteger.TEN);
}

return fact.mod(BigInteger.TEN).intValue();
}

public static void main(String[] args) {
int n = 55;
System.out.println("Last non-zero digit of " + n + "! is: " + lastNonZeroDigit(n));
}
}
