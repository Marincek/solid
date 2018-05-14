package ocp_second;

class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();

        employeeService.save(new Employee(1, "Jan", new Email("jan.marinchek@musala.com")));
        employeeService.save(new Employee(2, "Dwayne The Rock Johnson", new Email("rock@gmail.com")));

        employeeService.relocateEmployee(1L);
    }
}
