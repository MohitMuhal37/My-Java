class coffeeMachine{
    private int waterQuantity;
    private int sugarQuantity;
    private int milkQuantity;

    static private coffeeMachine my = null;
    private void coffeeMachine()
    {
        waterQuantity = 2;
        sugarQuantity = 1;
        milkQuantity = 5;
    }

    static coffeeMachine getInstance()
    {
        if(my == null)
        {
            my = new coffeeMachine();
        }
        return my;
    }
}

public class singletonClass {
    public static void main(String[] args) {
    coffeeMachine c = coffeeMachine.getInstance();
    }
}
