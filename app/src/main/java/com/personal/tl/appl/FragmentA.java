package com.personal.tl.appl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.QuickContactBadge;


public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        Button btn_a_fragment_a = v.findViewById(R.id.btn_a_fragment_a);

        btn_a_fragment_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //4. Mandar info al otro lado
                if(listener !=null){

                }
            }
        });

        return v;
    }

    //1. Interface
    public interface FragmentAActions{
        void onMessage(String me);
    }
    //2. Crear objeto
    FragmentAActions listener;

    //3. Crear metodo set para el listener
    public void setListener(FragmentAActions listener){
        this.listener=listener;
    }

}
