package zw.automusic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AutoPlay {
	Player player;
	File file;
	
	public AutoPlay(File musicFile) {
		// TODO Auto-generated constructor stub
		this.file = musicFile;
	}
	
	public void play() throws JavaLayerException, FileNotFoundException {
		BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file));
		player = new Player(buffer);
		player.play();
	}
}
