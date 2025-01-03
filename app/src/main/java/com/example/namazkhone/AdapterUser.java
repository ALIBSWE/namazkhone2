package com.example.namazkhone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {
    private List<User> users;

    public AdapterUser(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // اتصال به فایل XML
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        // تنظیم مقدار نام کاربر
        holder.txt101.setText(users.get(position).name);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView txt101;

        public UserViewHolder(View itemView) {
            super(itemView);
            txt101 = itemView.findViewById(R.id.txt101);
        }
    }
}
