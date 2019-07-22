/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author tasos
 */
public class Director extends Employee implements Advisable{

    public Director(String name) {
        super(name);
    }
    
    @Override
    public void work() {
        System.out.println("Work like a Director");
    }

    @Override
    public void giveAdvice() {
        System.out.println("Give advice it like Director");
    }
    
}
