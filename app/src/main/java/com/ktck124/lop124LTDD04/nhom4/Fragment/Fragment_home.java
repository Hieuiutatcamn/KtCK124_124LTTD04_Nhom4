package com.ktck124.lop124LTDD04.nhom4.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ktck124.lop124LTDD04.nhom4.API.APIService;
import com.ktck124.lop124LTDD04.nhom4.API.RetrofitApp;
import com.ktck124.lop124LTDD04.nhom4.Model.User;
import com.ktck124.lop124LTDD04.nhom4.R;
import com.ktck124.lop124LTDD04.nhom4.SinhVienAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Fragment_home  extends Fragment {

    private View mview;
    ListView lvSV;
    ArrayList<User> arrayUsers;
    SinhVienAdapter adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_home, container, false);
        Anhxa();

        APIService apiService = RetrofitApp.getRetrofitInstance().create(APIService.class);
        // Gọi API để lấy danh sách quận
        Call<List<User>> call = apiService.getUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (response.isSuccessful()) {
                    List<User> quanList = response.body();
                    arrayUsers.clear();
                    arrayUsers.addAll(quanList);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getContext(), "Lỗi: " + response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(getContext(), "Lỗi kết nối: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
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
