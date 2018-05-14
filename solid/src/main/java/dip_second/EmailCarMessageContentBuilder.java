package dip_second;

class EmailCarMessageContentBuilder implements MessageContentBuilder {

    public String getMessageContent(Employee employee, String relocation) {
        return "Hi " + employee.getName() + " please remove your car " + relocation;
    }

}
