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

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection
    public static String EndSwerve = "False";
    public static String EndTank = "False";
    public static String EndOther = "False";
    public static String EndOtherText = "NA";

    public static int EndWeight = 0;
    public static String EndTrench = "False";
    public static String EndBump = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        final RadioButton EndSwerveRB = (RadioButton) findViewById(R.id.end_Swerve_RB);
        final RadioButton EndTankRB = (RadioButton) findViewById(R.id.end_Tank_RB);
        final RadioButton EndOtherRB = (RadioButton) findViewById(R.id.end_OtherBase_RB);

        final EditText EndOtherTextTXT = (EditText) findViewById(R.id.robot_Other_TB);
        final EditText EndWeightTXT = (EditText) findViewById(R.id.robot_weight_TB);


        final Button EndTrenchB = (Button) findViewById(R.id.end_Trench_B);
        final Button EndBumpB = (Button) findViewById(R.id.end_Bump_B);


        final Button To_EndGame = (Button) findViewById(R.id.To_Engame_B);

        EndTrenchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) EndTrenchB.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    EndTrenchB.setBackgroundColor(ContextCompat.getColor(EndTrenchB.getContext(), R.color.colorPrimary));
                    EndTrenchB.setTag("#FFE600");
                    EndTrench = "true";
                } else if ("#FFE600".equals(colorCode)) {
                    EndTrenchB.setBackgroundColor(ContextCompat.getColor(EndTrenchB.getContext(), R.color.grey_button));
                    EndTrenchB.setTag("D7D7D7D5");
                    EndTrench = "false";
                }
            }
        });

        EndBumpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) EndBumpB.getTag();
                if (!"#FFE600".equals(colorCode)) {
                    EndBumpB.setBackgroundColor(ContextCompat.getColor(EndBumpB.getContext(), R.color.colorPrimary));
                    EndBumpB.setTag("#FFE600");
                    EndBump = "true";
                } else if ("#FFE600".equals(colorCode)) {
                    EndBumpB.setBackgroundColor(ContextCompat.getColor(EndBumpB.getContext(), R.color.grey_button));
                    EndBumpB.setTag("D7D7D7D5");
                    EndBump = "false";
                }
            }
        });

        //Creates OnClick Listener for next page button
            To_EndGame.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    if (EndWeightTXT.getText().toString().isEmpty()) {
                        Toast.makeText(data_collection_TeleOP.this, "Cannot Continue. Please Enter robot weight!", Toast.LENGTH_LONG).show();
                    } else {
                        EndWeight = Integer.parseInt(EndWeightTXT.getText().toString());


                        if (EndSwerveRB.isChecked()) {
                            EndSwerve = "True";
                        }
                        if (EndTankRB.isChecked()) {
                            EndTank = "True";
                        }

                        if (EndOtherRB.isChecked()) {
                            EndOther = "True";
                            if (EndOtherTextTXT.getText().toString().isEmpty()) {
                                Toast.makeText(data_collection_TeleOP.this, "Cannot Continue. Please Enter drive base type!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                EndOtherText = (EndOtherTextTXT.getText().toString());
                                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                                startActivity(startintent);
                            }
                        }
                        else if (EndSwerve.equals("True") || EndTank.equals("True")){
                            Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                            startActivity(startintent);
                        }
                        else {
                            Toast.makeText(data_collection_TeleOP.this, "Cannot Continue. Please Select Drive Base Type!", Toast.LENGTH_LONG).show();
                        }
                    }
                }

        });

    }};

//    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
//    startActivity(startintent);