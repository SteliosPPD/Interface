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
public class Supervisor extends Employee implements Advisable, Driving{

    public Supervisor(String name) {
        super(name);
    }
    
    
    @Override
    public void work() {
        System.out.println("Work like a Supervisor");
    }

    @Override
    public void giveAdvice() {
        System.out.println("give advice like a supervisor");
    }
    
    public String toString(){
        return name;
    }
}
