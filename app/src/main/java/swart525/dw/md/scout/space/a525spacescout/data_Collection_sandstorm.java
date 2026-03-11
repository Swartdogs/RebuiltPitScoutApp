package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for data collection

    public static String Level3 = "False";
    public static String Level2 = "False";
    public static String Level1 = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all Buttons;
        final Button levelL3B = (Button) findViewById(R.id.endL3_B);
        levelL3B.setTag("D7D7D7D5");

        final Button levelL2B = (Button) findViewById(R.id.endL2_B);
        levelL2B.setTag("D7D7D7D5");

        final Button levelL1B = (Button) findViewById(R.id.endL1_B);
        levelL1B.setTag("D7D7D7D5");

        //Defines all RadioButtons


        //Changes color of buttons and sets variable to true if clicked
        //Resets to default if clicked again
        levelL3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) levelL3B.getTag();
                if (!"#FFE600".equals(colorCode)){
                    levelL3B.setBackgroundColor(ContextCompat.getColor(levelL3B.getContext(), R.color.colorPrimary));
                    levelL3B.setTag("#FFE600");
                    Level3 = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    levelL3B.setBackgroundColor(ContextCompat.getColor(levelL3B.getContext(), R.color.grey_button));
                    levelL3B.setTag("D7D7D7D5");
                    Level3 = "false";
                }


            }

        });
        levelL2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) levelL2B.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    levelL2B.setBackgroundColor(ContextCompat.getColor(levelL2B.getContext(), R.color.colorPrimary));
                    levelL2B.setTag("#FFE600");
                    Level2 = "true";


                } else if ("#FFE600".equals(colorCode)) {
                    levelL2B.setBackgroundColor(ContextCompat.getColor(levelL2B.getContext(), R.color.grey_button));
                    levelL2B.setTag("D7D7D7D5");
                    Level2 = "false";
                }

            }
        });
        levelL1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) levelL1B.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    levelL1B.setBackgroundColor(ContextCompat.getColor(levelL1B.getContext(), R.color.colorPrimary));
                    levelL1B.setTag("#FFE600");
                    Level1 = "true";
                } else if ("#FFE600".equals(colorCode)) {
                    levelL1B.setBackgroundColor(ContextCompat.getColor(levelL1B.getContext(), R.color.grey_button));
                    levelL1B.setTag("D7D7D7D5");
                    Level1 = "false";
                }
            }
        });

        //Defines Button to next page
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        //Creates OnClick Listener for next page button
        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                    Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                    startActivity(startintent);

            }
        });

    }

};
