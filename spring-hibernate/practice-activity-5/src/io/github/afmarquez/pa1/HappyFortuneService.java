package io.github.afmarquez.pa1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		Random random = new Random();
		String[] array = getFortunesFromFile();
		if(array.length>0) {
			return array[random.nextInt(array.length)];
		}
		return "No FORTUNE for you";
	}

	@Override
	public String[] getFortunesFromFile() {
		List<String> sentences = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("src/io/github/afmarquez/pa1/fortunes.txt"));
            while (sc.hasNextLine()) {
                String sentence = sc.nextLine();
                sentences.add(sentence);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        return sentences.toArray(new String[sentences.size()]);
	}

}
