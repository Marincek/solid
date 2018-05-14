package dip_second;

class DependencyService {

    static EmployeeLocator buildEmployeeLocator() {
        return new CarEmployeeLocator();
    }

    static EmployeeRepository buildEmployeeRepository() {
        return new InMemoryEmployeeRepository();
    }

    static MessageService buildMessageService() {
        return new ConcreteMessageService(buildMessageContentBuilder(), buildMessageSender());
    }

    static MessageContentBuilder buildMessageContentBuilder() {
        return new EmailCarMessageContentBuilder();
    }

    static MessageSender buildMessageSender() {
        return new EmailMessageSender();
    }

}
