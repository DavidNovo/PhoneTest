package novogrodsky.phonetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
    // represents an intent, the intent of the app to do something
    public static final String EXTRA_MESSAGE = "novogrodsky.phonetest.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button **/
    /** to make as method compatible with the android:onClick attribute the following must be true
     * the mthod has public access
     * the method returns a void value
     * a view is the only parameter
     * @param view
     */
    public void SendMessage(View view) {
        // do something in response to button
        // create an intent
        // an intent is an object that provides runtime binding between components
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();
        // add the message to the intent, key value format
        intent.putExtra(EXTRA_MESSAGE, message);

        // starts an instance of the DisplayMessageActivity specified by the intent
        startActivity(intent);
    }


}
