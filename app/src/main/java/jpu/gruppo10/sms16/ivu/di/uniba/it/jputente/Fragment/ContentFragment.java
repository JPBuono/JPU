package jpu.gruppo10.sms16.ivu.di.uniba.it.jputente.Fragment;

/**
 * Created by Utente on 23/10/2016.
 */
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import jpu.gruppo10.sms16.ivu.di.uniba.it.jputente.R;

/**
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment extends ListFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // colleghiamo la classe attuale ContentFragment all'xml listapizzerie_fragment che contiene a sua volta una semplice ListView
        View v = inflater.inflate(R.layout.listapizzerie_fragment,container,false);

        String[] datasource={"English","French","Khmer","Japanese","Russian","Chinese","English","French","Khmer","Japanese","Russian","Chinese","English","French","Khmer","Japanese","Russian","Chinese","English","French","Khmer","Japanese","Russian","Chinese","English","French","Khmer","Japanese","Russian","Chinese"};
        // Create ArrayAdapter object to wrap the data source
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),R.layout.row_layout,R.id.txtitem,datasource);
        // Bind adapter to the ListFragment
        setListAdapter(adapter);
        //  Retain the ListFragment instance across Activity re-creation
        setRetainInstance(true);
        return v;
    }

    // Handle Item click event
    public void onListItemClick(ListView l, View view, int position, long id){
        ViewGroup viewg=(ViewGroup)view;
        TextView tv=(TextView)viewg.findViewById(R.id.txtitem);
        Toast.makeText(getActivity(), tv.getText().toString(), Toast.LENGTH_LONG).show();

    }

}




/* fragment ale
        PizzerieListFragment pizzerieFragment = (PizzerieListFragment)getSupportFragmentManager().findFragmentByTag("pizzerieFragment");
        if(pizzerieFragment==null){
            pizzerieFragment=new PizzerieListFragment();
            android.support.v4.app.FragmentTransaction transact=getSupportFragmentManager().beginTransaction();
            transact.add(android.R.id.content,pizzerieFragment,"lstfragment");
            transact.commit();

        }*/