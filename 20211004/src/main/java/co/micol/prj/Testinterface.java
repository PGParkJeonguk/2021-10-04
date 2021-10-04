package co.micol.prj;

import co.micol.prj.service.RemoteController;

public class Testinterface {
	private RemoteController rc;
	
	public Testinterface(RemoteController rc) {
		this.rc = rc;
	}
	
	public String toString() {
		rc.powerOn();
		rc.powerOff();
		return null;
	}
	
	public RemoteController rcReturn() {
		return rc;
	}

}
