package net.vanheesch.better;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.random.RandomGenerator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

class SentenceGeneratorTest {

	private final RandomGenerator randomMock = Mockito.mock(RandomGenerator.class);

	private SentenceGenerator sut;

	@BeforeEach
	void setUp() {
		List<String> subjects = List.of("Sub1", "Sub2", "Sub3");
		List<String> verbs = List.of("verb1", "verb2", "verb3");
		List<String> objects = List.of("obj1", "obj2", "obj33");
		sut = new SentenceGenerator(randomMock, subjects, verbs, objects);
	}

	@Test
	void sentenceConsistsOfSubjectVerbAndObject() {
		// given
		given(randomMock.nextInt(3)).willReturn(1);
		// when
		String result = sut.generateSentence();
		// then
		assertThat(result).isEqualTo("Sub2 verb2 obj2.");
	}
}
