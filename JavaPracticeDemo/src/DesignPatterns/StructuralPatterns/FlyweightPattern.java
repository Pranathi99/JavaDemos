package DesignPatterns.StructuralPatterns;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface CharacterDesign {
    void display();
}

// Concrete flyweight class
class ConcreteCharacter implements CharacterDesign {
    private char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display() {
        System.out.println("Character: " + symbol);
    }
}

// Flyweight factory class
class CharacterFactory {
    private Map<Character, ConcreteCharacter> characters = new HashMap<>();

    public CharacterDesign getCharacter(char symbol) {
        ConcreteCharacter character = characters.get(symbol);

        if (character == null) {
            character = new ConcreteCharacter(symbol);
            characters.put(symbol, character);
        }

        return character;
    }
}

// Client code
public class FlyweightPattern {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Display characters using the flyweight objects
        CharacterDesign character1 = characterFactory.getCharacter('A');
        character1.display();

        CharacterDesign character2 = characterFactory.getCharacter('B');
        character2.display();

        CharacterDesign character3 = characterFactory.getCharacter('A');
        character3.display();

        // Check if the flyweight objects are the same
        System.out.println("character1 and character3 are the same: " + (character1 == character3));
    }
}
