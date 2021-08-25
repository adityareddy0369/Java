package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsBasics {

	public static void main(String[] args) {
		
		// IntStream 
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
		System.out.println();
		System.out.println(IntStream.range(1, 5).sum());
		
		// stream
		Stream.of("ADC", "ABC", "ACD").sorted().findFirst().ifPresent(System.out::println);
		
		// Arrays
		String[] StringArr = {"adi", "dsas", "wetg", "asdor", "fowi"};
		Arrays.stream(StringArr).filter(x -> x.startsWith("a")).sorted().forEach(x -> System.out.print(x + " "));
		System.out.println();
		int[] Intarr = {45, 65, 2, 6, 12, 9};
		Arrays.stream(Intarr).map(x -> x * x).average().ifPresent(System.out::println);
		
		// List
		List<String> list = Arrays.asList("STREAMS", "FUNCTIONAL", "LAMBDA");
		list.stream().map(String::toLowerCase).filter(x -> x.startsWith("s")).forEach(System.out::println);
		
		// Text file
		try {
			Stream<String> words = Files.lines(Paths.get("D:\\words.txt"));
			words.sorted().filter(x -> x.length() > 3).forEach(x -> System.out.print(x + " "));
			words.close();
			System.out.println();
			
			Stream<String> words1 = Files.lines(Paths.get("D:\\words.txt"));
			List<String> wordList = words1.sorted().filter(x -> x.contains("a")).collect(Collectors.toList());
			words.close();
			System.out.println(wordList);
		
			Stream<String> rows = Files.lines(Paths.get("D:\\data.txt"));
			int rowCount = (int) rows.map(x -> x.split(",")).filter(x -> x.length == 3).count();
			rows.close();
			System.out.println(rowCount);
			
			
			Stream<String> rows1 = Files.lines(Paths.get("D:\\data.txt"));
			rows1.map(x -> x.split(",")).filter(x -> x.length==3).filter(x -> Integer.parseInt(x[1]) > 3).forEach(x -> System.out.println(x[0] + " " + x[1] + " " +  x[2]));
			rows1.close();
			
			Stream<String> rows2 = Files.lines(Paths.get("D:\\data.txt"));
			Map<String, Integer> map = rows2.map(x -> x.split(",")).filter(x -> x.length==3).filter(x -> Integer.parseInt(x[1]) > 3).collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
			rows1.close();
			System.out.println("Map key values");
			for(Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue()) ;
			}
			
			for(String key : map.keySet()) {
				System.out.println(key + " " + map.get(key)) ;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Reduce
		double total = Stream.of(7.5,6.1,3.7).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println(total);
		
		IntSummaryStatistics summary = IntStream.of(7,9,5,34,2).summaryStatistics();
		System.out.println(summary);
		
		
		}

}
