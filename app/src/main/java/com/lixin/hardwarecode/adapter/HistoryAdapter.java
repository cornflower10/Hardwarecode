package com.lixin.hardwarecode.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lixin.hardwarecode.R;

import java.util.List;

/**
 * Created by xiejingbao on 2018/1/9.
 */

public class HistoryAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public HistoryAdapter(@Nullable List<String> data) {
        super(R.layout.history_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_name,item);
    }
}
