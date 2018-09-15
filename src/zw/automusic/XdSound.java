package zw.automusic;

import java.io.File;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

public class XdSound extends Sound {
	
	private File file =null;
	private int time=0;
	
	public XdSound(String path,int time) {
		// TODO Auto-generated constructor stub
		this.file = new File(path);
		this.time = time;
	}
	
	@Override
	public void playSound() throws FileNotFoundException, JavaLayerException, InterruptedException {
		// TODO Auto-generated method stub
		
		AutoPlay autoPlay = new AutoPlay(file);
		autoPlay.play();
		Thread.sleep(time);
		super.playSound();
	}

}
