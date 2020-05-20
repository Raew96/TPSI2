package com.example.coffeina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKN0 = "drinkNO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        //Pobieramy identyfikator napoju z intencji
        int drinkNO = (Integer)getIntent().getExtras().get(EXTRA_DRINKN0);
        //Użyj szczegołowych informacji o napoju klikniętym przez użytkownika
        Drink drink = Drink.drinks[drinkNO];

        //Wyswietlamy zdjecie napoju
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        //Wyswietlamy nazwe napoju
        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        //Wyswietlamy opis napoju
        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());


    }
}
