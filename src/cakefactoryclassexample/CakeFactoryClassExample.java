/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakefactoryclassexample;

/**
 *
 * @author Diana
 */
public class CakeFactoryClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cake cake = CakeFactory.getCake(CakeType.HELADO);
        System.out.println("Horneando el pastel Helado: ");
        cake.hornear();
        
        cake = CakeFactory.getCake(CakeType.DE_PAN);
        System.out.println("Horneando el pastel de Pan: ");
        cake.hornear();
        
    }
    
}
