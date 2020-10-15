package hospitalMS.Patient.View_Report;

import android.os.Bundle;
import android.widget.TextView;

import hospitalMS.R;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Neeraj on 08-Apr-16.
 */
public class Final_View_Report extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_view_report);

        Bundle bb = getIntent().getExtras();
        String report = bb.getString("report");
        TextView final_report = (TextView) findViewById(R.id.tv_report);
        final_report.setText(report);

    }

}
