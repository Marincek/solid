package ocp_first;

class MessageContentBuilder {

    public String getMessageContent(Employee employee, String relocation) {
        return "Hi " + employee.getName() + " you will be relocated on " + relocation;
    }
}
