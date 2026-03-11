package swart525.dw.md.scout.space.a525spacescout;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables
    public static int EndFuelShot = 0;

    public static String EndTurretYes = "False";
    public static String EndTurretNo = "False";
    public static String EndMoveYes = "False";
    public static String EndMoveNo = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements


        final RadioButton EndTurretNoRB = (RadioButton) findViewById(R.id.other_TurretQuestionNo_RB);
        final RadioButton EndTurretYesRB = (RadioButton) findViewById(R.id.other_TurretQuestionYes_RB);
        final RadioButton EndMoveYesRB = (RadioButton) findViewById(R.id.other_ShootQuestionYes_RB);
        final RadioButton EndMoveNoRB = (RadioButton) findViewById(R.id.other_ShootQuestionNo_RB);

        final EditText EndFuelShotTXT = (EditText) findViewById(R.id.end_otherText_TB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (EndTurretNoRB.isChecked()) {
                    EndTurretNo = "True";
                }
                if (EndTurretYesRB.isChecked()) {
                    EndTurretYes = "True";
                }
                if (EndMoveYesRB.isChecked()){
                    EndMoveYes = "True";
                }
                if (EndMoveNoRB.isChecked()){
                    EndMoveNo = "True";
                }

                EndFuelShot = Integer.parseInt(EndFuelShotTXT.getText().toString());

                        Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                        startActivity(startintent);

            }
        });
    }
}

