package fan.study.patterns.creational.abstractfactory;

public class PlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Table createTable() {
		return new PlasticTable();
	}

	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

}
