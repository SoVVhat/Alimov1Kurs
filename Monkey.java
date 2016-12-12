
package monkey;

public class Monkey {
    protected String country;
    protected String species;
    protected String woolColor;
   
    Monkey() {
         country = "Africa";
        species = "Makaka";
        woolColor = "Brown";
    }
    
    protected void monkeySpeech() {
        System.out.println("Monkey: Ua-a-a-a-a!\n");
    }
    protected void sleep() {
        System.out.println("Monkey is very tired, monkey goes to sleep. ...zZz...\n");
    }
    protected void about() {
        System.out.println("Country: " + country + "\nSpecies: " + species + "\nWool color: " + woolColor + "\n");
    }
    
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.about();
        monkey.monkeySpeech();
        monkey.sleep();
        Human human = new Human();
        human.about();
        human.donuts();
        human.sleep();
        
    }
    
}
