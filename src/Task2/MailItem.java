package Task2;

abstract class MailItem {

    private String name;
    private String senderAddress;
    private String recipientAddress;

    public MailItem(String name, String senderAddress, String recipientAddress) {
        this.name = name;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }


    public abstract void deliver();
    public abstract void send();
}