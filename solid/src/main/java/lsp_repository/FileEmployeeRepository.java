package lsp_repository;

import java.util.Optional;

class FileEmployeeRepository implements EmployeeRepository {

    @Override
    public Optional<Employee> load(Long id) {
        System.out.println("Employee " + id + " not found in file database!");
        return Optional.empty();
    }

    @Override
    public void save(Employee employee) {
        if (employee.getEmail().getValue().endsWith("@musala.com")) {
            throw new RuntimeException("Email must be with Musala domain");
        }

        System.out.println("Employee " + employee.getId() + " saved in file database!");
    }
}
