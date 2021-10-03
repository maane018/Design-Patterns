package AdapterPattern.Approach1;

public class LaptopChargerWith2Pin {
    GenericAdapter adapter;

    LaptopChargerWith2Pin(GenericAdapter adapter) {
        this.adapter = adapter;
    }

    public void charge() {
        this.adapter.charge();
    }
}
