import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sequentialStreams {

	Scanner sc = new Scanner(System.in);

	public void filterEvenNumbers() {
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		List<Integer> num = new ArrayList<>();

		for (int i = 1; i <= a; i++) {
			num.add(i);
		}

		num.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.println(s + " is a even number"));
	}

	public void filterOddNumbers() {
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		List<Integer> num = new ArrayList<>();

		for (int i = 1; i <= a; i++) {
			num.add(i);
		}

		num.stream().filter(x -> x % 2 != 0).forEach(s -> System.out.println(s + " is a odd number"));
	}

	public void filterChar() {
		Stream<String> ls = Stream.of("HEllo", "ahyufgy", "HAMBRDY", "aiufftu");
		// ls.filter(str ->
		// Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
		// ls.filter(str ->
		// Character.isLowerCase(str.charAt(3))).forEach(System.out::println);
		// ls.filter(str -> str.startsWith("H")).forEach(x -> System.out.println(x));
		ls.filter(str -> str.endsWith("y")).forEach(x -> System.out.println(x));

	}

	public void mapOperations() {
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		List<Integer> num = new ArrayList<>();

		for (int i = 1; i <= a; i++) {
			num.add(i);
		}

		num.stream().map(x -> x * x * x).forEach(b -> System.out.println(b));
	}

	public void reduceOperations() {
		List<Integer> nums = Arrays.asList(8, 3, 1, 7, 2, 6);
		Integer result = nums.stream().sorted().filter(n -> n % 2 == 1).map(n -> n * 2).reduce(0, (c, e) -> c + e);
		System.out.println(result);
	}

	public void limitOperations() {
		List<String> arr = Arrays.asList("hello", "hi", "good", "laptop");
		arr.stream().limit(2).forEach(System.out::println);

	}

	public void skipOperations() {
		List<String> arr = Arrays.asList("hello", "hi", "good", "laptop");
		arr.stream().skip(3).forEach(System.out::println);
	}

	public void concatOperations() {
		List<String> arr1 = Arrays.asList("hello", "hi");
		List<String> arr2 = Arrays.asList("good", "laptop");

		List<String> collectdata = Stream.concat(arr1.stream(), arr2.stream()).collect(Collectors.toList());
		// .forEach(System.out::println);
		System.out.println(collectdata);
	}

	public void distinctOperations() {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 4, 5, 6, 6, 7, 8, 9, 4, 5, 8, 9, 9, 4, 2);
		List<Integer> distinctNumber = numbers.stream().distinct().collect(Collectors.toList());
		// .forEach(System.out::println);
		System.out.println(distinctNumber);
	}

	public void distinctStringOperations() {
		List<String> str = Arrays.asList("laptop", "cpu", "desktop", "laptop", "keyboard", "keyboard", "mouse",
				"touchpad", "cpu");
		str.stream().distinct().forEach(System.out::println);
	}

	public void flatMapOperations() {
		List<String> arr1 = Arrays.asList("hello", "1", "99");
		List<String> arr2 = Arrays.asList("hi", "901", "91309719");

		List<List<String>> arrslst = Arrays.asList(arr1, arr2);
		List<String> collect = arrslst.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		// .forEach(System.out::println);
		System.out.println(collect);
	}

	public static void main(String[] args) {

		sequentialStreams ss = new sequentialStreams();
		// ss.filterEvenNumbers();
		// ss.filterOddNumbers();
		// ss.filterChar();
		// ss.mapOperations();
		// ss.reduceOperations();
		// ss.limitOperations();
		// ss.skipOperations();
		// ss.concatOperations();
		// ss.distinctOperations();
		// ss.distinctStringOperations();
		ss.flatMapOperations();
	}

}
