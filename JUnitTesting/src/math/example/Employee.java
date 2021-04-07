/**
 * 
 */
package math.example;
/**
 * 
 * @author 3048360
 *
 */
public class Employee {
    // Constants for business rule boundaries
    private static final int AGE_VALID_LOWER = 18;
    private static final int AGE_VALID_UPPER = 30;
    
    private String name;
    private int age;
    
    /**
     * Default constructor
     */
    public Employee() {
        
    }
    
    /**
     * Constructs an employee with arguments
     * @param name
     * @param age
     * @throws Exception 
     */
    public Employee(String name, int age) throws IllegalArgumentException {
        
        this.setName(name);
        this.setAge(age); // linking constructor with business rule
        
    }
    

    /**
     * Sets the age within valid range : {@value #AGE_VALID_LOWER} - {@value #AGE_VALID_UPPER}
     * @param age
     * @throws IllegalArgumentException with invalid age set attempt
     */
    public void setAge(int age) throws IllegalArgumentException {
        if (age>=AGE_VALID_LOWER && age<=AGE_VALID_UPPER) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("INVALID AGE");
        }
    }
    /**
     * Gets the age
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * Gets the name
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name
     * @param name the name to set
     */
    public void setName(String name)/* throws IllegalArgumentException)*/ {
//        if (name.equals("Aidan")) {
            this.name = name;
//        } else {
//            throw new IllegalArgumentException("INVALID NAME");
//        }
    }
    
    
}