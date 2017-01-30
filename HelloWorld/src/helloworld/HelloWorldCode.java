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
public class HelloWorldCode {
    public void StartOfWorld(){
        System.out.println("HelloWorld");
        Integer intA = 10;
        Integer intB = 12;
        if(intA > intB){
            System.out.println(intA + " greater than " + intB);
        }else{
            System.out.println(intA + " less than " + intB);
        }
        System.out.println("HelloWorldDone");   
    }
}
