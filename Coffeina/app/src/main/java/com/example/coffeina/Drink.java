package com.example.coffeina;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    //drinks to tavlica obiektow klasy Drink
    public static  final  Drink [] drinks =
            {
                    new Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczną pianką.", R.drawable.latte),
                    new Drink("Cappuccino", "Czarne espresso z dużą ilością spienionego mleka.", R.drawable.cappuccino),
                    new Drink("Espresso", "Czarna kawa ze świeżo mielonych ziaren najwyżeszej jakości.", R.drawable.filter)
            };

    private Drink(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public String toString()
    {
        return this.name;
    }


}
