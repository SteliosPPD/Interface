/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tasos
 */
public class Interfaces {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        
        Teacher t1 = new Teacher("Jack");
        Teacher t2 = new Teacher("John");
        Supervisor s1 = new Supervisor("Mary");
        Supervisor s2 = new Supervisor("Peter");
        
        employees.add(t1);
        employees.add(t2);
        employees.add(s1);
        employees.add(s2);
        
        List<Advisable> peopleThatAdvice = new ArrayList();
        
        for(Employee e: employees){
            if(e instanceof Advisable){
                Advisable a = (Advisable)e;
                peopleThatAdvice.add(a);
            }
        }
        
        System.out.println(peopleThatAdvice);
        
        
    }
    
}
