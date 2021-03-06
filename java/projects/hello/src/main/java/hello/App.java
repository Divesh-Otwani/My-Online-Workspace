/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hello;

import hello.Help;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.lang.Exception;


public class App {

  public String urlGet(){
    try {
      Document doc = Jsoup.connect("http://www.google.com").get();
      return doc.body().html();
    } catch (Exception e){
      return "Failed url";
    }
  }

  public String getGreeting(){
    return Help.toPrint();
    //return "Hello world.";
  }

  public static void main(String[] args){
    System.out.println(new App().getGreeting());
    System.out.println(new App().urlGet());
  }




}
