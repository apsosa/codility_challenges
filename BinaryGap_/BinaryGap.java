
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
    // conver to binary
    public static int solution(int N) {

        int bits = (int) Math.floor(Math.log(N) / Math.log(2));
        int max_gap = 0;
        int binary[] = new int[bits + 1]; // integer 32 bits
        int index = bits;
        while (N > 0) {
            binary[index--] = N % 2;
            N = N / 2;
        }
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]);
        }
        System.out.println();
        ArrayList<Integer> gaps = new ArrayList<Integer>();
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) {
                System.out.println("deteccion de 1 en la pos :" + i);
                int gap = 0;
                i++;
                while (i < bits) {
                    if (binary[i] == 1) {
                        break;
                    }
                    gap = gap + 1;
                    i++;
                }
                if (binary[i - 1] == 1 || binary[i] == 1) {// found a gap
                    gaps.add(gap);
                    i--;
                }

            }
        }
        for (Integer n : gaps) {
            System.out.println(n);
            if (n > max_gap) {
                max_gap = n;
            }
        }
        System.out.println();

        return max_gap;
    }
}
