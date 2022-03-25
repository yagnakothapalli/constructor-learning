package io.pragra.learning;

public class Calculator {

    protected String type;

    public Calculator(String type) {
        this.type = type;
    }

    public Calculator() {

    }

    public int sum(int a, int b){ //sum(int,int)
        return a+b;
    }

    public int sum(int a, int b, int c){ //sum(int,int,int)
        return a+b+c;
    }

    public double sum(double a,double b){ //sum(double,double)
        return a+b;
    }

    public long sum(int a, long b){ //sum(int,long)
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    }

    public double multiply(double a,double b){
        return a*b;
    }
    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public long multiply(int a, long b){
        return a*b;
    }
}
