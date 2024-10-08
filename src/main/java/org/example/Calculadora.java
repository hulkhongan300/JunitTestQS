package org.example;

public class Calculadora{
    public int soma(int a,int b){
        return a+b;
    }
    public int area(int a, int b){
        return a*b;
    }
    public int perimetro(int a ,int b){
        return a*2+b*2;
    }
    public int isTriangle(int a,int b,int c){
        if(a + b > c && a + c > b && b + c > a){
            return 1;
        }else return 0;
    }
}
