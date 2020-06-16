package com.ren.adapter.newi;

public class PlayVlcService implements AdvancedMediaPlayer{

	@Override
	public String playMp4(String fileName) {
		return null;
	}

	@Override
	public String playVlc(String fileName) {		
		return "Advanced Media Vlc Running://" + fileName;
	}

	
}
