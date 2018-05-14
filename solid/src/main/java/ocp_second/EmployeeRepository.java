package ocp_second;

import java.util.Optional;

interface EmployeeRepository {

    Optional<Employee> load(Long id);

    void save(Employee employee);

}
