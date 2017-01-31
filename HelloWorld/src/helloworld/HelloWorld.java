/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author josephfleck
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        String[] peanuts = new String[5];
        peanuts[0] = "cashew";
        peanuts[1] = "walnuts";
        peanuts[2] = "virginia";
        peanuts[3] = "runner";
        peanuts[4] = "spanish";
        
        HelloWorldCode h = new HelloWorldCode();
        h.BeginWorld();
        h.StartOfWorld();
        h.LoopAround(n);
        h.arrayLoop(peanuts);
        h.DoneOfWorld();
    }
    
}
