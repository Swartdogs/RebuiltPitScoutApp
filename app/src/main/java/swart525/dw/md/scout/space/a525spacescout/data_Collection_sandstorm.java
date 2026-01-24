package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for data collection
    public static String CoralReefL1 = "False";
    public static String CoralReefL2 = "False";
    public static String CoralReefL3 = "False";
    public static String CoralReefL4 = "False";
    public static String CoralPickupGround = "False";
    public static String CoralPickupStation = "False";
    public static String AlgaePickupGround = "False";
    public static String AlgaePickupReef = "False";
    public static String AlgaePlaceProcessor = "False";
    public static String AlgaePlaceNet = "False";
    public static String AlgaeKnockYes = "False";
    public static String AlgaeKnockNo = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all CheckBoxes for reef
        final CheckBox CoralReefL1CB = (CheckBox) findViewById(R.id.teleopCoralReachL1_CB);
        final CheckBox CoralReefL2CB = (CheckBox) findViewById(R.id.teleopCoralReachL2_CB);
        final CheckBox CoralReefL3CB = (CheckBox) findViewById(R.id.teleopCoralReachL3_CB);
        final CheckBox CoralReefL4CB = (CheckBox) findViewById(R.id.teleopCoralReachL4_CB);

        //Defines all Buttons for Coral pickup
        final Button CoralPickupGroundB = (Button) findViewById(R.id.coralGround_B);
        CoralPickupGroundB.setTag("D7D7D7D5");
        final Button CoralPickupStationB = (Button) findViewById(R.id.coralStation_B);
        CoralPickupStationB.setTag("#D7D7D7D5");
        final Button AlgaePickupGroundB = (Button) findViewById(R.id.algaeGround_B);
        AlgaePickupGroundB.setTag("#D7D7D7D5");
        final Button AlgaePickupReefB = (Button) findViewById(R.id.algaeReef_B);
        AlgaePickupReefB.setTag("D7D7D7D5");
        final Button AlgaePlaceProcessorB = (Button) findViewById(R.id.algaeProcessor_B);
        AlgaePlaceProcessorB.setTag("#D7D7D7D5");
        final Button AlgaePlaceNetB = (Button) findViewById(R.id.algaeNet_B);
        AlgaePlaceNetB.setTag("D7D7D7D5");


        //Defines all RadioButtons for Algae
        final RadioButton AlgaeKnockYesRB = (RadioButton) findViewById(R.id.teleopKnockOffYes_RB);
        final RadioButton AlgaeKnockNoRB = (RadioButton) findViewById(R.id.teleopKnockOffNo_RB);



        //Changes color of buttons and sets variable to true if clicked
        //Resets to default if clicked again
        CoralPickupGroundB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colorCode = (String) CoralPickupGroundB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    CoralPickupGroundB.setBackgroundColor(ContextCompat.getColor(CoralPickupGroundB.getContext(), R.color.colorPrimary));
                    CoralPickupGroundB.setTag("#FFE600");
                    CoralPickupGround = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    CoralPickupGroundB.setBackgroundColor(ContextCompat.getColor(CoralPickupGroundB.getContext(), R.color.grey_button));
                    CoralPickupGroundB.setTag("D7D7D7D5");
                    CoralPickupGround = "false";
                }

            }

        });
        CoralPickupStationB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) CoralPickupStationB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    CoralPickupStationB.setBackgroundColor(ContextCompat.getColor(CoralPickupStationB.getContext(), R.color.colorPrimary));
                    CoralPickupStationB.setTag("#FFE600");
                    CoralPickupStation = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    CoralPickupStationB.setBackgroundColor(ContextCompat.getColor(CoralPickupStationB.getContext(), R.color.grey_button));
                    CoralPickupStationB.setTag("D7D7D7D5");
                    CoralPickupStation = "false";
                }


            }

        });
        AlgaePickupGroundB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) AlgaePickupGroundB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    AlgaePickupGroundB.setBackgroundColor(ContextCompat.getColor(AlgaePickupGroundB.getContext(), R.color.colorPrimary));
                    AlgaePickupGroundB.setTag("#FFE600");
                    AlgaePickupGround = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    AlgaePickupGroundB.setBackgroundColor(ContextCompat.getColor(AlgaePickupGroundB.getContext(), R.color.grey_button));
                    AlgaePickupGroundB.setTag("D7D7D7D5");
                    AlgaePickupGround = "false";
                }

            }

        });
        AlgaePickupReefB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) AlgaePickupReefB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    AlgaePickupReefB.setBackgroundColor(ContextCompat.getColor(AlgaePickupReefB.getContext(), R.color.colorPrimary));
                    AlgaePickupReefB.setTag("#FFE600");
                    AlgaePickupReef = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    AlgaePickupReefB.setBackgroundColor(ContextCompat.getColor(AlgaePickupReefB.getContext(), R.color.grey_button));
                    AlgaePickupReefB.setTag("D7D7D7D5");
                    AlgaePickupReef = "false";
                }

            }

        });
        AlgaePlaceNetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) AlgaePlaceNetB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    AlgaePlaceNetB.setBackgroundColor(ContextCompat.getColor(AlgaePlaceNetB.getContext(), R.color.colorPrimary));
                    AlgaePlaceNetB.setTag("#FFE600");
                    AlgaePlaceNet = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    AlgaePlaceNetB.setBackgroundColor(ContextCompat.getColor(AlgaePlaceNetB.getContext(), R.color.grey_button));
                    AlgaePlaceNetB.setTag("D7D7D7D5");
                    AlgaePlaceNet = "false";
                }

            }

        });
        AlgaePlaceProcessorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) AlgaePlaceProcessorB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    AlgaePlaceProcessorB.setBackgroundColor(ContextCompat.getColor(AlgaePlaceProcessorB.getContext(), R.color.colorPrimary));
                    AlgaePlaceProcessorB.setTag("#FFE600");
                    AlgaePlaceProcessor = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    AlgaePlaceProcessorB.setBackgroundColor(ContextCompat.getColor(AlgaePlaceProcessorB.getContext(), R.color.grey_button));
                    AlgaePlaceProcessorB.setTag("D7D7D7D5");
                    AlgaePlaceProcessor = "false";
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
                if (CoralReefL1CB.isChecked()) {
                    CoralReefL1 = "True";
                }
                if (CoralReefL2CB.isChecked()) {
                    CoralReefL2 = "True";
                }
                if (CoralReefL3CB.isChecked()) {
                    CoralReefL3 = "True";
                }
                if (CoralReefL4CB.isChecked()) {
                    CoralReefL4 = "True";
                }

                if (AlgaeKnockYesRB.isChecked()) {
                    AlgaeKnockYes = "True";
                }
                if (AlgaeKnockNoRB.isChecked()) {
                    AlgaeKnockNo = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

};
