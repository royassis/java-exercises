import java.util.concurrent.TimeUnit;

public class Ex91 {
    public static void main(String[] args) throws InterruptedException{
        final long start= System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(1);
        final long end= System.currentTimeMillis();

        System.out.println(end-start);
    }
}
