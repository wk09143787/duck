package Model;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void swim(){
		
	}
	
	public void display(){
		
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
}
