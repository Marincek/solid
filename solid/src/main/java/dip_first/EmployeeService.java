package dip_first;

import java.util.Optional;

class EmployeeService {

    private EmployeeLocator employeeLocator;
    private EmployeeRepository employeeRepository;
    private MessageService messageService;

    public EmployeeService(EmployeeLocator employeeLocator, EmployeeRepository employeeRepository, MessageService messageService) {
        this.employeeLocator = employeeLocator;
        this.employeeRepository = employeeRepository;
        this.messageService = messageService;
    }

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
