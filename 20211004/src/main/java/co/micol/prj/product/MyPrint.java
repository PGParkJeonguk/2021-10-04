package co.micol.prj.product;

import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;

public class MyPrint implements Pencil, RemoteController {
	private Pencil pencil;
	
	public MyPrint(Pencil pencil) {
		this.pencil = pencil;
	}
	
	@Override
	public void selectPencil() {
		System.out.println();

	}

	@Override
	public void powerOn() {
		System.out.println("프린트를 전원을 켠다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");
		
	}
	
	public void toPrint() {
		System.out.print("나는 ");
		pencil.selectPencil();
	}

}
