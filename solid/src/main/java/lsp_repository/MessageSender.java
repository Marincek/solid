package lsp_repository;

class MessageSender {

    public void send(String address, String content) {
        System.out.println("Sending message to " + address + " : " + content);
    }
}
