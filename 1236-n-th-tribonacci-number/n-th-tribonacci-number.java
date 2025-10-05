class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            System.out.print(d);
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}