package lsp_repository;

import java.util.Optional;

class EmployeeService {

    private EmployeeRepository employeeRepository = new FileEmployeeRepository();
    private EmployeeLocator employeeLocator = new EmployeeLocator();
    private MessageService messageService = new MessageService();

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public void relocateEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.load(id);
        employeeOptional.ifPresent(employee -> {
            String location = employeeLocator.findLocation(employee);
            messageService.notifyEmployeeForRelocation(employee, location);
        });
    }
}
