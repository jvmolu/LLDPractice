package solid.DependecyInversionPrinciple;

public class WirelessMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Wireless Mouse clicked");
    }

    @Override
    public void doubleClick() {
        System.out.println("Wireless Mouse double clicked");
    }

    @Override
    public void scroll() {
        System.out.println("Wireless Mouse scrolled");
    }

    public void BluetoothConnect() {
        System.out.println("Wireless Mouse connected via Bluetooth");
    }
}
