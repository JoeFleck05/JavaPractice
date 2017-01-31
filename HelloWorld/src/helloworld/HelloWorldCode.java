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
    
    public void BeginWorld(){
        System.out.println("");
        System.out.println("HelloWorld");
    }
    public void StartOfWorld(){
        
        System.out.println("");
        Integer intA = 10;
        Integer intB = 12;
        if(intA > intB){
            System.out.println(intA + " greater than " + intB);
        }else{
            System.out.println(intA + " less than " + intB);
        }
        System.out.println("");
        
    }
    
    public void DoneOfWorld(){
        System.out.println("");
        System.out.println("HelloWorldDone");
    }
    
    public void LoopAround(int a){
        System.out.println("");
        for(int i = 0 ; i < a ; ++i){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public void arrayLoop(String[] arrWord){
        System.out.println("");
        for(String n : arrWord){
            System.out.println("Peanut type:" + n);
        }
    }
}
