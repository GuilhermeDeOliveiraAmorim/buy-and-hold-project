package model.avenue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class AvenueData {
	
	public AvenueData() {
		
	}

	public BufferedReader getAvenueData() throws UnsupportedEncodingException, FileNotFoundException {
		BufferedReader avenueData = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\workspace_java\\buy-and-hold-project\\data\\avenue_data.txt"), "UTF-8"));
		return avenueData;
	}

}