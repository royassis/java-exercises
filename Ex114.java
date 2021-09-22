public class Ex114 {
    public static void main(String[] args) {
        String str = args[0];
        Integer offset = Integer.parseInt(args[1]);
        String strWithOffset = "";
        int k =0;

        for (int i = 0; i < str.length(); i++){
            k = (offset + i)%(str.length());  
            strWithOffset = strWithOffset + str.substring(k, k+1);
        }
        System.out.println(String.format("original string: %s. strWithOffset: %s", str, strWithOffset));
       
    }

}