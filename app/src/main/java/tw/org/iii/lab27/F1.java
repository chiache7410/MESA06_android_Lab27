package tw.org.iii.lab27;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F1 extends Fragment {
    public static F1 newInstance() {
        F1 fragment = new F1();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f1, container, false);
        View btn = view.findViewById(R.id.f1btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doBtn();
            }
        });
        return view;
    }
    private void doBtn(){
        Log.v("brad", "F1 Button");
    }
}
