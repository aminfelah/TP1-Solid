package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class TheFileReader implements IReader {

	@Override
	public String read() throws IOException {
		String encodedline = "";
		BufferedReader reader = new BufferedReader(
				new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
		String aLine;
		while ((aLine = reader.readLine()) != null) {
			encodedline = encodedline + Base64.getEncoder().encodeToString(aLine.getBytes());

		}
		return encodedline;
	}

}
