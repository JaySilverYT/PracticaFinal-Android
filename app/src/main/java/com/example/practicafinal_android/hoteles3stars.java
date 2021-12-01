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
 * Use the {@link hoteles3stars#newInstance} factory method to
 * create an instance of this fragment.
 */
public class hoteles3stars extends Fragment {
    ImageView tlf1,ubi1,web1,tlf2,web2,ubi2,tlf3,web3,ubi3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public hoteles3stars() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment hoteles3stars.
     */
    // TODO: Rename and change types and number of parameters
    public static hoteles3stars newInstance(String param1, String param2) {
        hoteles3stars fragment = new hoteles3stars();
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
        View v = inflater.inflate(R.layout.fragment_hoteles3stars, container, false);
        tlf1 = v.findViewById(R.id.Hostalin_telf);
        tlf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615859632"));
                startActivity(intent4);
            }
        });
        web1 = v.findViewById(R.id.Hostalin_ubi);
        web1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.hostalin.com/"));
                startActivity(intent4);
            }
        });

        ubi1 = v.findViewById(R.id.Hostalin_ubi);
        ubi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/41.6514048,2.2151168/hotel+hostalin+ubicacion/@41.5221292,2.0867598,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x12a49861d9a3a9d1:0x78ad5e8d855c9332!2m2!1d2.1732204!2d41.3935051"));
                startActivity(intent4);
            }
        });
        tlf2 = v.findViewById(R.id.Condal_phone);
        tlf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615789087"));
                startActivity(intent4);
            }
        });
        web2 = v.findViewById(R.id.Condal_link);
        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.bypillow.com/alojamientos/girona/condal-by-pillow/"));
                startActivity(intent4);
            }
        });
        ubi2 = v.findViewById(R.id.Condal_ubi);
        ubi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/SAUB%C3%8D+-+Aplicacions+Industrials/@41.941867,2.7769888,17z/data=!3m1!4b1!4m5!3m4!1s0x12bae09fb2e7956d:0x66c6ebd23ddedf7f!8m2!3d41.941867!4d2.7791775")); //No fico el geo pq no surt la xinxeta
                startActivity(intent4);
            }
        });
        tlf3 = v.findViewById(R.id.may_tlf);
        tlf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34615678765"));
                startActivity(intent4);
            }
        });
        web3 = v.findViewById(R.id.may_Link);
        web3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("http://mayramblas.com/"));
                startActivity(intent4);
            }
        });
        ubi3 = v.findViewById(R.id.may_ubi);
        ubi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//hotel+may+ramblas/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x12a4a2f7ebd5f453:0x8ad779628de1fd05?sa=X&ved=2ahUKEwj5l6Tl6MD0AhUF5OAKHX8dC5cQ9Rd6BAg1EAQ"));
                startActivity(intent4);
            }
        });
        return v;
    }
}