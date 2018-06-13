package dsacoursework;

import java.math.BigInteger;

public class DoubleListTest {

    public static void main(String a[]) {

        int x, y = 0, z = 0;
        BigInteger fib1 = new BigInteger("0");
        BigInteger fib2 = new BigInteger("1");
        BigInteger ans = new BigInteger("0");
        BigInteger m = new BigInteger("0");
        BigInteger UoB = new BigInteger("15010235");
        BigInteger[] BigInt = new BigInteger[16];

        DoubleList DLB = new DoubleList();

        for (int i = 0; i < 116; i++) {

            y++;
            ans = fib1.add(fib2);
            fib2 = fib1;
            fib1 = ans;
            if (y >= 101) {
                BigInt[z] = ans;
                z++;
            }
        }
        for (int i = 0; i < BigInt.length; i++) {
            m = BigInt[i];
            m = m.mod(UoB);
            x = m.intValue();           

            DLB.addValue(x);
        }

        DLB.display();
    }
}
