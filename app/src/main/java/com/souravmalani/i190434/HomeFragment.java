package com.souravmalani.i190434;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the TextView
        TextView welcomeTextView = view.findViewById(R.id.welcome_text);

        // Create a SpannableStringBuilder for the text
        SpannableStringBuilder spannableText = new SpannableStringBuilder("Welcome, Sourav");

        // Set "Welcome" text color to black
        spannableText.setSpan(
                new ForegroundColorSpan(Color.BLACK),
                0, 7, // Start and end indices for "Welcome"
                SpannableStringBuilder.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        // Set "Sourav" text color to orange
        spannableText.setSpan(
                new ForegroundColorSpan(Color.parseColor("#FFA500")), // Orange color
                8, spannableText.length(), // Start and end indices for "Sourav"
                SpannableStringBuilder.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        // Set the formatted text to the TextView
        welcomeTextView.setText(spannableText);

        return view;
    }
}