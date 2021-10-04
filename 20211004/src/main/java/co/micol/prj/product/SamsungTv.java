package co.micol.prj.product;

import co.micol.prj.service.RemoteController;

public class SamsungTv implements RemoteController {

	@Override
	public void powerOn() {
		System.out.println("SamsungTv 전원이 켜졌습니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv 전원이 꺼졌습니다.");
		
	}
	

}
