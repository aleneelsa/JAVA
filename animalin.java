public class animalin{
	public static void main(String [] args) {
	Fish fish=new Fish();
	System.out.println("FISH");
	fish.setName("Mimi");
	System.out.println("The fish's name is "+fish.getName() );
	fish.eat();
	fish.walk();
	fish.setName("Momo");
	System.out.println("The fish's name is "+fish.getName());
	System.out.println("\n");
	System.out.println("CAT");
	Cat cat=new Cat();
	cat.setName("Fluffy");
	System.out.println("The cat's name is "+cat.getName() );
	cat.walk();
	cat.eat();
	cat.setName("Moose");
	System.out.println("The cat's name is "+cat.getName() );
	System.out.println(" ");
	System.out.println("SPIDER");
	Spider spider=new Spider();
	spider.eat();
	spider.walk();
	}

}
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
    public void walk() {
    	System.out.println("This animal walks on "+legs+" legs");
    }
}
class Spider extends Animal{
   public  Spider() {
    	super(8);//All spider have eight legs
		
	}
   @Override
	public void eat() {
		System.out.println("Spider eat insects");
	}
}
interface Pet{
	String getName();
	void setName(String name);
	void play();
}
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);//All cat have 4 legs
		this.name=name;
	}
	Cat(){
		this("");
	}
	
	public void eat() {
		System.out.println("Cat eat fshes");
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
	 this.name=name;
		
	}
	@Override
	public void play() {
	System.out.println("Cat is playing");
		
	}
	
}
class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	public void eat() {
		System.out.println("Fish eat plants");
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void play() {
	  System.out.println("Fish is playing");
		
	} 
	public void walk() {
		System.out.println("Fish has no legs");
	}
	
}


