package lsp_repository;

import java.util.Optional;

interface EmployeeRepository {

    Optional<Employee> load(Long id);

    void save(Employee employee);

}
