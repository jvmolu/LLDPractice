package solid.DependecyInversionPrinciple;

public class WireLessKeyBoard implements KeyBoard{
    @Override
    public void pressKey() {
        System.out.println("Wireless Keyboard key pressed");
    }

    @Override
    public void releaseKey() {
        System.out.println("Wireless Keyboard key released");
    }

    public void BluetoothConnect() {
        System.out.println("Wireless Keyboard connected via Bluetooth");
    }
}
