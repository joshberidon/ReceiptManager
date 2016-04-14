package joshberidon.com.receiptmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button cameraButton;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    cameraButton = (Button) findViewById(R.id.camera_button);
    cameraButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        //When button is pressed
        cameraButton.setText("Button pressed");
      }
    });

  }
}
