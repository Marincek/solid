package srp_second;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public Optional<Employee> load(Long id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findAny();
    }

    public void save(Employee employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getId() + " saved!");
    }

}
