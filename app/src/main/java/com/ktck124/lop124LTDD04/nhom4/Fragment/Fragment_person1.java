package com.ktck124.lop124LTDD04.nhom4.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.ktck124.lop124LTDD04.nhom4.Model.User;
import com.ktck124.lop124LTDD04.nhom4.R;
import com.ktck124.lop124LTDD04.nhom4.SinhVienAdapter;

import java.util.ArrayList;

public class Fragment_person1 extends Fragment{

    private View mview;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_person1, container, false);
        return mview;

    }






}
