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
public class CakeFactory {
    
    public static Cake getCake(CakeType criteria){
        switch (criteria){
            case HELADO:
                return new Helado();
            case DE_PAN:
                return new Pan();
        }
        return null;
    }
}
