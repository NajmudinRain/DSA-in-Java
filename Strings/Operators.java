import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a');
        System.out.println((int)'a');
        System.out.println('a'+'b');
        System.out.println("a"+"b"); //java has only given operator loading(exception) for string.
        System.out.println((char) ('a'+1));
        System.out.println(("a"+'a'));
        //integer will be converted to Integer that will call toString()
        System.out.println("naj"+new ArrayList<>()); //the object will call toString() and the value will get added
        System.out.println("naj"+new Integer(56));
        System.out.println(new Integer(56)+"naj");
//        operator '+' is only defined for primivites and any one of the value is should  be string
        System.out.println(new ArrayList<>()+""+new Integer(56));
    }
}
