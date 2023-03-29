package fan.study.patterns.behavioral.strategy;

import java.util.List;

public class SortedList {

	private SortStrategy sortStrategy;
	
	private List<String> items;

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
	public void sort() {
		sortStrategy.sortAlgorithm(items);
	}
}
