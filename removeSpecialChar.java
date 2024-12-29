public class removeSpecialChar {
    public static void main(String[] args) {

        String str = "ah^&hVMh^h167&%j";
    
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println(result);

    
    }
}
