
/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 1
 *    Cat
 *    Duration=0.5
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Create your own object
*/

public class Cat {

    private String name;
    private int lives = 9;

    Cat(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("meeeeeooooooooooowwwwwwwww!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("i don't know my own name!");
        else
            System.out.println("my name is " + name);
    }

    void kill() {
        lives--;
        if (lives > 0)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
            System.out.println("that's overkill yo!");
        else
            System.out.println("DEAD CAT :(");
    }

   
}


									