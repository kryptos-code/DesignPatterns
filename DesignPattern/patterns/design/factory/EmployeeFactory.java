package DesignPattern.patterns.design.factory;

public class EmployeeFactory {
    // GET THE EMPLOYEE
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndriodDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }else {
            return null;
        }
    }
    
    
}
