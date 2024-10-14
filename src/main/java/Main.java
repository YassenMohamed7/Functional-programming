import java.util.function.Consumer;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) {
//        assign a method to variable
        Function<Integer ,String> fn = num -> "you number is " + num;
        System.out.println(fn.apply(5));

//        Curring --> Method chaining
        Function<Integer, Function<Integer, Integer>> mul = n ->  m -> n * m;
        Function<Integer, Integer> mulBy2 = mul.apply(2);
        System.out.println(mulBy2.apply(10));
        System.out.println(mul.apply(5).apply(3));

//      passing a method
        Runnable runnable = () -> {
            System.out.println("My name is Yassin");
            System.out.println("this routine simulating as passing a method to another one ");
        };
        go(runnable);



    }

    public static void go(Runnable runnable){
        runnable.run();
    }



}
