abstract class Animal{ //abstract parent
    public abstract void animalSound(); //does not have a body
    public void sleep(){ //regular method
        System.out.println("zzzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println();
    }
}