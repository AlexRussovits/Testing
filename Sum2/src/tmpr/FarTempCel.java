/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmpr;

/**
 *
 * @author pupil
 */
public class FarTempCel {
    public double TemperatureTC(double TF) {
          return (TF-32)*5/9;
    }
    public double TemperatureTF(double TC) {
        return (TC*9/5)+32;
    }
}
