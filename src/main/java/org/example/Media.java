package org.example;
public class Media {
    public int media(int num) {
        int count=0,dig=0;
        while (num > 0) {
            dig += num % 10;
            num = num / 10;
            count++;
        }
    return dig/count;
    }
}