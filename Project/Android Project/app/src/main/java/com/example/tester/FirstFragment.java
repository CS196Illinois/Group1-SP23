package com.example.tester;

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

public class FirstFragment extends Fragment {
    private TextView counterTxt;
    private Button minus;
    private Button plus;
    private Button reset;

    private TextView counterTxtExercise;
    private Button minusEx;
    private Button plusEx;
    private Button resetEx;

    private Button submit;

    private int water;
    private int exercise;


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
                case R.id.minus:
                    minusCounter();
                    break;
                case R.id.plus:
                    plusCounter();
                    break;
                case R.id.reset:
                    initCounter();
                    break;
                case R.id.minusEx:
                    minusExCounter();
                    break;
                case R.id.plusEx:
                    plusExCounter();
                    break;
                case R.id.resetEx:
                    initExCounter();
                    break;
                case R.id.submit_goals:
                    submitGoals();
                    break;
            }

        }
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        counterTxt = (TextView) getView().findViewById(R.id.counterTxt);

        minus = (Button) getView().findViewById(R.id.minus);
        minus.setOnClickListener(clickListener);

        plus = (Button) getView().findViewById(R.id.plus);
        plus.setOnClickListener(clickListener);

        reset = (Button) getView().findViewById(R.id.reset);
        reset.setOnClickListener(clickListener);


        counterTxtExercise = (TextView) getView().findViewById(R.id.counterTxtExercise);

        minusEx = (Button) getView().findViewById(R.id.minusEx);
        minusEx.setOnClickListener(clickListener);

        plusEx = (Button) getView().findViewById(R.id.plusEx);
        plusEx.setOnClickListener(clickListener);

        resetEx = (Button) getView().findViewById(R.id.resetEx);
        resetEx.setOnClickListener(clickListener);

        submit = (Button) getView().findViewById(R.id.submit_goals);
        submit.setOnClickListener(clickListener);

        initCounter();
        initExCounter();



//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
    }
    private void initCounter() {
        water = 13;
        counterTxt.setText(water + " Cups");
    }

    private void plusCounter() {
        water++;
        counterTxt.setText(water + " Cups");
    }

    private void minusCounter() {
        water--;
        counterTxt.setText(water + " Cups");
    }

    private void initExCounter() {
        exercise = 45;
        counterTxtExercise.setText(exercise + " Minutes");
    }

    private void plusExCounter() {
        exercise++;
        counterTxtExercise.setText(exercise + " Minutes");
    }

    private void minusExCounter() {
        exercise--;
        counterTxtExercise.setText(exercise + " Minutes");
    }

    private void submitGoals() {
        ((MainActivity)getActivity()).setExerciseGoal(exercise);
        ((MainActivity)getActivity()).setDrinkGoal(water);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}