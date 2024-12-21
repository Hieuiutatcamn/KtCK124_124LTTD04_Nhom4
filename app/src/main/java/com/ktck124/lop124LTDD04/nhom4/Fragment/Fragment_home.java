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


public class Fragment_home  extends Fragment {

    private View mview;
    ListView lvSV;
    ArrayList<User> arrayUsers;
    SinhVienAdapter adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_home, container, false);
        Anhxa();
        adapter = new SinhVienAdapter(getContext(), R.layout.dongsv_activity, arrayUsers);
        lvSV.setAdapter(adapter);


        return mview;

    }


    private void Anhxa()
    {
        lvSV=(ListView) mview.findViewById(R.id.list_user);
        arrayUsers= new ArrayList<>();
        arrayUsers.add(new User("1", "nhat@gmail.com", "Nam", "123", "123", "22115053122127", "Phan Minh Nhat"));
        arrayUsers.add(new User("1", "nhat@gmail.com", "Nam", "123", "123", "22115053122127", "Trần Công Hiếu"));
        arrayUsers.add(new User("1", "nhat@gmail.com", "Nam", "123", "123", "22115053122127", "Đặng thanh mai"));
    }



}
