package com.javams;

public class Main {

    public static void main(String[] args) {
        //InputCalculator.inputThenPrintSumAndAverage();
        //int buckets = PaintJob.getBucketCount(-3.4,2.1,1.5,2);
        //int buckets = PaintJob.getBucketCount(3.4,2.1,1.5,2);
        int buckets = PaintJob.getBucketCount(0.75, 0.75, 0.5, 0);
        System.out.println(buckets);
    }
}
