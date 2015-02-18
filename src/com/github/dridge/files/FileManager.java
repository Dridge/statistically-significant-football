package com.github.dridge.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {
	private String fileLocation = "C:" + File.separatorChar + "dev" + File.separatorChar + "statSigFootball" + File.separatorChar + "output" + File.separatorChar;
	private static final String DEFAULT_FILE_NAME = "tempFile.txt";

	public FileManager(String requiredText, String newLocation) {
		this.createFile();
		this.appendTextToFile(requiredText);
		this.setFileLocation(newLocation);
	};

	public FileManager(String requiredText) {
		this.createFile();
		this.appendTextToFile(requiredText);
	};

	public FileManager() {
		this.createFile();
	};

	public void appendTextToFile(String requiredText) {
		
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(this.getFileLocation()+ DEFAULT_FILE_NAME, true)));
			out.println(requiredText);
			out.close();
		} catch (IOException e) {

		}
	}

	public void createFile() {
        File f = new File(this.fileLocation + DEFAULT_FILE_NAME);
        //Todo what if you need to make the directory?
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String location) {
		this.fileLocation = location;
	}

	public static String getDefaultFileName() {
		return FileManager.DEFAULT_FILE_NAME;
	}

}
