package zw.automusic;

import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

//×°ÊÎÕß
public class Sound extends XiaoDu {
	protected XiaoDu xiaoDu;
	
	public Sound() {
		// TODO Auto-generated constructor stub
	}
	
	public void decrate(XiaoDu xd) {
		this.xiaoDu = xd;
	}
	
	@Override
	public void playSound() throws FileNotFoundException, JavaLayerException, InterruptedException {
		if (xiaoDu != null) {
			xiaoDu.playSound();
		}
	}
}
