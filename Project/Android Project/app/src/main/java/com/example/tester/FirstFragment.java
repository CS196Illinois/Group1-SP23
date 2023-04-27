package com.example.tester;

import androidx.appcompat.app.AppCompatActivity;

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

    private Button route;

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        text1 =  (TextView) getView().findViewById(R.id.counterTxt1);
        plus1 = (Button) getView().findViewById(R.id.plus1);
        minus1 = (Button) getView().findViewById(R.id.minus1);
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
        text2 = (TextView) getView().findViewById(R.id.counterTxt2);
        plus2 = (Button) getView().findViewById(R.id.plus2);
        minus2 = (Button) getView().findViewById(R.id.minus2);
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
        text3 = (TextView) getView().findViewById(R.id.counterTxt3);
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
        submit1 = (Button) getView().findViewById(R.id.submit1);
        submit2 = (Button) getView().findViewById(R.id.submit2);
        submit3 = (Button) getView().findViewById(R.id.submit3);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setDrinkGoal(count1);

            }
        });
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setExerciseGoal(count2);
            }
        });

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setCalorieGoal(count3);
            }
        });
        route = (Button) getView().findViewById(R.id.nav2);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

    }
}
