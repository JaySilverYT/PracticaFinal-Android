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
 * Use the {@link hotels5stars#newInstance} factory method to
 * create an instance of this fragment.
 */
public class hotels5stars extends Fragment {
    ImageView tlf1,ubi1,web1,tlf2,web2,ubi2,tlf3,web3,ubi3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public hotels5stars() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment hotels5stars.
     */
    // TODO: Rename and change types and number of parameters
    public static hotels5stars newInstance(String param1, String param2) {
        hotels5stars fragment = new hotels5stars();
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
        View v = inflater.inflate(R.layout.fragment_hotels5stars, container, false);
        tlf1 = v.findViewById(R.id.w_telf);
        tlf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615859632"));
                startActivity(intent4);
            }
        });
        web1 = v.findViewById(R.id.w_link);
        web1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.marriott.com/hotels/travel/bcnwh-w-barcelona/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_Mjc4MjIxOC03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D"));
                startActivity(intent4);
            }
        });
        ubi1 = v.findViewById(R.id.w_ubi);
        ubi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.6514048,2.2151168/W+Barcelona,+Pla%C3%A7a+Rosa+Del+Vents+1,+Final,+Passeig+de+Joan+de+Borb%C3%B3,+08039+Barcelona/@41.5101404,2.0802349,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a4a3b185625025:0x59e80c780f7e2f0b!2m2!1d2.1901534!2d41.368437"));
                startActivity(intent4);
            }
        });
        tlf2 = v.findViewById(R.id.arts_tlf);
        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615789087"));
                startActivity(intent4);
            }
        });
        web2 = v.findViewById(R.id.arts_link);
        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.ritzcarlton.com/en/hotels/spain/barcelona?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_MjY1Mjk4OS03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D"));
                startActivity(intent4);
            }
        });
        ubi2 = v.findViewById(R.id.arts_ubi);
        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//hotel+arts/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x12a4a30f13665d1b:0xff3ebc6ba79f4055?sa=X&ved=2ahUKEwjWlrGZiMP0AhXK7eAKHeE3CggQ9Rd6BAhlEAQ"));
                startActivity(intent4);
            }
        });
        tlf3 = v.findViewById(R.id.mandarin_tlf);
        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615678765"));
                startActivity(intent4);
            }
        });
        web3 = v.findViewById(R.id.mandarin_link);
        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.mandarinoriental.com/barcelona/passeig-de-gracia/luxury-hotel?htl=MOBCN&kw=MOBCN&eng=google&src=local"));
                startActivity(intent4);
            }
        });
        ubi3 = v.findViewById(R.id.mandarin_ubi);
        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//hotel+mandarin/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x12a4a2ed7da630eb:0x47e4bb70c43fdb80?sa=X&ved=2ahUKEwiWvpzeiMP0AhW86uAKHUasC_gQ9Rd6BAhYEAQ"));
                startActivity(intent4);
            }
        });
        return v;
    }
}