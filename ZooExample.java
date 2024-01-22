package Zoo;

public class ZooExample {
    public static void main(String[] args) {

        Animal lion = new Carnivore("Leo", 5, "Lion", "Golden", "Hunting in a group");
        Animal elephant = new Herbivore("Ellie", 10, "Elephant", "Gray", "Grass");
        Animal snake = new Reptile("Sly", 3, "Snake", "Scales");
        Animal parrot = new Bird("Polly", 2, "Parrot", "Colorful");
        Animal goldfish = new Fish("Goldie", 1, "Goldfish", "Fancy");


        lion.makeSound();
        lion.move();
        lion.eat();
        ((Carnivore) lion).hunt();

        elephant.makeSound();
        elephant.move();
        elephant.eat();
        ((Herbivore) elephant).graze();

        snake.makeSound();
        snake.move();
        snake.eat();
        ((Reptile) snake).baskInSunlight();

        parrot.makeSound();
        parrot.move();
        parrot.eat();
        ((Bird) parrot).fly();

        goldfish.makeSound();
        goldfish.move();
        goldfish.eat();
        ((Fish) goldfish).swim();
    }
}
