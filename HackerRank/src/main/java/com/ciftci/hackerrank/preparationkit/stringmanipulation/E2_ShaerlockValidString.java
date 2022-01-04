
package com.ciftci.hackerrank.preparationkit.stringmanipulation;

import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Set;

public class E2_ShaerlockValidString {

    public static void main(String[] args) {

        isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
    }

    public static String isValid(String s) {
        HashMap<Character, Integer> characterFrequencyMap = new HashMap<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++){
            Character curentChar = chars[i];
            characterFrequencyMap.put(curentChar,  characterFrequencyMap.getOrDefault(curentChar, 0) +1);
        }

        Collection<Integer> values = characterFrequencyMap.values();
        HashMap<Integer, Integer> frequencyCountMap = new HashMap<>();

        for (Integer value : values){
            frequencyCountMap.put(value,  frequencyCountMap.getOrDefault(value, 0) +1);
        }

        if(frequencyCountMap.size() > 2 ){
            return "NO";
        }

        if(frequencyCountMap.size() == 2 ){
            Set<Integer> keys = frequencyCountMap.keySet();
            int firstKey = keys.toArray(new Integer[0])[0];
            int secondKey = keys.toArray(new Integer[0])[1];

            Integer firstFrequencyCount = frequencyCountMap.get(firstKey);
            Integer secondFrequencyCount = frequencyCountMap.get(secondKey);

            if((firstFrequencyCount == 1 && firstKey ==1 ) || (secondKey == 1 && secondFrequencyCount ==1 ) )
                return "YES";

            if(firstFrequencyCount != 1 && secondFrequencyCount != 1 )
                return "NO";

            if( Math.abs( firstKey - secondKey) != 1){
                return "NO";
            }
        }




        return "YES";
    }

}
