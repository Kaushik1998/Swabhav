package com.techlab.loader;

import java.io.FileReader;
import java.io.IOException;

public  class GetFile implements IFilePath {

	private FileReader fileFromDevice = new FileReader(FILE_PATH);

	public GetFile() throws IOException {
		//This does nothing
	}

	@Override
	public FileReader getFileFromDevice() {
		// TODO Auto-generated method stub
		return fileFromDevice;
	}

}
