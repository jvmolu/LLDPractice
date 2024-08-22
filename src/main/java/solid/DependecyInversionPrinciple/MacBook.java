package solid.DependecyInversionPrinciple;

public class MacBook {
    private Mouse mouse;
    private KeyBoard keyBoard;

    public MacBook(Mouse mouse, KeyBoard keyBoard) {
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    public void clickMouse() {
        mouse.click();
    }

    public void doubleClickMouse() {
        mouse.doubleClick();
    }

    public void scrollMouse() {
        mouse.scroll();
    }

    public void pressKeyBoard() {
        keyBoard.pressKey();
    }

    public void releaseKeyBoard() {
        keyBoard.releaseKey();
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
}
