package ocp_first;

import java.util.Optional;

interface EmployeeRepository {

    Optional<Employee> load(Long id);

    void save(Employee employee);

}
