package com.example.helloworld;
import java.util.Scanner;

public class helloworld {
    public static void main (String[]args){
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        double alfa = in.nextDouble();
        double r = (Math.sin(2*alfa)+Math.sin(5*alfa)-Math.sin(3*alfa))/(Math.cos(alfa+1)-2*(Math.pow(Math.sin(2*alfa), 2)));
        in.close();
        System.out.print("Result: "+r);
    }}
