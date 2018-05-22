package xyz.digitaltools.learnasynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;

public class DownloaderDemo extends AsyncTask<Void,Integer,Integer> {
    Context context;
    ProgressBar progressBar;

    public DownloaderDemo(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }
}
