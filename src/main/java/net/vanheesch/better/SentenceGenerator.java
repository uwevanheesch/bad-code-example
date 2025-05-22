package net.vanheesch.better;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class SentenceGenerator {

	public static final int NUMBER_OF_SENTENCES = 5;

	private final List<String> subjects;
	private final List<String> verbs;
	private final List<String> objects;
	private final RandomGenerator random;

	public SentenceGenerator(RandomGenerator random, List<String> subjects, List<String> verbs, List<String> objects) {
		this.subjects = subjects;
		this.verbs = verbs;
		this.objects = objects;
		this.random = random;
	}

	public static void main(String[] args) {
		List<String> subjects = Arrays.asList("Liam", "Priya", "Mila", "Amina", "Noah", "Horst", "Emilia", "Finn", "Samir", "Lea", "Ben", "Sofia");
		List<String> verbs = Arrays.asList("tanzt", "codet", "bastelt", "zockt", "liebt", "hört", "sammelt", "zerlegt");
		List<String> objects = Arrays.asList("Bluetooth-Boxen", "Avocados", "TikTok-Videos", "Sneaker", "LED-Stripes", "Proteinriegel", "Plastikroboter", "Regenjacken");

		SentenceGenerator sentenceGenerator = new SentenceGenerator(new Random(), subjects, verbs, objects);

		for (int i = 0; i < NUMBER_OF_SENTENCES; i++) {
			System.out.println(sentenceGenerator.generateSentence());
		}
	}

	public String generateSentence() {
		String subject = getRandomElement(subjects);
		String verb = getRandomElement(verbs);
		String object = getRandomElement(objects);
		return String.format("%s %s %s.", subject, verb, object);
	}

	private String getRandomElement(List<String> list) {
		return list.get(random.nextInt(list.size()));
	}
}
