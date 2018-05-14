package dip_first;

class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService(buildEmployeeLocator(), buildEmployeeRepository(), buildMessageService());

        employeeService.save(new Employee(1, "Jan", new Email("jan.marinchek@musala.com")));
        employeeService.save(new Employee(2, "Dwayne The Rock Johnson", new Email("rock@gmail.com")));

        employeeService.relocateEmployee(1L);
    }

    private static EmployeeLocator buildEmployeeLocator() {
        return new FloorEmployeeLocator();
    }

    private static EmployeeRepository buildEmployeeRepository() {
        return new InMemoryEmployeeRepository();
    }

    private static MessageService buildMessageService() {
        return new ConcreteMessageService(buildMessageContentBuilder(), buildMessageSender());
    }

    private static MessageContentBuilder buildMessageContentBuilder() {
        return new EmailTextMessageContentBuilder();
    }

    private static MessageSender buildMessageSender() {
        return new EmailMessageSender();
    }

}
