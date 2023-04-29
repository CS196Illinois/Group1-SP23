package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tester.databinding.FragmentFirstBinding;

public class Welcome extends Fragment{


    private TextView waterTxt;
    private TextView exerciseTxt;
    private TextView caloriesTxt;
    private TextView goalsTxt;

    private Button addData;
    private Button goals;

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.addData:
                    break;
                case R.id.goals:
                    break;
            }

        }
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //skeleton function for setting the text of one of the goals for the day

        waterTxt = (TextView) getView().findViewById(R.id.textView3);
        int todayWater = ((MainActivity) getActivity()).getWaterInput();
        waterTxt.setText("Today's water intake:" + todayWater + " cups");

        exerciseTxt = (TextView) getView().findViewById(R.id.textView4);
        int todayEx = ((MainActivity) getActivity()).getExerciseInput();
        waterTxt.setText("Today's exercise duration: " + todayEx + " minutes");

        caloriesTxt = (TextView) getView().findViewById(R.id.textView5);
        int todayCal = ((MainActivity) getActivity()).getWaterInput();
        waterTxt.setText("Today's calories burned: " + todayCal + " calories");

        goalsTxt = (TextView) getView().findViewById(R.id.textView2);

        int count = 0;
        if (todayEx >= ((MainActivity) getActivity()).getExerciseGoal()) {
            count++;
        } else if (todayCal >= ((MainActivity) getActivity()).getCalorie_goal()) {
            count++;
        } else if (todayWater >= ((MainActivity) getActivity()).getDrink_goal()) {
            count++;
        }

        int percentGoals = (count / 3) * 100;
        goalsTxt.setText(percentGoals + "%" );


        addData = (Button) getView().findViewById(R.id.addData);
        goals = (Button) getView().findViewById(R.id.goals);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Welcome.this)
                        .navigate(R.id.action_welcome_to_FirstFragment);
            }
        });

        goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Welcome.this)
                        .navigate(R.id.action_welcome_to_SecondFragment);
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

