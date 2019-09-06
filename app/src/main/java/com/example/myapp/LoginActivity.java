package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex_activity_main);


    }

    /**点击登录跳到主页*********************************************************/
    public void jump_to_home(View view){
        Intent intent = new Intent();
        intent.setClass(this, HomeActivity.class);
        startActivity(intent);
    }
    /**点击登录跳到主页*********************************************************/


    /**点击右上角注册跳到注册页面*********************************************************/
    public void jump_to_signin(View view){
        Intent intent = new Intent();
        intent.setClass(this,SignInActivity.class);
        startActivity(intent);
    }
    /**点击右上角注册跳到注册页面*********************************************************/

}
