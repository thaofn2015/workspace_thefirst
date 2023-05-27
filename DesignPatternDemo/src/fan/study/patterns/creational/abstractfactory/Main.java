package fan.study.patterns.creational.abstractfactory;

public class Main {

	public static void main(String []args) {
		
		FurnitureFactory.getFactory(MaterialType.WOOD).createChair().create();
		FurnitureFactory.getFactory(MaterialType.PLASTIC).createChair().create();
		
		FurnitureFactory.getFactory(MaterialType.WOOD).createTable().create();
		FurnitureFactory.getFactory(MaterialType.PLASTIC).createTable().create();
	}
}
