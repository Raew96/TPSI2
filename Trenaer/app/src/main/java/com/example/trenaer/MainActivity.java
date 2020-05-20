package com.example.trenaer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.*;
import android.view.View;
import android.app.Fragment;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            WorkoutDetailFragment detail = new WorkoutDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            detail.setWorkoutID(id);
            ft.replace(R.id.fragment_container, detail);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else
        {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }
    }
}
