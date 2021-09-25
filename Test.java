import java.util.*;

class Test {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Object> base = new ArrayList<>();
        ArrayList<Object> current = new ArrayList<>();
        current = base;
        for (int i = 0; i < n; i++) {
            ArrayList<Object> newList = new ArrayList<>();
            current.add(newList);
            current = newList;
        }

        current.add(1);
        System.out.println(base);

        foo(new ArrayList<>());
    }
    static void foo(Object a){

    }
}