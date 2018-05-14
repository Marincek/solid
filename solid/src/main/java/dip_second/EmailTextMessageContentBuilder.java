package dip_second;

class EmailTextMessageContentBuilder implements MessageContentBuilder {

    public String getMessageContent(Employee employee, String relocation) {
        return "Hi " + employee.getName() + " you will be relocated on " + relocation;
    }

}
