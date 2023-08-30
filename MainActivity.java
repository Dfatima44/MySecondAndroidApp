package com.example.mysecondandriodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {


    private Executor executor = Executors.newSingleThreadExecutor();


    private Button button;
 //   @Override
//    public void onClick(View v){
//        //do something here
//        Toast.makeText(this,"Yay! created my first android app", Toast.LENGTH_LONG).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.awesome_button);
       // button.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Hello ITE4450!", Toast.LENGTH_LONG).show();

                Log.d("BUTTON", "Alright my button is working");
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                try {
                    URL url = new URL("    //https://api.themotivate365.com/stoic-quote\n");
                    JsonNode root = mapper.readTree(url);
                    String quote = root.get("quote"). asText();
                    String author = root.get("author").asText();
                    Log.d("JSON", author);
                }catch ( Exception e){
                    Log.e("DOWNLOAD", e.getMessage());

                }
            };
        });

    }

    public String getQuote(){
        String quote = "";
        String author = "";

        public void run() {
            ObjectMapper mapper = new ObjectMapper();
            try {
                URL url = new URL("    //https://api.themotivate365.com/stoic-quote\n");
                JsonNode root = mapper.readTree(url);
                String quote = root.get("quote"). asText();
                String author = root.get("author").asText();
                Log.d("JSON", author);
            }catch ( Exception e){
                Log.e("DOWNLOAD", e.getMessage());

            }
        };
    };


    }
}