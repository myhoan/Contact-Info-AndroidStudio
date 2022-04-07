package uit.lab2.bt4_18520771;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewContactActivity extends AppCompatActivity {

    TextView name, email, project;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        name =(TextView)findViewById(R.id.txtNameValue);
        email =(TextView)findViewById(R.id.txtEmailValue);
        project = (TextView)findViewById(R.id.txtProjectValue);

        finish = (Button) findViewById(R.id.btnFinish);
        finish.setOnClickListener(mClickFinishListener);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("nameKey");
        String useremail = bundle.getString("emailKey");
        String userproject = bundle.getString("projectKey");

        name.setText(username);
        email.setText(useremail);
        project.setText(userproject);
    }

    private final View.OnClickListener mClickFinishListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
