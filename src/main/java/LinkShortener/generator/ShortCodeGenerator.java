package LinkShortener.generator;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ShortCodeGenerator {

    private static final String CHARACTERS = "...";
    private static final int LENGTH = 8;
    private final Random random = new Random();

    public String generate() {
        StringBuilder code = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(index));
        }

        return code.toString();
    }

}
