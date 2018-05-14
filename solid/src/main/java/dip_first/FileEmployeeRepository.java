package dip_first;

import java.util.Optional;

class FileEmployeeRepository implements EmployeeRepository {

    @Override
    public Optional<Employee> load(Long id) {
        System.out.println("Employee " + id + " not found in file database!");
        return Optional.empty();
    }

    @Override
    public void save(Employee employee) {
        System.out.println("Employee " + employee.getId() + " saved in file database!");
    }
}
