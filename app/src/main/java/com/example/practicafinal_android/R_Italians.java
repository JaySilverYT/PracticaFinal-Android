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
 * Use the {@link R_Italians#newInstance} factory method to
 * create an instance of this fragment.
 */
public class R_Italians extends Fragment {

    ImageView r1_Phone,r1_Link,r1_Ubi, r2_Phone,r2_Link,r2_Ubi, r3_Phone,r3_Link,r3_Ubi;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public R_Italians() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment R_Italians.
     */
    // TODO: Rename and change types and number of parameters
    public static R_Italians newInstance(String param1, String param2) {
        R_Italians fragment = new R_Italians();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_r__italians, container, false);

        //Restaurant Italia 1
        r1_Phone = v.findViewById(R.id.R1_phone);
        r1_Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34938604899"));
                startActivity(intent4);
            }
        });


        r1_Link = v.findViewById(R.id.R1_Link);
        r1_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.latagliatella.es/restaurantes/barcelona/granollers?utm_source=gmb&utm_medium=organic&utm_campaign=gmb&utm_content=sitio_web"));
                startActivity(intent4);
            }
        });

        r1_Ubi = v.findViewById(R.id.R1_Ubicacion);
        r1_Ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/zvuWs3jdxPJG3EH7A"));
                startActivity(intent4);
            }
        });

        //Restaurant Italia 2
        r2_Phone = v.findViewById(R.id.R2_phone);
        r2_Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34931296346"));
                startActivity(intent4);
            }
        });


        r2_Link = v.findViewById(R.id.R2_Link);
        r2_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.ubereats.com/es/barcelona/food-delivery/el-italiano/9Jy-zenzST2WE4p-qaSYlA"));
                startActivity(intent4);
            }
        });

        r2_Ubi = v.findViewById(R.id.R2_Ubicacion);
        r2_Ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/wqyPjeF8FFto1G659")); //No fico el geo pq no surt la xinxeta
                startActivity(intent4);
            }
        });

        //Restaurant Italia 3
        r3_Phone = v.findViewById(R.id.R3_phone);
        r3_Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34938703847"));
                startActivity(intent4);
            }
        });


        r3_Link = v.findViewById(R.id.R3_Link);
        r3_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.lamagranarestaurant.com/es/")); //No te pagina web propia
                startActivity(intent4);
            }
        });

        r3_Ubi = v.findViewById(R.id.R3_Ubicacion);
        r3_Ubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/2yiAMcaHiScREz3n9"));
                startActivity(intent4);
            }
        });

        return v;
    }
}