package com.ktck124.lop124LTDD04.nhom4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ktck124.lop124LTDD04.nhom4.Model.User;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<User> sinhvienList;

    public SinhVienAdapter(Context context, int layout, List<User> sinhvienList) {
        this.context = context;
        this.layout = layout;
        this.sinhvienList = sinhvienList;
    }




    @Override
    public int getCount() {
        return sinhvienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtTen=(TextView) view.findViewById(R.id.ten_sinhvien);
        TextView txtMSV=(TextView) view.findViewById(R.id.ma_sinhvien);


        User user=sinhvienList.get(i);

        txtTen.setText(user.getTenKhachHang());
        txtMSV.setText(user.getSDT());

        return view;
    }
}