package com.example.fina.fina_1202150284_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private int counts = 1;
    private Button plus, minus;
    private TextView value;
    private ImageView air;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.imageview);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        air = findViewById(R.id.battery);

        air.setImageResource(R.drawable.ic_battery_20_black_24dp);
        value.setText(Integer.toString(counts) + "L");

    }

    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    air.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Watter is Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    air.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    air.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    air.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    air.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    air.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Watter is Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    air.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Watter is Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    air.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    air.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    air.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    air.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    air.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Watter is Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}

