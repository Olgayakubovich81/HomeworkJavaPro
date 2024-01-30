package Task2;

class Package extends MailItem {
    private boolean requiresInsurance;

    public Package(String name, String senderAddress, String recipientAddress, boolean requiresInsurance) {
        super(name, senderAddress, recipientAddress);
        this.requiresInsurance = requiresInsurance;
    }

    @Override
    public void deliver() {
        System.out.println("Package " + (requiresInsurance ? "with insurance " : "") + "delivered to address: " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Package " + (requiresInsurance ? "with insurance " : "") + "sent from " + getSenderAddress() + " to " + getRecipientAddress());
    }
}