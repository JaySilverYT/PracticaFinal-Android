package com.example.practicafinal_android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Hotels4stars#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hotels4stars extends Fragment {
    ImageView tlf1,ubi1,web1,tlf2,web2,ubi2,tlf3,web3,ubi3;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Hotels4stars() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hotels4stars.
     */
    // TODO: Rename and change types and number of parameters
    public static Hotels4stars newInstance(String param1, String param2) {
        Hotels4stars fragment = new Hotels4stars();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hotels4stars, container, false);
        tlf1 = v.findViewById(R.id.iris_telf);
        tlf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615859632"));
                startActivity(intent4);
            }
        });
        web1 = v.findViewById(R.id.iris_link);
        web1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.hoteliris.com/"));
                startActivity(intent4);
            }
        });

        ubi1 = v.findViewById(R.id.iris_ubi);
        ubi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//hotel+iris/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x12a4c7c300cc5e29:0xcad679937542c049?sa=X&ved=2ahUKEwjlv5LUhMP0AhUIQBoKHQU_AskQ9Rd6BAhUEAQ"));
                startActivity(intent4);
            }
        });
        tlf2 = v.findViewById(R.id.zero_phone);
        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615789087"));
                startActivity(intent4);
            }
        });
        web2 = v.findViewById(R.id.zero_link);
        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.hoteldiagonalzero.com/es/?utm_source=google&utm_medium=organic&utm_campaign=local-gmb"));
                startActivity(intent4);
            }
        });
        ubi2 = v.findViewById(R.id.zero_ubi);
        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.6514048,2.2151168/diagonal+zero+hotel/@41.5296857,2.0802349,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4a35724e646ef:0x913021efa7d6c103!2m2!1d2.2196731!2d41.4121667")); //No fico el geo pq no surt la xinxeta
                startActivity(intent4);
            }
        });
        tlf3 = v.findViewById(R.id.madison_tlf);
        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615678765"));
                startActivity(intent4);
            }
        });
        web3 = v.findViewById(R.id.madison_Link);
        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.marriott.com/hotels/travel/bcndl-ac-hotel-diagonal-l%C2%B4illa/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_NDIyOTIwMS03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D"));
                startActivity(intent4);
            }
        });
        ubi3 = v.findViewById(R.id.madison_ubi);
        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.marriott.com/hotels/travel/bcndl-ac-hotel-diagonal-l%C2%B4illa/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_NDIyOTIwMS03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D"));
                startActivity(intent4);
            }
        });
        return v;
    }
}