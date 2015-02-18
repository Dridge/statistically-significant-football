package com.github.dridge.websiteinteraction;

import java.net.*;
import java.io.*;

import com.github.dridge.files.FileManager;

public class URLConnectionReader {

	private String getWebPageDetail() throws Exception {
		/*
		 * Re-used an example taken from stack overflow
		 * http://stackoverflow.com/
		 * questions/12405159/how-to-get-data-from-a-url
		 */

		URL oracle = new URL(
				"http://www.premierleague.com/en-gb/players/ea-sports-player-performance-index/");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				yc.getInputStream()));
		String inputLine = "";
		String finalText = "";
		while ((inputLine = in.readLine()) != null) {
			finalText = finalText + inputLine;
		}
		in.close();
		return finalText;
	}

	public void putDetailIntoFile() throws Exception {
		String requiredText = this.getWebPageDetail();
		FileManager managedFile = new FileManager(requiredText);
	}
}