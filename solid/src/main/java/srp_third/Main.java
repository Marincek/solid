package srp_third;

import java.util.Optional;

class Main {

    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();

        EmployeeLocator employeeLocator = new EmployeeLocator();

        MessageContentBuilder messageContentBuilder = new MessageContentBuilder();
        MessageSender messageSender = new MessageSender();

        employeeRepository.save(new Employee(2, "Dwayne The Rock Johnson", new Email("rock@gmail.com")));
        employeeRepository.save(new Employee(1, "Jan", new Email("jan.marinchek@musala.com")));

        Optional<Employee> employeeOptional = employeeRepository.load(1l);
        employeeOptional.ifPresent(employee -> {
            String relocation = employeeLocator.findLocation(employee);
            String content = messageContentBuilder.buildMessageContent(employee, relocation);
            messageSender.send(employee.getEmail().getValue(), content);
        });
    }
}
