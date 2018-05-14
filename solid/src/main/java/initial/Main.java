package initial;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Jan", "jan.marinchek@musala.com");

        employee.save();

        String relocation = employee.findNewLocation();

        employee.sendEmail(relocation);
    }
}
