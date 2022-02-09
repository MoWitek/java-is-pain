package com.example.helloworld;

public class IntTupple {
    private int[] IntArr;

    public IntTupple (int ... IntArr) {
        this.IntArr = IntArr;
    }

    public int get(int index) {
        return this.IntArr[index];
    }

    public void set(int data, int index) {
        this.IntArr[index] = data;
    }

    public String toString(){
        String s = "(";

        for (int i=0;i<IntArr.length;i++){
            s += ""+i;
            if (i != IntArr.length - 1) {
                s+=", ";
            }
        }

        s+=")";
        return s;
    }

}
