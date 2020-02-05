/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.util.ArrayList;

/**
 *
 * @author pupil
 */
public class Equations {
    public ArrayList Discrimant(int a, int b, int c) {
        double D = ((Math.pow(b, 2)-4*a*c));
        if (D>=1) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            ArrayList<Double> roots = new ArrayList<>();
            roots.add(x1);
            roots.add(x2);
            return roots;
        }
        else if(D==0) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            ArrayList<Double> roots = new ArrayList<>();
            roots.add(x1);
            return roots;
        }
        else{
            ArrayList<String> roots = new ArrayList<>();
            roots.add("Нет решения");
            return roots; 
        }            
    }
}
