/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq2;

import eq.Equations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author PC
 */

@RunWith(Parameterized.class)
public class testEQ2 {
    
    
    public testEQ2() {
    }
    
    @Parameters
    public static Collection Roots() {
        return Arrays.asList(new Object [][]{
            {3,-3,2},
            {1,2,1,-1},
            {4,2,-6,-1.5,1}
        });
    }
    
    int a,b,c;
    double x1,x2;

    public testEQ2(int a, int b, int c, double x1, double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
    }
    
    

    
    
    @Test
    public void Root() {
        Equations obj = new Equations();               
        ArrayList result = obj.Discrimant(a, b, c, x1, x2);
        if(result != x1) {
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
