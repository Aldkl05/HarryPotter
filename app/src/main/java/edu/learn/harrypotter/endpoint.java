package edu.learn.harrypotter;

public class endpoint {
    public static String BASE_URL = "https://hp-api.herokuapp.com/api/";

    public static String ALL_CHARACTERS = BASE_URL + "characters";;


    public static String ALL_STUDENTS =  ALL_CHARACTERS+"/students";;

    public static String ALL_STAFF =  ALL_CHARACTERS+"/staff";;

    public static String GET_HOUSES = ALL_CHARACTERS+"/house/";


    public static String ALL_SPELL = BASE_URL+"spells";

    


}
