package com.example.ecommerce2.ui.selling;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ecommerce2.databinding.FragmentSellingBinding;

public class SellingFragment extends Fragment {

    private FragmentSellingBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SellingViewModel sellingViewModel =
                new ViewModelProvider(this).get(SellingViewModel.class);

        binding = FragmentSellingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textSelling;
        //sellingViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}