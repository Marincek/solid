package srp_first;

import java.util.Optional;

class Main {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employeeTheRock = new Employee(2, "Dwayne The Rock Johnson", "rock@gmail.com", "5896544758");
        employeeRepository.save(employeeTheRock);

        Optional<Employee> employeeOptional = employeeRepository.load(1l);
        employeeOptional.ifPresent(employee -> {
            String relocation = employee.findNewLocation();
            employee.sendEmail(relocation);
            employee.sendSms(relocation);
        });
    }
}
