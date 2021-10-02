package exercise;

public class Ex169 {

    public static void main(String[] args) {

        String sentence = "one two three";
        String[] sentenceSplitted = sentence.split(" ");;

        StringBuilder stb = new StringBuilder();

        int i = sentenceSplitted.length-1;
        for (; i >0 ; i--) {
            stb.append(sentenceSplitted[i]);
            stb.append(" ");
        }
        stb.append(sentenceSplitted[i]);

        System.out.println(stb.toString());

    }
}
