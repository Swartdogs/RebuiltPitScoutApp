package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Save_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save__page);

        //Defines Buttons
        Button Submit_Data = (Button) findViewById(R.id.Submit_To_Store_B);
        Button Delete_Data = (Button) findViewById(R.id.Delete_Data_B);




        //Takes you to the page in order to delete the data and confirm the decision
        Delete_Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Delete_Data.class);
                startActivity(startintent);
            }
        });
        //Goes to Submit page and submits data
        Submit_Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Actual_Submit.class);
                startActivity(startintent);
            }
        });


        //----------------------------------------------------------------------------------------------------------------

    }
}

