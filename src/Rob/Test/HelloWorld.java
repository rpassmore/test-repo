package Rob.Test;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class HelloWorld extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);
        
        //add a line
    }
}