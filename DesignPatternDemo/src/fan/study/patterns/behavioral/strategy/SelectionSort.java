package fan.study.patterns.behavioral.strategy;

import java.util.List;

public class SelectionSort implements SortStrategy {

	@Override
	public <T> void sortAlgorithm(List<T> items) {
		System.out.println("Sort with selection sort!");
	}

}
