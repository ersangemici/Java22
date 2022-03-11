package com.tatsumaki;

import java.util.Random;


public class User {
    private int ID ;
    private static String name_surname;
    public static String favorite_News ;

    public User(int ID, String name_surname, String favorite_News){
        this.ID=ID ;
        this.name_surname=name_surname;
        this.favorite_News= favorite_News;
    }

    /*public static List favorite_New_Add(String value) {
        favorite_News.add(value);
        return favorite_News;
    }
    /*public List favorite_New_Print(String value) {
        return  favorite_News;
    }
    public String favorite_New_Remove() {
        System.out.print("select the category to be removed :");
        System.out.println(favorite_News);
        Scanner removed_News = new Scanner(System.in);
        favorite_News.remove(removed_News);
        return "successfully removed" ;
    }
*/

    public static int  create_Id(){
        Random rnd = new Random();
        return rnd.nextInt(999999999);

    }
    public String user_Printer() {
        return ID +  " " +name_surname + " " + "\n"+favorite_News;
    }
    public static String getName_surname(){
        return name_surname;
    }
}

