package com.ktck124.lop124LTDD04.nhom4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity  {
    private ViewPager2 mViewPageUser;
    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        mViewPageUser=findViewById(R.id.view_pager_home_user);
        mBottomNavigationView=findViewById(R.id.bottom_navigation_user);

        MyViewPageAdapter mViewPagerAdapterUser=new MyViewPageAdapter(this);
        mViewPageUser.setAdapter(mViewPagerAdapterUser);

        mBottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id== R.id.bottom_home_nav){
                    mViewPageUser.setCurrentItem(0);
                } else if (id== R.id.bottom_person1_nav){
                    mViewPageUser.setCurrentItem(1);
                }else if (id== R.id.bottom_person2_nav){
                    mViewPageUser.setCurrentItem(2);
                }else if (id== R.id.bottom_person3_nav){
                    mViewPageUser.setCurrentItem(3);
                }
                return true;
            }
        });

        mViewPageUser.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        mBottomNavigationView.getMenu().findItem(R.id.bottom_home_nav).setChecked(true);
                        break;
                    case 1:
                        mBottomNavigationView.getMenu().findItem(R.id.bottom_person1_nav).setChecked(true);
                        break;
                    case 2:
                        mBottomNavigationView.getMenu().findItem(R.id.bottom_person2_nav).setChecked(true);
                        break;
                    case 3:
                        mBottomNavigationView.getMenu().findItem(R.id.bottom_person3_nav).setChecked(true);
                        break;
                    default:
                        mBottomNavigationView.getMenu().findItem(R.id.bottom_home_nav).setChecked(true);
                        break;
                }
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
    }
}