/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq1;

import eq.Equations;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class testEQ {
    
    public testEQ() {
    }
    @Test
    public void noRoots() {
    Equations obj = new Equations();
    ArrayList tulemus = obj.Discrimant(3, -3, 2);
    //Assert.assertTrue("Нет решения", tulemus);    
    }
    
    @Test
    public void oneRoot() {
    Equations obj = new Equations();
    ArrayList tulemus = obj.Discrimant(1, 2, 1);
    //Assert.assertTrue("Нет решения", tulemus);    
    }
    
    @Test
    public void twoRoots() {
    Equations obj = new Equations();
    ArrayList tulemus = obj.Discrimant(4,2,-6); 
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
