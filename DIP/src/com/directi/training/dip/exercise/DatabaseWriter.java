package com.directi.training.dip.exercise;

import java.io.IOException;

public class DatabaseWriter implements IWriter {

	@Override
	public void write(String encodedLine) throws IOException {
		// TODO Auto-generated method stub
		MyDatabase database = new MyDatabase();
		database.write(encodedLine);
	}

}
