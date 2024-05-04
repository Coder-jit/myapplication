package com.example.myapplication2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication2.Common.Common;

public class highlightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_highlight);

        TextView textView = (TextView) findViewById(R.id.text_view);
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        textView.setText(Common.CurrentItem.getName());
        if(Common.CurrentItem.isIschecked())
            imageView.setImageResource(R.drawable.camera);
        else
            imageView.setImageResource(R.drawable.camera);

    }
}