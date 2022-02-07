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


public class HelloWorld {
    public static void main(String[] args) {
        Number n = new Number();

        int c = 3;

        switch (c) {
            case 1: {
                n.see();
                n.add(1);
                n.see();
                n.add(4);
                n.see();
            }

            case 2: {
                n.see();
                n.add(1.5);
                n.see();
                n.add(1.25);
                n.see();
                n.add("1.1234");
                n.see();
            }

            case 3: {
                n.see();
                //n.add("1.25");
                //n.add(1.25);
                n.add(1);
                n.add(3);
                n.see();
            }
        }



    }
}
