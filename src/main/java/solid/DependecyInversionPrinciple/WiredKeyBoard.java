package solid.DependecyInversionPrinciple;

public class WiredKeyBoard implements KeyBoard{
    @Override
    public void pressKey() {
        System.out.println("Wired Keyboard key pressed");
    }

    @Override
    public void releaseKey() {
        System.out.println("Wired Keyboard key released");
    }

    public void USBConnect() {
        System.out.println("Wired Keyboard connected via USB");
    }
}
