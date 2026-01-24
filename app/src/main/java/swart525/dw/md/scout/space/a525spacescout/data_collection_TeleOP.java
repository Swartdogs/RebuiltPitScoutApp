package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection
    public static String shallow = "False";
    public static String deep = "False";
    public static String YesFit = "False";
    public static String NoFit = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all Buttons;
        final Button shallowB = (Button) findViewById(R.id.endHangShallow_B);
        shallowB.setTag("D7D7D7D5");

        final Button deepB = (Button) findViewById(R.id.endHangDeep_B);
        deepB.setTag("D7D7D7D5");

        //Defines all RadioButtons
        final RadioButton YesFitRB = (RadioButton) findViewById(R.id.fitYes_RB);
        final RadioButton NoFitRB = (RadioButton) findViewById(R.id.fitNo_RB);

        //Changes color of buttons and sets variable to true if clicked
        //Resets to default if clicked again
        shallowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) shallowB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    shallowB.setBackgroundColor(ContextCompat.getColor(shallowB.getContext(), R.color.colorPrimary));
                    shallowB.setTag("#FFE600");
                    shallow = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    shallowB.setBackgroundColor(ContextCompat.getColor(shallowB.getContext(), R.color.grey_button));
                    shallowB.setTag("D7D7D7D5");
                    shallow = "false";
                }


            }

        });
        deepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) deepB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    deepB.setBackgroundColor(ContextCompat.getColor(deepB.getContext(), R.color.colorPrimary));
                    deepB.setTag("#FFE600");
                    deep = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    deepB.setBackgroundColor(ContextCompat.getColor(deepB.getContext(), R.color.grey_button));
                    deepB.setTag("D7D7D7D5");
                    deep = "false";
                }


            }

        });

        final Button To_EndGame = (Button) findViewById(R.id.To_Engame_B);

        //Creates OnClick Listener for next page button
        To_EndGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
           public void onClick(View v) {


                if (YesFitRB.isChecked()){
                    YesFit = "True";
                }
                if (NoFitRB.isChecked()){
                    NoFit = "True";
                }
                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });

    }
}
