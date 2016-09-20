package tw.org.iii.asynctest;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {
private TextView masg;
    private MyTask mt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void test1(View v){
        mt1 = new MyTask();
        mt1.execute("SHOA","TONY","DK","GX","ERIC");
    }
    public void test2(View v){
    if(mt1 != null && mt1.isCancelled()){
        mt1.cancel(true);
    }
    }

    private class MyTask extends AsyncTask<String ,Void,Void>{


        @Override
        protected Void doInBackground(String... params) {

            Log.d("DK","doInBackground");

            for(String name: params){
                Log.d("DK","HI,"+ name);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ee){

                }
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d("DK","doInBackground");
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d("DK","doInBackground");
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.d("DK","doInBackground");
        }

        @Override
        protected void onCancelled(Void aVoid) {
            super.onCancelled(aVoid);
            Log.d("DK","doInBackground");
        }
    }
}
