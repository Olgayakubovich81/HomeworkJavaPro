package Task2;

class Letter extends MailItem {

    private String content;
    public Letter(String name, String senderAddress, String recipientAddress, String content) {
        super(name, senderAddress, recipientAddress);
        this.content = content;
    }

      @Override
    public void deliver() {
        System.out.println("Letter delivered to address: " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Letter sent from " + getSenderAddress() + " to " + getRecipientAddress());
    }
}