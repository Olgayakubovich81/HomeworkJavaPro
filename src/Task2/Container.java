package Task2;

class Container extends MailItem {
    private String content;

    public Container(String name, String senderAddress, String recipientAddress, String content) {
        super(name, senderAddress, recipientAddress);
        this.content = content;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering container '" + getName() + "' with content " + content + " from " + getSenderAddress() + " to " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Sending container '" + getName() + "'");
    }
}
