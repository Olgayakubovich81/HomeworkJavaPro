package Task2;

class Parcel extends MailItem {
    private double weight;

    public Parcel(String name, String senderAddress, String recipientAddress, double weight) {
        super(name, senderAddress, recipientAddress);
        this.weight = weight;
    }

    @Override
    public void deliver() {
        System.out.println("Parcel with weight " + weight + " kg delivered to address: " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Parcel sent from " + getSenderAddress() + " to " + getRecipientAddress());
    }
}