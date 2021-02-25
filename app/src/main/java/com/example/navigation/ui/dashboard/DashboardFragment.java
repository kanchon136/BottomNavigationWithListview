package com.example.navigation.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation.DashboardAdapter;
import com.example.navigation.Model.CardModel;
import com.example.navigation.R;

public class DashboardFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ListView listView = root.findViewById(R.id.list_card);
        DashboardAdapter adapter = new DashboardAdapter(getActivity().getApplicationContext());
        listView.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.k, "Banana", "Test Description"));
        return root;
    }
}