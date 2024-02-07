package certificacionJava11.principal;

import java.util.function.BiPredicate;
public class Question22 {
/*Respuesta correcta BE */
public static void main(String[] args) {
//BiPredicate<Integer, Integer> test1 = (final Integer x, var y) -> (x.equals(y)); /*A*/
BiPredicate<Integer, Integer> test2 = (var x, final var y) -> (x.equals(y));/*B*/
//BiPredicate<Integer, Integer> test3 = (Integer x, final var y) -> (x.equals(y));/*C*/
//BiPredicate<Integer, Integer> test4 = (final var x, y) -> (x.equals(y));/*D*/
BiPredicate<Integer, Integer> test5= (Integer x, final Integer y) -> (x.equals(y));/*E*/
    }
}