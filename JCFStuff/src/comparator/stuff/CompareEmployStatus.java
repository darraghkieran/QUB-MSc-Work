package comparator.stuff;

import java.util.Comparator;

public class CompareEmployStatus implements Comparator<Employee> {
	
    @Override
    public int compare(Employee o1, Employee o2) {
        
        if (o1.getEmployStatus().equalsIgnoreCase("FT") && o2.getEmployStatus().equalsIgnoreCase("PT")) {
            return -1;
        } else if (o1.getEmployStatus().equalsIgnoreCase("PT") && o2.getEmployStatus().equalsIgnoreCase("FT")) {
            return 1;
        } else {
            return 0;
        }
    }
}