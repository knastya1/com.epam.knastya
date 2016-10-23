package com.epam.knastya;

/**
 * Created by knastya on 23.10.2016.
 */
import org.junit.Test;
import  com.epam.knastya.Task1_02;

public class Task1_02Impl {
    @Test
    public void test_An_Calc() {
        Task1_02 t =  new Task1_02();
        t.calcMinNandOutput();
        System.out.println();
        t = new Task1_02(0.001f);
        t.calcMinNandOutput();

    }

}
