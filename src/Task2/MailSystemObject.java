package Task2;

public class MailSystemObject {
    public static void main(String[] args) {

        Letter letter = new Letter("Greetings", "123 Main St", "456 Broadway", "Hello!");
        Parcel parcel = new Parcel("Gift", "789 Oak St", "321 Pine St", 2.5);
        Package packageItem = new Package("Electronics", "456 Elm St", "789 Maple St", true);
        Container container = new Container("Large Box", "123 Main St", "456 Park Ave", "Fragile items");


        System.out.println("Sending and delivering letters:");
        letter.send();
        letter.deliver();

        System.out.println("\nSending and delivering parcels:");
        parcel.send();
        parcel.deliver();

        System.out.println("\nSending and delivering packages:");
        packageItem.send();
        packageItem.deliver();

        System.out.println("\nSending and delivering containers:");
        container.send();
        container.deliver();


    }
}
