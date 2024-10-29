public class Task {
    public static void main(String[] args) {


        String sentence = "Hello, Java! How are you?";
        String[] words = sentence.split(" ");


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]).append(" ");
        }
        
        stringBuilder
                .replace(13, 17, "Ingress")
                .deleteCharAt(20)
                .insert(0, "Welcome ");
        System.out.println(stringBuilder.toString().trim());
    }
}
