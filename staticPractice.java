class HondaCity
{
    static long price = 10;
    int a, b;

    static double roadPrice(String city)
    {
        switch (city)
        {
            case "delhi":
                return price + price * 0.1;

            case "mumbai":
                return  price + price * 0.2;
        }
        return 0;
    }
}


public class staticPractice {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        System.out.println(h1.roadPrice("mumbai"));
        System.out.println(HondaCity.price);
    }
}
