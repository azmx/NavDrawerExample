package com.example.navdrawerexample.fragments;
// HomeFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;
import com.example.navdrawerexample.ListAdapter;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment implements ListAdapter.ItemClickListener {

    RecyclerView rviewList;
    List<model> listdatamakan;
    ListAdapter adapter;

    public MakananKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewList = view.findViewById(R.id.rvList2);
        listdatamakan = new ArrayList<>();


        model gudeg = new model();
        gudeg.setName("Gudeg");
        gudeg.setDesc("Gudeg terbuat dari nangka muda");
        gudeg.setImage(R.drawable.gudeg);
        listdatamakan.add(gudeg);

        model bakpia = new model();
        bakpia.setName("Bakpia");
        bakpia.setDesc("Bakpia pathok kue berbentuk bulat pipih,");
        bakpia.setImage(R.drawable.bakpia);
        listdatamakan.add(bakpia);

        model kipo = new model();
        kipo.setName("Kipo");
        kipo.setDesc("Kue kipo adalah kue berwarna hijau");
        kipo.setImage(R.drawable.kipo);
        listdatamakan.add(kipo);

        model mie = new model();
        mie.setName("Mie Lethek");
        mie.setDesc("Olahan Mie yang pengolahan nya yang masih tradisional dengan menggunakan bantuan sapi ");
        mie.setImage(R.drawable.mie);
        listdatamakan.add(mie);

        model brongkos = new model();
        brongkos.setName("Brongkos");
        brongkos.setDesc("Brongkos adalah sejenis makanan daging dan kacang berkuah bumbu keluak");
        brongkos.setImage(R.drawable.brongkos);
        listdatamakan.add(brongkos);

        model tiwul = new model();
        tiwul.setName("Tiwul");
        tiwul.setDesc("Thiwul , dapat dimakan bersama kelapa parut yang telah diberi garam sedikit");
        tiwul.setImage(R.drawable.tiwul);
        listdatamakan.add(tiwul);

        model gatot = new model();
        gatot.setName("Gatot");
        gatot.setDesc("Gatot adalah penganan kukus, dimakan dengan parutan kelapa.");
        gatot.setImage(R.drawable.gatot);
        listdatamakan.add(gatot);

        model sate = new model();
        sate.setName("Sate Klatak");
        sate.setDesc("kegiatan membakar sate di pembakaran terbuka disebut \"klathak\". ");
        sate.setImage(R.drawable.sate);
        listdatamakan.add(sate);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdatamakan, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onItemClick(View view, int position) {
    }
}
