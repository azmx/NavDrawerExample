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

public class MinumanKhas extends Fragment implements ListAdapter.ItemClickListener {

  RecyclerView rviewListMinum;
    List<model> listdataMinum;
    ListAdapter adapter;
    public MinumanKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewListMinum = view.findViewById(R.id.rvList);
        listdataMinum = new ArrayList<>();


        model wedang = new model();
        wedang.setName("Wedang Uwuh");
        wedang.setDesc("");
        wedang.setImage(R.drawable.wedang_uwuh);
        listdataMinum.add(wedang);

        model bajigur = new model();
        bajigur.setName("Bajigur");
        bajigur.setDesc("");
        bajigur.setImage(R.drawable.bajigur);
        listdataMinum.add(bajigur);

        model ronde = new model();
        ronde.setName("Ronde");
        ronde.setDesc("");
        ronde.setImage(R.drawable.ronde);
        listdataMinum.add(ronde);

        model kopi = new model();
        kopi.setName("Kopi Josss");
        kopi.setDesc("");
        kopi.setImage(R.drawable.kopi);
        listdataMinum.add(kopi);

        model rujak = new model();
        rujak.setName("Rujak Es Krim");
        rujak.setDesc("");
        rujak.setImage(R.drawable.rujak);
        listdataMinum.add(rujak);

        rviewListMinum.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdataMinum, getContext());
        rviewListMinum.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    public void onItemClick(View view, int position) {

    }
}
