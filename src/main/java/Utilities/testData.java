package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class testData{

    public String alphaNumericCharacterGenerator(int stringLength){
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = stringLength;
        Random random = new Random();

        return random.ints(leftLimit,rightLimit + 1)
                .filter(i ->(i <=57 || i>=65)  && (i <=90 || i >=97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
    }


    public static String getRandomAlphabeticString(int count){
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String getRandomNumeric(int count){
        return RandomStringUtils.randomNumeric(count);
    }




}
