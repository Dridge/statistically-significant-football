package com.github.dridge.launch;

import com.github.dridge.files.FileManager;
import com.github.dridge.websiteinteraction.URLConnectionReader;

public class Main {

	public static void main(String[] args) {
		URLConnectionReader connectionReader = new URLConnectionReader();

		try {
			connectionReader.putDetailIntoFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
