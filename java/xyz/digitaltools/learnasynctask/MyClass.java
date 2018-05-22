package xyz.digitaltools.learnasynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MyClass extends AsyncTask<Long,Void,Void> {
    Context c;
    TextView textView;

    public MyClass(Context c2) {
        this.c = c2;
        textView = (TextView) c2
    }

    ProgressDialog progressDialog;


    @Override
    protected Void doInBackground(Long... longs) {

        try {
            Thread.sleep(longs[0]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
       progressDialog = ProgressDialog.show(c,"","");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        progressDialog.dismiss();
    }
}
