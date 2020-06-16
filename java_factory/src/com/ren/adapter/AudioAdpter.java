package com.ren.adapter;

import com.ren.adapter.newi.PlayMp4Service;
import com.ren.adapter.newi.PlayVlcService;
import com.ren.adapter.old.MediaPlayer;
import com.ren.adapter.old.MediaService;

public class AudioAdpter implements MediaPlayer{

	@Override
	public String paly(String fileName) {		
		return new MediaService().paly(fileName);
	}
	
	public String paly(String audioType, String fileName) {		
		switch (audioType) {
		case "vlc":			
			return new PlayVlcService().playVlc(fileName);
		case "mp4":			
			return new PlayMp4Service().playMp4(fileName);
		default:
			return new MediaService().paly(fileName);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new AudioAdpter().paly("mp4", "media/vcd"));
	}
	
	
	
}
