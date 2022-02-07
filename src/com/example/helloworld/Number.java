package com.example.helloworld;


class Number {
    private int z;
    private int n;
    Number () {}

    public void see(){System.out.println(z+"/"+n);}

    public void shorten() {
        for (int i1 = 1; i1 <= n; i1++) {
            for (int i2 = 1; i2 <= n; i2++) {
                if (i2 != 1 && n % i2 == 0 && z % i2 == 0) {
                    n /= i2;
                    z /= i2;
                    break;
                }
            }
        }
    }

    public void add(int p) {
        add(p+".0");
    }

    public void add(String p){
        String[] arr = p.split("[.]", 2);

        int N = u.pow(10, arr[1].length());
        int Z = Integer.parseInt(arr[1]) + Integer.parseInt(arr[0]) * N;


        if (z == 0 && 0 == n) {
            z = Z;
            n = N;
        } else if (n == N) {
            z += Z;
        } else {
            int _n = n*N;
            int _Z = n*Z+N*z;

            n = _n;
            z = _Z;
        }
        shorten();
    }

    public void add(double p) {
        add(""+p);
    }

}
