class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuuut");
    }
}

class Inheritance extends Vehicle{
    private String modelName = "Mustibishi";
    public static void main(String[] args){
        Inheritance myCar = new Inheritance();
        myCar.honk();
        System.out.println("asdfkk");
    }
}

//use final to disable inheritance