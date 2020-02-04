/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import divide.Divide;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sum.Summa;

/**
 *
 * @author pupil
 */
public class test {
    
    public test() {
    }
    
    @Test
    public void SummaTest() {
         Summa obj = new Summa();   
         double tulemus=obj.Summ(3,77);
         if(tulemus!=80) Assert.fail();
    }
    
    public void DivideTest() {
        Divide obj = new Divide();
        double tulemus=obj.Dvd(8, 4);
        if(tulemus!=2) Assert.fail();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
