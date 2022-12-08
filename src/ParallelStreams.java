import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		int avlProcessor = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors : " + avlProcessor);
		List<Integer> numbers = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toList());
		// printStream(numbers.stream());
		printStream(numbers.parallelStream());
	}

	static void printStream(Stream<Integer> li) {
		li.forEach(s -> {
			System.out.println(LocalTime.now() + " value : " + s + " -thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

}
