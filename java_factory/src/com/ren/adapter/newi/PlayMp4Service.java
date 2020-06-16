package com.ren.adapter.newi;

public class PlayMp4Service implements AdvancedMediaPlayer{

	@Override
	public String playMp4(String fileName) {		
		return "Advanced Media Mp4 Running://" + fileName;
	}

	@Override
	public String playVlc(String fileName) {		
		return null;
	}

}
