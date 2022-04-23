public class SB {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch);

        }
        System.out.println(sb.toString());
//        sb.reverse();

        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.charAt(0);


    }
}
