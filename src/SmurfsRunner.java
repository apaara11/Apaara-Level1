
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * \Done!
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class SmurfsRunner {
public static void main (String[] args) {
	Smurf Handy=new Smurf("Handy");
	Smurf Smurfette=new Smurf("Smurfette");
	Smurf papa=new Smurf("papa");

System.out.println(Handy.getName()+"I am a "+ Handy.isGirlOrBoy()+ ","+ " and I have a "+ Handy.getHatColor()+" hat. " + "I have a friend named Smurfette, and she is a " + Smurfette.isGirlOrBoy()+"."); 
System.out.println("Papa is wearing a "+papa.getHatColor()+" hat.");
}
}
