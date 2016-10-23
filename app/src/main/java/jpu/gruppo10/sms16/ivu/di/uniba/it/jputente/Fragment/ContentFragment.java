package jpu.gruppo10.sms16.ivu.di.uniba.it.jputente.Fragment;

/**
 * Created by Utente on 23/10/2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jpu.gruppo10.sms16.ivu.di.uniba.it.jputente.R;

/**
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_fragment,container,false);
        return v;
    }
}
