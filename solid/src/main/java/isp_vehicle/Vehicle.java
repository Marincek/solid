package isp_vehicle;

interface Vehicle {

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
