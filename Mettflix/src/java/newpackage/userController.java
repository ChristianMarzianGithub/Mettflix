/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Chris
 */

@ManagedBean
@SessionScoped
public class userController {
    private List<Employee> employees=null;
    private Employee selectedEmployee=null;
    
    @PostConstruct
    public void init(){
        employees=new ArrayList<Employee>();
        employees.add(new Employee("Peter","Schweinske",123,"ressources/s.mp4"));
        employees.add(new Employee("Emanuell","Grützwurst",678,"ressources/s.mp4"));
        employees.add(new Employee("Reinoldi","Schwitzkowski",193,"ressources/reviewKUNDFinal.mp4"));
        
        selectedEmployee=new Employee();
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }
    
    
    public void select(Employee e){
        selectedEmployee=e;        
    }
    
    public List<Employee> getEmployees(){
        return employees;
    }
    
    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
    
    
    
}
