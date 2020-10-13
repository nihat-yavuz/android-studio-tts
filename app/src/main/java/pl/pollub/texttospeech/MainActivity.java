package pl.pollub.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton apple;
    ImageButton pear;
    ImageButton plum;
    TTSManager ttsManager = null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttsManager = new TTSManager();
        ttsManager.init(this);

        apple =  findViewById(R.id.imageButton);
        pear =  findViewById(R.id.imageButton2);
        plum =  findViewById(R.id.imageButton3);


        apple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = "apple";
                ttsManager.initQueue(text);
            }
        });
        pear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = "pear";
                ttsManager.initQueue(text);
            }
        });
        plum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = "plum";
                ttsManager.initQueue(text);
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
}

