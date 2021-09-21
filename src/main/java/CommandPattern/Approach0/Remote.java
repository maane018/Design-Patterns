package CommandPattern.Approach0;

public class Remote {
    Light firstButton;
    Light secondButton;
    Alexa thirdButton;
    Alexa fourthButton;
    Oven fifthButton;
    Oven sixthButton;

    //    Problem 1: Why is everything hardcoded? If tomorrow the third button has to be changed or logic change, then code change
    public Remote() {
        firstButton = new Light();
        secondButton = new Light();
        thirdButton = new Alexa();
        fourthButton = new Alexa();
        fifthButton = new Oven();
        sixthButton = new Oven();
    }

    public void push(int buttonNumber) {
        if (buttonNumber == 1)
            firstButton.turnOn();
        else if (buttonNumber == 2)
            secondButton.turnOff();
        else if (buttonNumber == 3)
            thirdButton.on();
        else if (buttonNumber == 4)
            fourthButton.off();
        else if (buttonNumber == 5)
            fifthButton.heatUp();
        else if (buttonNumber == 6)
            sixthButton.heatDown();

    }
}
