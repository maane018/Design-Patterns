package AdapterPattern.Approach1;

public class Adapter2to3 implements GenericAdapter {
    WallWith3PinCharger wallCharger;

    Adapter2to3(WallWith3PinCharger wallCharger) {
        this.wallCharger = wallCharger;
    }

    @Override
    public void charge() {
        this.wallCharger.charge();
    }
}
