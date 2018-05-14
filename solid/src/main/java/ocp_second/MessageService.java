package ocp_second;

class MessageService {

    private MessageContentBuilder messageContentBuilder = new MessageContentBuilder();
    private MessageSender messageSender = new MessageSender();

    public void notifyEmployeeForRelocation(Employee employee, String relocation) {
        String content = messageContentBuilder.getMessageContent(employee, relocation);

        messageSender.send(employee.getEmail().getValue(), content);
    }

}
