package fan.study.patterns.behavioral.strategy;

import java.util.List;

public class StrategyPatternExample {
	
	public static void main(String[] args) {
		SortedList sort = new SortedList();
		sort.setItems(List.of("Thao", "Phan"));

		sort.setSortStrategy(new QuickSort());
		sort.sort();

		sort.setSortStrategy(new MergeSort());
		sort.sort();

		sort.setSortStrategy(new SelectionSort());
		sort.sort();
	}
}
