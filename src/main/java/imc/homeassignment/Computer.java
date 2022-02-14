package imc.homeassignment;

import java.util.Random;

public class Computer implements Options {
    @Override
    public Choices getChoice() {
        Choices[] choices = Choices.values();
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
