package co.micol.prj.service;

public interface Pencil {
	void selectPencil();
	
	default void pencilInerface() {
		System.out.println("나는 인터페이스 객체이다.");		//interface에서만 쓸수 있는 default
	}
}
