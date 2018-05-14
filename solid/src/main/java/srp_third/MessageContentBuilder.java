package srp_third;

class MessageContentBuilder {

    public String buildMessageContent(Employee employee, String relocation) {
        return "Hi " + employee.getName() + " you will be relocated on " + relocation;
    }
}
