package co.micol.prj.tryexam;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {

	public void method1() {
		try {
			Class clazz = Class.forName("co.micol.prj.Testinterface");
//			Class clazz = Class.forName("co.micol.prj.TV");
			System.out.println("원하는 클래스가 존재합니다."); // -> 권장
		} catch (Exception e) {
			// 모르면 굳이 catch(Exception)
			e.printStackTrace();
//			System.out.println("예기치 않는 오류가 발생되었습니다.");
//			System.out.println("관리자에게 문의하세요.");
		}
//		}catch(FileNotFoundException f) {
//			f.printStackTrace(); // -> 비권장
//		}
	}

}
