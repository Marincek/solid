package dip_second;

class ConcreteMessageService implements MessageService {

    private MessageContentBuilder messageContentBuilder;
    private MessageSender messageSender;

    public ConcreteMessageService(MessageContentBuilder messageContentBuilder, MessageSender messageSender) {
        this.messageContentBuilder = messageContentBuilder;
        this.messageSender = messageSender;
    }

    public void notifyEmployeeForRelocation(Employee employee, String relocation) {
        String content = messageContentBuilder.getMessageContent(employee, relocation);
        messageSender.send(employee.getEmail().getValue(), content);
    }

}
