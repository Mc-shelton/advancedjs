import java.util.Scanner;
import myPack.*;

public class JavaBegginer{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args){
        JavaBegginer myObj = new JavaBegginer();
        Scanner anotherObj = new Scanner(System.in);
        PackageClass pkgObj = new PackageClass();
        
        System.out.println("Enter username");
        String username = anotherObj.nextLine();
        System.out.println(pkgObj.x);

        myObj.setName(username);
        System.out.println(myObj.getName());
    }
}
