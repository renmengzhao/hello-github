package com.ren.adapter.old;

public class MediaService implements MediaPlayer{

	@Override
	public String paly(String fileName) {
		return "media running mp3://" + fileName;		
	}	
}
