package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule {
	public void encode() throws IOException {
		TheFileReader reader = new TheFileReader();
		IWriter writer = new TheFileWriter();
		String code = reader.read();
		writer.write(code);
	}

}
