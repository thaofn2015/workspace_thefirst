package fan.study.patterns.creational.abstractfactory;

public class FurnitureFactory {

	private FurnitureFactory() {
	}
	
	public static FurnitureAbstractFactory getFactory(MaterialType type) {
		
		switch (type) {
		case PLASTIC: 
			return new PlasticFactory();
		case WOOD: 
			return new WoodFactory();
		}
		return null;

	}
}
