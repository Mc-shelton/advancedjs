import javax.xml.stream.events.ProcessingInstruction;

class Animal{
    public void animalSound(){
        System.out.println("The animals make a sound");
        
    }
}

class Pig extends Animal{
    public void pigSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says: bow wow");
    }
}


public class Polymorphism{
    public static void main (String[] args){
        Animal animalObj = new Animal();
        Pig pigObj = new Pig();
        Animal dogObj = new Dog();

        animalObj.animalSound();
        pigObj.pigSound();
        dogObj.animalSound();
    }
}