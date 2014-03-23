package com.pysnow.weixin;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
    private ActionBar actionBar;
    private ImageView logoView;
    private Button loginView;
    private Button registerView;
    private ImageView earthView;
    private Animation logoAnimation;
    private Animation loginRegisterAnimation;
    private Animation earthAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        actionBar = getSupportActionBar();
        logoView = (ImageView) findViewById(R.id.welcome_logo);
        loginView = (Button) findViewById(R.id.login);
        registerView = (Button) findViewById(R.id.register);
        earthView = (ImageView) findViewById(R.id.welcome_earth);
        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome_logo_appear);
        loginRegisterAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome_login_and_register_appear);
        earthAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome_earth_rise_and_disappear);

        actionBar.hide();
        logoView.startAnimation(logoAnimation);
        loginView.startAnimation(loginRegisterAnimation);
        registerView.startAnimation(loginRegisterAnimation);
        earthView.startAnimation(earthAnimation);
    }

    public void startLoginActivity(View view) {

    }

    public void startRegisterActivity(View view) {

    }

    public void startLanguageActivity(View view) {

    }

}
