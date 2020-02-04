/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import tmpr.FarTempCel;

/**
 *
 * @author pupil
 */
public class tempr {
    
    public tempr() {
    }
    @Test
    public void TempTC() {
        FarTempCel obj = new FarTempCel();
        double tulemus=obj.TemperatureTC(95);
        //if (tulemus!=35) Assert.fail();
        Assert.assertTrue("Цельсий не конвертируется", tulemus ==35);
    }
    @Test
    public void TempTF() {
        FarTempCel obj = new FarTempCel();
        double tulemus = obj.TemperatureTF(-5);
        //if (tulemus!=23) Assert.fail();
        Assert.assertTrue("Фаренгейт не конвертируется", tulemus ==23);
    }
    
    @Test
    public void Temp3TF() {
        FarTempCel obj = new FarTempCel();
        double tulemus=obj.TemperatureTF(10);
        //if(tulemus!=50) Assert.fail();
        Assert.assertTrue("Фаренгейт не конвертируется", tulemus ==50);
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
