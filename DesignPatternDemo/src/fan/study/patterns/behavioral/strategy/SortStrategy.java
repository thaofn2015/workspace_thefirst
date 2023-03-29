package fan.study.patterns.behavioral.strategy;

import java.util.List;

public interface SortStrategy {

	public <T> void sortAlgorithm(List<T> items);

}
