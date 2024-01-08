package myPack;

import java.util.Random;

public class Logic {
    private String passwordResult;
    private int random;
    private char charSet[] = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z','1','2','3','4','5','6','7','8','9','0'};
    private char charGet[];

    //test new branch

    public void programLogic()
    {
        charGet = new char[getRandom()];
        for (int i = 0; i < charGet.length; i++){
            charGet[i] = charSet[getRandom()];
        }

        setPasswordResult(new String(charGet));
        System.out.println(getPasswordResult());

    }


    public void setPasswordResult(String passwordResult) {
        this.passwordResult = passwordResult;
    }

    public String getPasswordResult(){
        return passwordResult;
    }

    public int getRandom(){
        Random newRandom = new Random();
       return random = newRandom.nextInt(charSet.length);
    }
}
