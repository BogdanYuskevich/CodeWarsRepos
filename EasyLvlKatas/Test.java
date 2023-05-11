package EasyLvlKatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test {
    @FunctionalInterface
    interface UnaryFunc<T>  {
        T apply (T b);
    }
    //BiFunc
    //Implement forEach з func Interface без extends

    public static void main(String[] args) {
        List<Integer> list3 = List.of(1,2);
        UnaryFunc<Integer> powIt = (a) -> a*a;
        list3.forEach(b -> System.out.println(powIt.apply(b)));

        //
        BiFunction<Integer,Integer,Integer> sumFunc = (a,b) -> a + b;
    }
}
