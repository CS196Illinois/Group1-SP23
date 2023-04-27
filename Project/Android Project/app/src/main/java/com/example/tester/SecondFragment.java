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

import com.example.tester.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    int count1 = 12;
    int count2 = 30;
    int count3 = 500;

    private TextView text1;
    private Button plus1;
    private Button minus1;
    private TextView text2;
    private Button plus2;
    private Button minus2;
    private TextView text3;
    private Button plus3;
    private Button minus3;

    private Button submit1;
    private Button submit2;
    private Button submit3;

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text1 =  (TextView) getView().findViewById(R.id.counterTxt);
        plus1 = (Button) getView().findViewById(R.id.plus);
        minus1 = (Button) getView().findViewById(R.id.minus);
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                text1.setText(Integer.toString(count1) + " cups");
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;
                text1.setText(Integer.toString(count1) + " cups");
            }
        });
        text2 = (TextView) getView().findViewById(R.id.counterTxtExercise);
        plus2 = (Button) getView().findViewById(R.id.plusEx);
        minus2 = (Button) getView().findViewById(R.id.minusEx);
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 + 5;
                text2.setText(Integer.toString(count2) + " minutes");
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 - 5;
                text2.setText(Integer.toString(count2) + " minutes");
            }
        });
        text3 = (TextView) getView().findViewById(R.id.counterTxtCalories);
        plus3 = (Button) getView().findViewById(R.id.plus3);
        minus3 = (Button) getView().findViewById(R.id.minus3);
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3 = count3 + 25;
                text3.setText(Integer.toString(count3) + " calories");
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3 = count3 - 25;
                text3.setText(Integer.toString(count3) + " calories");
            }
        });
        submit1 = (Button) getView().findViewById(R.id.reset);
        submit2 = (Button) getView().findViewById(R.id.resetEx);
        submit3 = (Button) getView().findViewById(R.id.reset3);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setWaterInput(count1);

            }
        });
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setExerciseInput(count2);
            }
        });

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setCalorieInput(count3);
            }
        });


//        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
//            }
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}


