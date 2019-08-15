/**
 * @author hunter.yang
 * @version 1.0
 * @description null
 * @date 2019/8/11 17:37
 *
 * 斐波那契数列公式：
 *        \ 0   n=0
 * f(n) = \1    n=1
 *        \f(n-1) + f(n-2)   n>1
 *
 *  我们可以把已经得到的数列中间项保存起来，在下次需要计算的时候我们先查找一下。
 */
public class Fibonacci {

    private static int fibonacci(int n) {
        int[] res = {0, 1};
        if(n < 2) {
            return res[n];
        }
        int first = 0;
        int second = 1;
        int fibn = 0;
        for(int i = 2; i <= n; i++) {
            fibn = first + second;
            first = second;
            second = fibn;
        }
        return fibn;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
    }
}
