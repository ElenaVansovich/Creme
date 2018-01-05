package creme.bsu.cremeandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    private TextView creme, falcone, malt_hopes, the_view;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        creme = findViewById(R.id.creme);
        imageView = findViewById(R.id.cart);
        falcone = findViewById(R.id.falcone);
        malt_hopes = findViewById(R.id.malt_hops);
        the_view = findViewById(R.id.the_view);

        creme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsActivity.this, MainActivity.class));
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsActivity.this, CartActivity.class));
            }
        });

        falcone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsActivity.this, ReserveActivity.class));
            }
        });
        malt_hopes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsActivity.this, ReserveActivity.class));
            }
        });
        the_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurantsActivity.this, ReserveActivity.class));
            }
        });
    }
}
