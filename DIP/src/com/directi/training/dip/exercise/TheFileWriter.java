package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TheFileWriter implements IWriter {
	private String _fileName;

	@Override
	public void write(String encodedLine) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
		writer.write(encodedLine);
		writer.close();
	}

}
