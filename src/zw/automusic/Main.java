package zw.automusic;

import java.io.File;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "." + File.separator + "src" + File.separator;
		String xd = "小度小度.mp3";
		String bzd = "不知道.mp3";
		String sz = "狮子.mp3";
		String start = "开始.mp3";
		String dkcdw = "打开猜动物.mp3";
		String tc = "退出.mp3";
		
		XdSound xdSound = new XdSound(path + xd, 1000);
		OpenAnimalsSound openAnimalsSound = new OpenAnimalsSound(path + dkcdw, 13500);
		StartSound startSound = new StartSound(path + start, 9000);
		ExitSound exitSound = new ExitSound(path + tc, 9000);
		UnknowSound unknowSound = new UnknowSound(path + bzd, 9000);
		LionSound lionSound = new LionSound(path + sz, 9000);
		//对 xdSound 对象进行包装，执行一个完成的小度猜动物到结束的流程
		xdSound.decrate(openAnimalsSound);
		openAnimalsSound.decrate(startSound);
		startSound.decrate(lionSound);
		lionSound.decrate(unknowSound);
		unknowSound.decrate(exitSound);
		
		try {
			//开始播放
			xdSound.playSound();
		} catch (FileNotFoundException | JavaLayerException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		AutoPlay autoPlay = null;
//		try {
//			for(int i = 0; i < 6; i++) {
//				autoPlay = new AutoPlay(new File(path + File.separator + xd));
//				autoPlay.play();
//				Thread.sleep(1000);
//				autoPlay = new AutoPlay(new File(path + File.separator + dkcdw));
//				autoPlay.play();
//				Thread.sleep(13500);
//				autoPlay = new AutoPlay(new File(path + File.separator + start));
//				autoPlay.play();
//				Thread.sleep(9000);
//				autoPlay = new AutoPlay(new File(path + File.separator + bzd));
//				autoPlay.play();
//				Thread.sleep(9000);
//				autoPlay = new AutoPlay(new File(path + File.separator + tc));
//				autoPlay.play();
//				Thread.sleep(9000);
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JavaLayerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
