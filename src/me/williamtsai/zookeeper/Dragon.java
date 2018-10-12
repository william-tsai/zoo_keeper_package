package me.williamtsai.zookeeper;

public class Dragon extends Mammal {
	public Dragon() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Dragon taking off.");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("AHHHHHH");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("AHHHHH Town is burning");
		this.energyLevel -= 100;
	}
}
