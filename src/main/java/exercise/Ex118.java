
//Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string

package exercise; 
public class Ex118 {
    public static void main(String[] args) {
        String str = args[0];
        String subStr = args[1];
        Integer maxLen = Math.max(str.length(), subStr.length());
        int flag = 0;

        for (int i =0; i< maxLen; i++){
            for (int j =0; j< subStr.length(); j++){
                if (str.charAt(i+j) != subStr.charAt(j)){
                    flag = 1;
                    break;
                }else{
                    flag = 0;
                }
            }
            if (flag == 0){
                System.out.println(String.format("Substring: %s was found in string %s at position %d", subStr, str, i+1));
                System.exit(0);
            }
        }
        System.out.println(String.format("Substring: %s was not found in string %s", subStr, str));

    }

}