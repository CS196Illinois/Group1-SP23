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

public class Welcome extends Fragment{


    private TextView waterTxt;
    private TextView exerciseTxt;
    private TextView caloriesTxt;

    private Button addData;
    private Button home;
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
                case R.id.home:
                    break;
                case R.id.goals:
                    break;
            }

        }
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //skeleton function for setting the text of one of the goals for the day

        /*
        waterTxt = (TextView) getView().findViewById(R.id.textView3);
        *variable with today's water intake* = *getter for water intake*
        waterTxt.setText( "Today's water intake: + *variable with todays water intake* + cups");

         */
//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
