/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package heap;

import heap.Help;

public class App {
    public String getGreeting(){
      return Help.toPrint();
        //return "Hello world.";
    }

    public static void main(String[] args){
        System.out.println(new App().getGreeting());
    }
}