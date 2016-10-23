package com.epam.knastya;

/**
 * Created by knastya on 23.10.2016.
 */
public class Task1_02 {

    private float  epsilon=0.5f;


    public Task1_02() {
    }
    public Task1_02(float epsilon) {
        this.epsilon = epsilon;
    }

    public void setEpsilon(float epsilon) {
        this.epsilon = epsilon;
    }

    private float calcAn(int n)   {
        float result = 1.0f/((n+1)*(n+1));
        return result;
    }

    public void calcMinNandOutput() {
        int n=1;
        float An = calcAn(n);
        System.out.println("A[n]< "+epsilon+ ":");
        while (An > epsilon) {
            System.out.println("A["+n+"]= "+An);
            n=n+1;
            An = calcAn(n);
        }
        if ((n-1)<1) {
            System.out.println("N0 n>=1 : A[n]< "+epsilon);}
        else {
            System.out.println("Min n: A[n]< "+epsilon+ ".   n= "+ (n-1));};


    }
}
