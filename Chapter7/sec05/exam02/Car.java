package ch07.sec05.exam02;

public class Car {
	
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {
		speed = 0;
	}
}