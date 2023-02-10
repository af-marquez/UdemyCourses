package io.github.afmarquez.pa1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public String[] arrFromFile;

	@Override
	public String getFortune() {
		Random random = new Random();
		String[] array = arrFromFile;
		if(array.length>0) {
			return array[random.nextInt(array.length)];
		}
		return "No FORTUNE for you";
	}

	@PostConstruct
	public void getFortunesFromFile() {
		System.out.println("Dentro do PostConstruct");
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
        arrFromFile = sentences.toArray(new String[sentences.size()]);
	}

}
