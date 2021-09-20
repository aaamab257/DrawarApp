package com.proj.drawarapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout ;
    ImageView imgMenu ;
    NavigationView nav ;
    View header ;
    TextView name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void initialView() {
        drawerLayout = findViewById(R.id.drawerLayout);
        imgMenu = findViewById(R.id.menuImg);
        nav = findViewById(R.id.navView );
        header = nav.getHeaderView(0);
        name = header.findViewById(R.id.txtUserName);
        name.setText("Ahmed Ashraf");
    }
}