package io_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputFilename = args[0];
		String outputFilename = args[1];

		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);

		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));

		Map<String, Integer> map = new TreeMap<>();

		String str;
		while ((str = br.readLine()) != null) {
			str = str.trim();
			String[] words = str.split(" ");

			for (String word : words) {
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
			}		
		};

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> me = it.next();

			bw.write(me.getKey() + " : " + me.getValue() + "\n");
		}

		br.close();
		bw.close();
		
	}

}
