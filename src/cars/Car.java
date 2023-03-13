package cars;

import java.util.Objects;

public class Car {

    public static final String UANumber = "AA1010AA";

    private boolean isStarted;

    private String keyId;


    protected void start(String someKeyId) {
        // перевірка імобілайзера та заряду батареї
        if (someKeyId.equals(keyId)) {
            isStarted = true;
        }
    }

    public void turnOff() {
        // логіка яка перевіряє чи залишились ключі в авто і вимикає авто
        isStarted = false;
    }

    public boolean getStarted() {
        return isStarted;
    }



    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return Objects.equals(this.keyId, car.keyId);
    }


    public String getUANumber() {
        return UANumber;
    }

}
