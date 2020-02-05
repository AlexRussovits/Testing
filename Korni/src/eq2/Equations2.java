/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author pupil
 */

public class Equations2 {
   @Parameters
   public static Collection Roots() {
       return Arrays.asList(new Object[][]{
           {2,-9,4,0.5,4}, 
           {3,-6,3,0,0}, 
       });
   }
}
