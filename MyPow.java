class MyPow {
    public double myPow(double x, int n) { 
        if (n == 0) return 1;
        if (n < 0) {
            x = 1/x;
            n = Math.abs(n);
        }
        double a = 0;
        if(n % 2 == 0) {
            a = myPow(x, n/2);
            return a*a;
        }
        else {
            return x * myPow(x, n - 1);
        }
    }
    public void test1(){                                                       
        double x = 2.0;
        int n = 10;
        double a = myPow(x,n);
        System.out.println(a);
        assert(a == 1024.0);
    }
    public void test2(){                                                       
        double x = 2.00000;
        int n = -2;
        double a = myPow(x,n);
        // System.out.println(a);
        assert(a == .25000);
    } 
    public void test3(){                                                       
        double  x = 2.10000;
        int n = 3;
        double a = myPow(x,n);
        assert(a == 9.261000000000001);
    }
    public double myPow2(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1/x;
            n = Math.abs(n);
        }
        double a = x;
        int exp = n;
        while (n > 1 ){
            a *= x;
            n--;
        }
        return a;
    }
    public static void main(String args[]){
        MyPow l = new MyPow();
        l.test1();
        l.test2();
        l.test3();
    }
}