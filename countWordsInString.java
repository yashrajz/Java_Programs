public class countWordsInString {
    public static void main(String[] args) {
        
        String str = "       word      is here count         it now";
        str = str.replaceAll("\\s+", " ").trim();
        
        String words[] = str.split("\\s"); 
        System.out.println(words.length);
    }
}
