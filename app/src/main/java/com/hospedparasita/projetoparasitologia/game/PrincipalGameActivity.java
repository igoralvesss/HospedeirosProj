package com.hospedparasita.projetoparasitologia.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hospedparasita.projetoparasitologia.MainActivity2;
import com.hospedparasita.projetoparasitologia.R;

public class PrincipalGameActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    String Tentei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_game);

        final LinearLayout norte = findViewById(R.id.norteLayout);
        final LinearLayout nordeste = findViewById(R.id.nordesteLayout);
        final LinearLayout sudeste = findViewById(R.id.sudesteLayout);
        final LinearLayout sul = findViewById(R.id.sulLayout);
        final LinearLayout centro = findViewById(R.id.centroLayout);
        final LinearLayout brasil = findViewById(R.id.brasilLayout);

        final Button startBtn= findViewById(R.id.startQuizBtn);

        norte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "norte";

                norte.setBackgroundResource(R.drawable.round_back_white_stroke10);

                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sudeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        nordeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "nordeste";

                nordeste.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                sudeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        sudeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "sudeste";

                sudeste.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        sudeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "sudeste";

                sudeste.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        sul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "sul";

                sul.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sudeste.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "centro";

                centro.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sudeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                brasil.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        brasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "brasil";

                brasil.setBackgroundResource(R.drawable.round_back_white_stroke10);

                norte.setBackgroundResource(R.drawable.round_back_white10);
                nordeste.setBackgroundResource(R.drawable.round_back_white10);
                sudeste.setBackgroundResource(R.drawable.round_back_white10);
                sul.setBackgroundResource(R.drawable.round_back_white10);
                centro.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicName.isEmpty()){
                    Toast.makeText(PrincipalGameActivity.this, "Por favor, selecione uma região", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(PrincipalGameActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }

            }
        });


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(PrincipalGameActivity.this, MainActivity2.class));
        finish();
    }

}