package org.example.example_12_02;

public class LetterCounter {
    private String string;
    public LetterCounter(String string){
        this.string = string;
    }
    public int[] counterLetters(){
        String[] strings = string.split(" ");
        int[] result = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].length();
        }
        return result;
    }
}
