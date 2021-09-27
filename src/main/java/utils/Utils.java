package utils;

public class Utils {
    public  static Integer getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max+1 - min)) + min);
    }
}
