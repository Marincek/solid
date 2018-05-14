package isp_car;

public interface Vehicle {

    void drive();

    void stop();

    void lightsOn();

    void lightsOff();

    void horn();

    void setGear(int gear);

    void addFuel(Fuel fuel);

    int getFuelInTank();

    float getTiresPressure();

    void openTrunk();

}
