package com.example.jvcute;

import androidx.annotation.NonNull;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    private LayoutInflater inflater;
    @Nullable
    private ViewGroup container;
    @Nullable
    private Bundle savedInstanceState;

    @Nullable
    @Override

  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        this.inflater = inflater;
        this.container = container;
        this.savedInstanceState = savedInstanceState;
        super.onCreateView(inflater, container, savedInstanceState);
   return inflater.inflate(R.layout.fragment_dialog, container, false);


    }
}