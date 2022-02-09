package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        Number n = new Number();
        Number n2 = new Number(2);

        n.see();
        n.add(n2);
        n.see();
        n.div(n2);
        n.see();
    }
}
