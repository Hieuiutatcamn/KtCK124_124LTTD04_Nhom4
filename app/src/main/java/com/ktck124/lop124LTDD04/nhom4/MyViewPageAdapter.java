package com.ktck124.lop124LTDD04.nhom4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ktck124.lop124LTDD04.nhom4.Fragment.Fragment_home;
import com.ktck124.lop124LTDD04.nhom4.Fragment.Fragment_person1;
import com.ktck124.lop124LTDD04.nhom4.Fragment.Fragment_person2;
import com.ktck124.lop124LTDD04.nhom4.Fragment.Fragment_person3;


public class MyViewPageAdapter extends FragmentStateAdapter {
    public MyViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new Fragment_home();
            case 1:
                return new Fragment_person1();
            case 2:
                return new Fragment_person2();
            case 3:
                return new Fragment_person3();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
