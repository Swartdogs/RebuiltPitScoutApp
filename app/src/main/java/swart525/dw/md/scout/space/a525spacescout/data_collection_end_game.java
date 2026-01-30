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
    public static String EndSwerve = "False";
    public static String EndTank = "False";
    public static String EndOther = "False";
    public static String EndOtherText = "NA";
    public static String EndTrenchYes = "False";
    public static String EndTrenchNo = "False";
    public static String EndBumpYes = "False";
    public static String EndBumpNo = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton EndSwerveRB = (RadioButton) findViewById(R.id.end_Swerve_RB);
        final RadioButton EndTankRB = (RadioButton) findViewById(R.id.end_Tank_RB);
        final RadioButton EndOtherRB = (RadioButton) findViewById(R.id.end_OtherBase_RB);

        final EditText EndOtherTextTXT = (EditText) findViewById(R.id.end_otherText_TB);


        final RadioButton EndTrenchNoRB = (RadioButton) findViewById(R.id.other_TrenchQuestionNo_RB);
        final RadioButton EndTrenchYesRB = (RadioButton) findViewById(R.id.other_TrenchQuestionYes_RB);
        final RadioButton EndBumpYesRB = (RadioButton) findViewById(R.id.other_BumpQuestionYes_RB);
        final RadioButton EndBumpNoRB = (RadioButton) findViewById(R.id.other_BumpQuestionNo_RB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (EndSwerveRB.isChecked()){
                    EndSwerve = "True";
                }
                if (EndTankRB.isChecked()) {
                    EndTank = "True";
                }
                if (EndTrenchYesRB.isChecked()) {
                    EndTrenchYes = "True";
                }
                if (EndTrenchNoRB.isChecked()) {
                    EndTrenchNo = "True";
                }
                if (EndBumpYesRB.isChecked()){
                    EndBumpYes = "True";
                }
                if (EndBumpNoRB.isChecked()){
                    EndBumpNo = "True";
                }
                if (EndOtherRB.isChecked()) {
                    EndOther = "True";
                    if (EndOtherTextTXT.getText().toString().isEmpty()) {
                        Toast.makeText(data_collection_end_game.this, "Cannot Continue. Please Enter drive base type!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        EndOtherText = (EndOtherTextTXT.getText().toString());
                        Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                        startActivity(startintent);
                    }
                }
                else if (EndSwerve.equals("True") || EndTank.equals("True")){
                    Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                    startActivity(startintent);
                }
                else {
                    Toast.makeText(data_collection_end_game.this, "Cannot Continue. Please Select Drive Base Type!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

