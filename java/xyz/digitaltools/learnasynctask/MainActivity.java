package xyz.digitaltools.learnasynctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBarID);
        textView = (TextView) findViewById(R.id.textID);
    }

    public void cl(View view) {
        new Sagor().execute();
    }

    public void ld(View view) {
        MyClass myClass = new MyClass(MainActivity.this);
        myClass.execute(1000L);
    }

    public class Sagor extends AsyncTask<Void, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setMax(50);
        }

        @Override
        protected Integer doInBackground(Void... voids) {

            for (int i = 0; i <= 50; i++) {
                publishProgress(1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
            textView.setText(String.valueOf(values[0]));

        }
    }


}
