package com.example.trenaer;


import android.os.Bundle;

import androidx.fragment.app.ListFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;

/**
 * A simple {@link ListFragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {


    interface WorkoutListListner
    {
        void itemClicked(long id);
    }

    private WorkoutListListner listner;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String [] names = new String[Workout.workouts.length];

        for(int i = 0; i < names.length; i++)
        {
            names[i] = Workout.workouts[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        this.listner = (WorkoutListListner)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        if(listner != null)
        {
            listner.itemClicked(id);
        }
    }
}
