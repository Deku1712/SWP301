package Control;

import java.util.Random;

public class Feature {
    

    public int getInt(){
        Random random = new Random();
        int ran = random.nextInt(200);
        return ran;
    }
}
