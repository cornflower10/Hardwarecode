package com.lixin.hardwarecode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lixin.hardwarecode.Dao.HistroyDao;
import com.lixin.hardwarecode.R;
import com.lixin.hardwarecode.adapter.HistoryAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HistoryActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);
        rv.setAdapter(new HistoryAdapter(HistroyDao.queryAll()));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
