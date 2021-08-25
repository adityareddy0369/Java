package java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamDemo {

	public static void main(String[] args) {
		// Iterator
		List<Integer> list = IntStream.iterate(0, a -> a+2).mapToObj(Integer::valueOf).limit(10).collect(Collectors.toList());
		System.out.println(list);
		
		// Generator
		List<Integer> list1 = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(list1);
		
		// problems
		// Fibonacci series using streams iterate
		System.out.println("Fibonacci series: ");
		Stream.iterate(new long[] { 0, 1 }, x -> new long[] { x[1], x[0] + x[1] }).limit(10).forEach(x -> System.out.print(x[0] + " "));
		System.out.println();
		
		// TO Find the nth element of the fibonacci series
	//	Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] }).limit(91).skip(90).findFirst().get()[1];
	//	Stream.iterate(new long[] {1, 1}, f -> new long[] { f[1], f[0] + f[1] }).limit(n).reduce((a, b) -> b).get()[0];
		
		System.out.println();
		
		
 	}

}
