package monkey;

public class Human extends Monkey {
    private String name;
    private int age;
    private String city;
 

    Human() {
        name = "Gomer";
        age = 36;
        city = "Springfield";
        super.country = "USA";
    }
    
    @Override
    public void about() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nCountry: " + country + "\nCity: " + city + "\n");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + ": Oh, I am so tired. I am going to sleep.\n");
    }
    
    public void donuts() {
        System.out.println(name + ": Mmm, doonats...");
    }
}
