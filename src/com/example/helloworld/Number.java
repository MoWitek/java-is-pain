package com.example.helloworld;


class Number {
    private int z;
    private int n;
    Number () {}

    Number (int number) {
        add(number, 1);
    }

    public void see(){System.out.println(z+"/"+n);}

    public int[] get_raw(){
        int[] arr = new int[2];
        arr[0] = z;
        arr[1] = n;
        return arr;
    }

    public static int[] shorten(int n1, int n2) {
        for (int i1 = 1; i1 <= n1; i1++) {
            for (int i2 = 1; i2 <= n1; i2++) {
                if (i2 != 1 && n1 % i2 == 0 && n2 % i2 == 0) {
                    n1 /= i2;
                    n2 /= i2;
                    break;
                }
            }
        }
        int[] arr = new int[2];
        arr[0] = n1;
        arr[1] = n2;
        return arr;
    }

    public void shorten() {
        int[] arr = shorten(z, n);
        z = arr[0];
        n = arr[1];
    }

    public Number invert(){
        int a = z;
        z = n;
        n = a;
        return this;
    }

    private Number pow(int sq) {
        if (sq < 0) {
            invert();
            sq*=-1;
        }

        int Z = 1;
        int N = 1;
        for (int i = 1; i<=sq; i++) {
            Z*=z;
            N*=n;
        }

        z = Z;
        n = N;
        return this;
    }

    public Number square() {
        return pow(2);
    }

    public Number square(int sq) {
        return pow(sq);
    }


    private int[] StringParser(String s){
        String[] arr = s.split("[.]", 2);
        int N = u.pow(10, arr[1].length());
        int Z = Integer.parseInt(arr[1]) + Integer.parseInt(arr[0]) * N;
        int[] r = new int[2];
        r[0] = Z;
        r[1] = N;
        return r;
    }

    public Number add(int Z, int N){
        boolean is_neg = Z < 0 || N < 0;
        if (z == 0 && 0 == n) {
            z = Z;
            n = N;
        } else {
            int _z = n*Z+N*z;
            int _n = n*N;

            z = _z;
            n = _n;
        }
        if (is_neg) {
            z = u.make_pos(z);
            n = u.make_pos(n);
            invert();
        }
        shorten();
        return this;
    }

    public Number mul(int Z, int N) {
        if (z == 0 && 0 == n) {
            z = Z;
            n = N;
        } else {
            z*=Z;
            n*=N;
        }
        shorten();
        return this;
    }




}
