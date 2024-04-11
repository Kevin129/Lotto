package pl.game.totolotek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Definicja tablicy przechowującej  49 liczb*/
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = 1; i <+ 49; i++){
                    list.add(i);
                }
                /*Przemieszanie liczb zajdujących się w tablicy*/
                Collections.shuffle(list);

                /*Wylosowanie 6 losowych liczb i dodanie ich do nowej tablicy*/
                ArrayList<Integer> chosen = new ArrayList<Integer>();
                for (int i = 1; i < 7; i++){
                    chosen.add(list.get(i));
                }
                /* Utworzenie łańcucha z liczb za pomocą StringBulider*/
                StringBuilder lancuch = new StringBuilder();

                for (int i:chosen){
                    lancuch.append(String.valueOf(i));
                    /* odstęp pomiędzy wyświetlanymi liczbami*/
                    lancuch.append(", ");
                }
                /* wyświetlenie wszystkiego*/
                textView.setText(lancuch.toString());
            }
        });

    }
}