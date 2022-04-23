public class Palindrom {
    public static void main(String[] args) {
        String str="abcba";
//        String str="malayalam";
        System.out.println(isPalindrome(str));

    }

    static  boolean isPalindrome(String str){
        StringBuilder str1=new StringBuilder(str);
       StringBuilder rev= str1.reverse();

        if(rev.toString().equals(str)){
            return true;

        }
        return false;


    }

//   static boolean isPalindrome(String str){
//        boolean flag=true;
//        for(int i=0,j=str.length()-1; i<str.length()/2;i++,j--){
//
//            if(str.charAt(i)!=str.charAt(j)){
//                flag=false;
//                return flag;
//            }
//        }
//        return flag;
//    }
}
