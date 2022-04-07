package uit.lab2.bt4_18520771;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,project;
    Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.txtName);
        email = findViewById(R.id.txtEmail);
        project = findViewById(R.id.txtProject);
        btnView = findViewById(R.id.btnView);

        btnView.setOnClickListener((View view) -> {
            Intent iGetContactInfo = new Intent(MainActivity.this, ViewContactActivity.class);
            Bundle bundle = new Bundle();

            bundle.putString("nameKey", name.getText().toString());
            bundle.putString("emailKey", email.getText().toString());
            bundle.putString("projectKey", project.getText().toString());
            iGetContactInfo.putExtras(bundle);

            startActivity(iGetContactInfo);
        });
    }

}