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
public class Secretary extends Employee{

    public Secretary(String name) {
        super(name);
    }

    
    @Override
    public void work() {
        System.out.println("Work like a secretary");
    }
    
}
