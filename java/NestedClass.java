class OuterClass{
    int x = 5;

    class InnerClass{
        int y = 9;
    } 
}

class AnotherOuter{
    int x = 10;
     class InnerClass{
        int y=20;

        //can also return inner attributes e.g
        //but only when modifier is regular and not static
        public int myInnerMethod(){
            return x;
        }
    }
}
public class NestedClass{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        AnotherOuter myOtherOuter = new AnotherOuter();
        AnotherOuter.InnerClass myOtherInner = myOtherOuter.new InnerClass(); //for modifier regular/protected
        // AnotherOuter.InnerClass myOtherInner = new AnotherOuter.InnerClass(); // for modifier static

        System.out.println(myOtherInner.myInnerMethod());

        System.out.print(myOuter.x + myInner.y);
        System.out.println(myOtherInner.y);
    }
}