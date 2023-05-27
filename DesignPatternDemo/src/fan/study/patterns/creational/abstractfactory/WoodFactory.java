package fan.study.patterns.creational.abstractfactory;

public class WoodFactory extends FurnitureAbstractFactory {

	@Override
	public Table createTable() {
		return new WoodTable();
	}

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

}
