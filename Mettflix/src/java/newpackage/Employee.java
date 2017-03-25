/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Chris
 */
public class Employee {
    private String name;
    private String surname;
    private int birthYear;  
    private String path;
    

    public Employee(String name, String surname, int birthYear, String path) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.path = path;
    }

    public Employee() {
       
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

        
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public int getBirthYear(){
        return birthYear;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + '}';
    }
    
}




