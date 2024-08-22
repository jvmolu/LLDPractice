package solid.DependecyInversionPrinciple;

public class WiredMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Wired Mouse clicked");
    }

    @Override
    public void doubleClick() {
        System.out.println("Wired Mouse double clicked");
    }

    @Override
    public void scroll() {
        System.out.println("Wired Mouse scrolled");
    }

    public void USBConnect() {
        System.out.println("Wired Mouse connected via USB");
    }
}
