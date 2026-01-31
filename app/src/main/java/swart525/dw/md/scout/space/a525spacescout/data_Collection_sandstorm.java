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

    public static String AutoHangYes = "False";
    public static String AutoHangNo = "False";
    public static String TeleopDepot = "";
    public static String TeleopOutpost = "";
    public static String TeleopNeutralZone = "";
    public static int TeleopFuelCapacity = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all EditText boxes
        final EditText TeleopFuelCapacityTXT = (EditText) findViewById(R.id.teleOpFuelCapacity_TXT);

        //Defines all Buttons for Coral pickup
        final Button TeleopDepotB = (Button) findViewById(R.id.teleopDepot_B);
        TeleopDepotB.setTag("#D7D7D7D5");
        final Button TeleopOutpostB = (Button) findViewById(R.id.teleopOutpost_B);
        TeleopOutpostB.setTag("D7D7D7D5");
        final Button TeleopNeutralZoneB = (Button) findViewById(R.id.teleopNeutralZone_B);
        TeleopNeutralZoneB.setTag("#D7D7D7D5");


        final EditText EndOtherTextTXT = (EditText) findViewById(R.id.end_otherText_TB);
        //Defines all RadioButtons for Algae
        final RadioButton AutoHangYesRB = (RadioButton) findViewById(R.id.autoHangYes_RB);
        final RadioButton AutoHangNoRB = (RadioButton) findViewById(R.id.autoHangNo_RB);



        //Changes color of buttons and sets variable to true if clicked
        //Resets to default if clicked again
        TeleopDepotB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colorCode = (String) TeleopDepotB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleopDepotB.setBackgroundColor(ContextCompat.getColor(TeleopDepotB.getContext(), R.color.colorPrimary));
                    TeleopDepotB.setTag("#FFE600");
                    TeleopDepot = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    TeleopDepotB.setBackgroundColor(ContextCompat.getColor(TeleopDepotB.getContext(), R.color.grey_button));
                    TeleopDepotB.setTag("D7D7D7D5");
                    TeleopDepot = "false";
                }

            }

        });
        TeleopOutpostB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colorCode = (String) TeleopOutpostB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleopOutpostB.setBackgroundColor(ContextCompat.getColor(TeleopOutpostB.getContext(), R.color.colorPrimary));
                    TeleopOutpostB.setTag("#FFE600");
                    TeleopOutpost = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    TeleopOutpostB.setBackgroundColor(ContextCompat.getColor(TeleopOutpostB.getContext(), R.color.grey_button));
                    TeleopOutpostB.setTag("D7D7D7D5");
                    TeleopOutpost = "false";
                }

            }

        });
        TeleopNeutralZoneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colorCode = (String) TeleopNeutralZoneB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    TeleopNeutralZoneB.setBackgroundColor(ContextCompat.getColor(TeleopNeutralZoneB.getContext(), R.color.colorPrimary));
                    TeleopNeutralZoneB.setTag("#FFE600");
                    TeleopNeutralZone = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    TeleopNeutralZoneB.setBackgroundColor(ContextCompat.getColor(TeleopNeutralZoneB.getContext(), R.color.grey_button));
                    TeleopNeutralZoneB.setTag("D7D7D7D5");
                    TeleopNeutralZone = "false";
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

                //Sets variables to true if checked
                if (AutoHangYesRB.isChecked()) {
                    AutoHangYes = "True";
                }
                else
                    AutoHangYes = "False";


                if (AutoHangNoRB.isChecked()) {
                    AutoHangNo = "True";
                }


                if (TeleopFuelCapacityTXT.getText().toString().isEmpty()) {
                    Toast.makeText(data_Collection_sandstorm.this, "Cannot Continue. Please Enter a Fuel Capacity!", Toast.LENGTH_LONG).show();
                }
                else {
                    TeleopFuelCapacity = Integer.parseInt(TeleopFuelCapacityTXT.getText().toString());

                    Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                    startActivity(startintent);
                }
            }
        });

    }

};
