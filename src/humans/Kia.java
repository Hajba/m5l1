package humans;

import cars.Car;

public class Kia extends Car {

    public void startKia(String keyId) {
        start(keyId);
    }

    @Override
    protected void start(String someKeyId) {
        System.out.println("somebody try to start your car");
        if(someKeyId.charAt(0) == 'A') {
            return;
        }
        super.start(someKeyId);
    }


    protected void start(int intKeyId) {
        String strKeyId = String.valueOf(intKeyId);
        start(strKeyId);
    }

    protected void start(long longKeyId) {
        String strKeyId = String.valueOf(longKeyId);
        String strKeyIdUpperCase = strKeyId.toUpperCase();
        start(strKeyId);
    }

    protected void start(char[] charArr) {
        String strKeyId = String.valueOf(charArr);
        start(strKeyId);
    }

}
