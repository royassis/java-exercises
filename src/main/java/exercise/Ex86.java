package exercise;


public class Ex86
{   
    static final String word = "Python";
    public static void main(String[] args){
       int n= 21;
       while (n >1){
         if (n%2==0){
	   n = n/2;	
	}else{
	   n = n*3+1;
	}
	System.out.println(n);
       } 
    }
}
