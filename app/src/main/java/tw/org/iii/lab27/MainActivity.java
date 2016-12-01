package tw.org.iii.lab27;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tram;
    private F1 f1;
    private F2 f2;
    private boolean isF2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = F1.newInstance();
        f2 = new F2();

        fmgr = getFragmentManager();
        tram = fmgr.beginTransaction();
        tram.add(R.id.container, f1);
        tram.commit();
    }
    public void change(View v){
        isF2 = !isF2;
        tram = fmgr.beginTransaction();
        tram.replace(R.id.container, isF2?f2:f1);
        tram.addToBackStack(null);
        tram.commit();
    }
}
