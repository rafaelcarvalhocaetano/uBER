package com.br.uber;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {


    private Button btnsingUp, btnRegister;

    private FirebaseAuth auth;


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                                        .setDefaultFontPath("fonts/arkhip_font.ttf")
                                        .setFontAttrId(R.attr.fontPath).build()    );

        btnsingUp = (Button) findViewById(R.id.btn_SingUp);
        btnRegister = (Button) findViewById(R.id.btn_Register);
    }

    //parei no tempo 20:28 video 1


}
