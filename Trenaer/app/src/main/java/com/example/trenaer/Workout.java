package com.example.trenaer;

public class Workout {

    private String name;
    private String description;

    public static final Workout[] workouts =
            {
                    new Workout("Rozciąganie kończyń", "5 pompek w staniu na rękach, \n" +
                      "10 przysiadow na jednej nodze, \n" +
                      "15 podciągnięć."),

                    new Workout("Ogólna agonia", "100 podciągnięć,\n" +
                       "100 pompek, \n" +
                       "100 brzuszków, \n" +
                       "100 przysiadów."),

                    new Workout("Tylko dla mięczaków", "5 podciągnięć, \n" +
                            "10 pompek, \n" +
                            "15 przysiadów."),

                    new Workout("Siła i dystans",
                            "Bieg na 500m, \n" +
                                    "21 wydźwignięć ciężarka, \n" +
                                    "21 podciągnięć.")
            };

    private Workout(String name, String description)
    {
            this.name = name;
            this.description = description;
    }

    public String getDescription()
    {
        return  description;
    }

    public String getName()
    {
        return  name;
    }

    public String toString()
    {
        return this.name;
    }

}
