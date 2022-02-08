package com.example.helloworld;

class u{
    public static int pow(int n, int e){
        int m = 1;

        for (int i = 1; i<=e; i++) {
            m *= n;
        }
        return m;
    }

    public static int pow(int n) {
        return pow(n, 2);
    }
}
