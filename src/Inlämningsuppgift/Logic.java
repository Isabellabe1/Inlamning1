package Inlämningsuppgift;

import java.util.HashMap;

public class Logic {
    static HashMap<Character, String> morseConverter = new HashMap<Character, String>();
    static HashMap<String, Character> englishConverter = new HashMap<>();

    public Logic() {
        morseConverter.put('a', "*-");
        morseConverter.put('b', "-***");
        morseConverter.put('c', "-*-*");
        morseConverter.put('d', "-**");
        morseConverter.put('e', "*");
        morseConverter.put('f', "**-*");
        morseConverter.put('g', "--*");
        morseConverter.put('h', "****");
        morseConverter.put('i', "**");
        morseConverter.put('j', "*---");
        morseConverter.put('k', "-*-");
        morseConverter.put('l', "*-**");
        morseConverter.put('m', "--");
        morseConverter.put('n', "-*");
        morseConverter.put('o', "---");
        morseConverter.put('p', "*--*");
        morseConverter.put('q', "--*-");
        morseConverter.put('r', "*-*");
        morseConverter.put('s', "***");
        morseConverter.put('t', "-");
        morseConverter.put('u', "**-");
        morseConverter.put('v', "***-");
        morseConverter.put('w', "*--");
        morseConverter.put('x', "-**-");
        morseConverter.put('y', "-*--");
        morseConverter.put('z', "--**");

        morseConverter.put('1', "*----");
        morseConverter.put('2', "**---");
        morseConverter.put('3', "***--");
        morseConverter.put('4', "****-");
        morseConverter.put('5', "*****");
        morseConverter.put('6', "-****");
        morseConverter.put('7', "--***");
        morseConverter.put('8', "---**");
        morseConverter.put('9', "----*");
        morseConverter.put('0', "-----");

        morseConverter.put('.', "*-*-*-");
        morseConverter.put(',', "--**--");
        morseConverter.put('?', "**--**");


        englishConverter.put("*-", 'a');
        englishConverter.put("-***", 'b');
        englishConverter.put("-*-*",'c');
        englishConverter.put("-**", 'd');
        englishConverter.put("*", 'e');
        englishConverter.put("**-*", 'f');
        englishConverter.put("--*", 'g');
        englishConverter.put("****", 'h');
        englishConverter.put("**", 'i');
        englishConverter.put("*---", 'j');
        englishConverter.put("-*-", 'k');
        englishConverter.put("*-**", 'l');
        englishConverter.put("--", 'm');
        englishConverter.put("-*", 'n');
        englishConverter.put("---", 'o');
        englishConverter.put("*--*", 'p');
        englishConverter.put("--*-", 'q');
        englishConverter.put("*-*", 'r');
        englishConverter.put("***", 's');
        englishConverter.put("-", 't');
        englishConverter.put("**-", 'u');
        englishConverter.put("***-", 'v');
        englishConverter.put("*--", 'w');
        englishConverter.put("-**-", 'x');
        englishConverter.put("-*--", 'y');
        englishConverter.put("--**", 'z');

        englishConverter.put("*----", '1');
        englishConverter.put("**---", '2');
        englishConverter.put("***--", '3');
        englishConverter.put("****-", '4');
        englishConverter.put("*****", '5');
        englishConverter.put("-****", '6');
        englishConverter.put("--***", '7');
        englishConverter.put("---**", '8');
        englishConverter.put("----*", '9');
        englishConverter.put("-----", '0');

        englishConverter.put("*-*-*-", '.');
        englishConverter.put("--**--", ',');
        englishConverter.put("**--**" , '?');


    }

    public String getMorse(Character testdata) {
        String morse = "";
        morse = morseConverter.get(testdata);
        return morse;
    }

    public Character getEnglish(String testdata) {
        Character english;
        english = englishConverter.get(testdata);
        return english;

    }
}
