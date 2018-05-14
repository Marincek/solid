package srp_second;

class MessageSender {

    public void sendEmail(Employee employee, String relocation) {
        System.out.println("Sending email to " + employee.getEmail().getValue() + " : Hi " + employee.getName() + " you will be relocated on " + relocation);
    }
}
