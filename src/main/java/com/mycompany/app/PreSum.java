package com.mycompany.app;

public class PreSum<T> {
    private final int[] preSum;
    private final int[] arr;

    public PreSum(int[] arr) {
        this.arr = arr;
        preSum = new int[arr.length + 1];
        calc();
    }

    private void calc(){
        for (int i = 0; i < arr.length; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
        }
    }

    public int query(int l, int r){
       return preSum[r + 1] - preSum[l];
    }

}
