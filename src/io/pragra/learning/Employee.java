package io.pragra.learning;

public class Employee {
    private int empID;
    private String name;
    private double hourlyRate;
    private double bonus;
    private int hourWorked;
    private int overTimeHours;


    public double calWages(double hourlyRate,int hourWorked) {
        return hourlyRate*hourWorked;
    }

    public double calWages(double hourlyRate,int hourWorked,double bonus){
        return calWages(hourlyRate,hourWorked)+bonus;
    }

    public double calWages(double hourlyRate,int hourWorked,int bonus){
        return calWages(hourlyRate,hourWorked)+1.25*hourlyRate*overTimeHours;
    }
    public double calWages(double hourlyRate,int hourWorked,int overTimeHours,double bonus){
        return calWages(hourlyRate,hourWorked,bonus)+1.25*hourlyRate*overTimeHours;
    }
}
