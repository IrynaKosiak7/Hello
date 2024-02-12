package org.example.example_12_02;

public class AlgorithManager {
    private int algorithmId;
    private String string;
    public AlgorithManager(int algorithmId, String string){
        if (algorithmId < 1 || algorithmId > 2) {
            System.out.println("Error!");
        }else {
            this.algorithmId = algorithmId;
            this.string = string;
        }


    }
    public  int[] getResult(){
        if (algorithmId == 1) {
            WordsCounter wordsCounter = new WordsCounter(string);
            int[] result = new int[1];
            result[0] = wordsCounter.countWords();
            return result;
        }
        if (algorithmId == 2) {
            LetterCounter letterCounter = new LetterCounter(string);
            return letterCounter.counterLetters();
        }
        return new int[]{-1};
    }
}
