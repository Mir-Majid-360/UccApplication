package com.example.uccapplication.adapter;

import androidx.annotation.NonNull;

interface Faculty {
    void onBindViewHolder(@NonNull FacultyAdaptor.ViewHolder holder, int position);

    void onBindViewHolder(@NonNull FacultyAdaptor holder, int position);
}
