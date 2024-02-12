package org.example.example_12_02;

public class WordsCounter{
    private String string;
    public WordsCounter(String string){
        this.string = string;

    }
    public int countWords(){
        String[] strings = string.split(" ");
        int result = strings.length;
        return result;
       // return string.split(" ").length;
    }

}
