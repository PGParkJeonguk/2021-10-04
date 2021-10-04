package co.micol.prj;

import co.micol.prj.product.LgTv;
import co.micol.prj.product.MyPrint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.product.Pencil6B;
import co.micol.prj.product.SamsungTv;
import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;
import co.micol.prj.tryexam.TryCatchTest;
import junit.framework.Test;

public class App {
	public static void main(String[] args) {
		
//		RemoteController rc = new SamsungTv();
//		rc = new SamsungTv();
//		Testinterface ts = new Testinterface(rc);
//		rc = ts.rcReturn();
		
//		rc.powerOn();
//     	rc.powerOff();
//		ts.toString();
//		MyPrint myPrint = new MyPrint(new Pencil4B());
//		myPrint.toPrint();
		
		TryCatchTest trycatchTest = new TryCatchTest();
		try {
			trycatchTest.method1();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("항상 실행하는 구문");
		}
		
		
	
	}
}
