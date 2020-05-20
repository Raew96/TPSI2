package com.example.trenaer;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private long WorkoutID;
    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(savedInstanceState != null)
        {
            WorkoutID = savedInstanceState.getLong("WorkoutID");
        }
        else {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopWatchFragment stopwatchFragment = new StopWatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView tittle = view.findViewById(R.id.textTitle);
            Workout work = Workout.workouts[(int) WorkoutID];
            tittle.setText(work.getName());
            TextView description = view.findViewById(R.id.textDescription);
            description.setText(work.getDescription());
        }
    }

    public void  onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putLong("WorkoutID", WorkoutID);
    }

    public void setWorkoutID(long x)
    {
        this.WorkoutID = x;
    }

}
