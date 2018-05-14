package dip_second;

class EmailMessageSender implements MessageSender {

    public void send(String address, String content) {
        System.out.println("Sending email to " + address + " : " + content);
    }
}
