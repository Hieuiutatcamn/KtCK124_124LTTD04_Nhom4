package com.ktck124.lop124LTDD04.nhom4.API;

import com.ktck124.lop124LTDD04.nhom4.Model.CapNhatKhachHangRequest;
import com.ktck124.lop124LTDD04.nhom4.Model.ResponseChung;
import com.ktck124.lop124LTDD04.nhom4.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {
    @GET("users")  // Đây là endpoint API bạn cung cấp
    Call<List<User>> getUsers();

    @GET("users/detail/{userId}")  // Lấy ra tông tin cá nhân khách hàng
    Call<User> getUserDetail(@Path("userId") String userId);

    @POST("users/update/{userId}")  //Cập nhật thông tin khách hàng
    Call<ResponseChung> updateUser(@Path("userId") String userId, @Body CapNhatKhachHangRequest capNhatKhachHangRequest);
}
