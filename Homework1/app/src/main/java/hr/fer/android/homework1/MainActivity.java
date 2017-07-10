package hr.fer.android.homework1;


import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button click;
    private Button reset;
    private TextView text;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.click);
        reset = (Button) findViewById(R.id.reset);
        text = (TextView) findViewById(R.id.text);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                text.setText(Integer.toString(counter));
                if (counter % 2 == 0) {
                    text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.green, null));
                } else {
                    text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.blue, null));
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                text.setText(Integer.toString(counter));
                text.setTextColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
            }
        });
    }
}
