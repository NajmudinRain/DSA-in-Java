import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Najmudin Rain hello world";
        char arr[]=name.toCharArray(); //convert the given string itno the sequence of character.
        System.out.println(arr[0]);
        System.out.println(name.toCharArray()); //note: results only give character no arrays.
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('N'));
        System.out.println("   naj    ".strip());//remove spaces from front and end
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
