import java.util.HashMap;

public class aTele implements iTele {

    private HashMap<Character, Character> numMap = new HashMap<>();

    public aTele() {
        numMap.put('q','7');

        numMap.put('w','9');
        numMap.put('e','3');
        numMap.put('r','7');
        numMap.put('t','8');
        numMap.put('y','9');
        numMap.put('u','8');
        numMap.put('i','4');
        numMap.put('o','6');
        numMap.put('p','7');
        numMap.put('a','2');

        numMap.put('s','7');
        numMap.put('d','3');
        numMap.put('f','3');
        numMap.put('g','4');
        numMap.put('h','4');
        numMap.put('j','5');
        numMap.put('k','5');
        numMap.put('l','5');
        numMap.put('z','9');
        numMap.put('x','9');
        numMap.put('c','2');
        numMap.put('v','8');
        numMap.put('b','2');
        numMap.put('n','6');
        numMap.put('m','6');

    }

    /**
     * Takes a number converts all
     * the letters into numbers.
     *
     * @param phoneNum
     */
    @Override
    public String convertNumber(String phoneNum) {

        /* Iterate over the string and change all
        * the letters to numbers. */
        for (int i = 0; i < phoneNum.length(); i++) {

            if (Character.isAlphabetic(phoneNum.charAt(i))){
              phoneNum =  phoneNum.replace(phoneNum.charAt(i),numMap.get(Character.toLowerCase(phoneNum.charAt(i))));
            }
        }

        return phoneNum;
    }
}
