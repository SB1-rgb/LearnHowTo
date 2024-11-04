package mdNew.java;

import java.util.Random;
import java.util.UUID;


public class DataGeneratorUtils {
    public static int generateRandomvalue(int limit){
        Random randomInput = new Random();
        return randomInput.nextInt(limit);
    }

    public static String generateRandomUUID (String domain){
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }



}

