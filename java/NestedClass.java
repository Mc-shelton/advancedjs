class OuterClass{
    int x = 5;

    class Innerclass{
        int y = 9;
    } 
}

public class NestedClass{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.Innerclass myInner = myOuter.new Innerclass();
    }
}