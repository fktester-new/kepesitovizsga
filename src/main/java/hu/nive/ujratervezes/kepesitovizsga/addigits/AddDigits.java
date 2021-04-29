package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input){
        if (input == null || input.isBlank()){
            return -1;
        }
        char[] temp = input.toCharArray();
        int result = 0;
        for (char c: temp) {
            result += isInteger(c);

        }
        return result;
    }

    private int isInteger(char c){
        try{
            int a = Integer.parseInt(String.valueOf(c));
            return a;
        } catch (NumberFormatException ne){
            return 0;
        }
    }
}
