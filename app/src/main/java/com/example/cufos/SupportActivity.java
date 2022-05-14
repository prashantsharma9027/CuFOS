package com.example.cufos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button,button4;
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_support);
        button=findViewById (R.id.button);
        button4=findViewById (R.id.button4);

        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent (Intent.ACTION_CALL);
                intent.setData (Uri.parse ("tel:+919027555614"));
                startActivity (intent);
            }
        });
        button4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","studentcare@cuchd.in", null));
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });
    }
}