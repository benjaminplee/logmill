package com.yardspoon.logmill.screen.viewer;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yardspoon.logmill.R;

import java.util.List;

public class LogListAdapter extends RecyclerView.Adapter<LogListAdapter.ViewHolder> {

    private final List<String> logs;

    public LogListAdapter(List<String> logs) {
        this.logs = logs;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_logline, parent, false));
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(logs.get(position));
    }

    @Override public int getItemCount() {
        return logs.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final TextView text;

        ViewHolder(View itemView) {
            super(itemView);

            text = (TextView) itemView.findViewById(R.id.log_text);
        }
    }
}
