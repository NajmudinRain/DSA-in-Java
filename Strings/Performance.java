public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0; i<26; i++){
             char ch=  (char)('a'+i);
             series=series+ch;
             //+ operator with string create new string object to store the result.
        }
        System.out.println(series);
    }
}
