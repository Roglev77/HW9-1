public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet pet2 = new Pet("cat", "Whiskers");
        Pet pet3 = new Pet("bird", "Jack");


        Human mother = new Human("Jane", "Karleone", 1950);
        Human father = new Human("Vito", "Karleone", 1940);
        Human child = new Human("Michael", "Karleone", 1977, 90, pet1, mother, father);

        Human mother1 = new Human("Mary", "Jane", 1990);
        Human father1 = new Human("John", "Jane", 1970);
        Human child1 = new Human("Michael", "Jane", 2020, 110, pet2, mother1, father1);

        Human mother2 = new Human("Jane", "Smith", 1980);
        Human father2 = new Human("James", "Smith", 1978);
        Human child2 = new Human("Bob", "Smith", 2005, 105, pet3, mother2, father2);


        Family family1 = new Family(mother, father);
        family1.addChild(child);
        child.setPet(pet1);

        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(child.getPet().toString());

        System.out.println("Сім'я 1:");
        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);
        System.out.println();

        System.out.println("Сім'я 2:");
        System.out.println(mother2);
        System.out.println(father2);
        System.out.println(child2);

        child.greetPet();
        child.describePet();
        pet1.respond();
        pet1.eat();
        pet1.foul();
    }
}
