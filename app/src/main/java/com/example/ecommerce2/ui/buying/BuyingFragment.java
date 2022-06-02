package com.example.ecommerce2.ui.buying;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ecommerce2.databinding.FragmentBuyingBinding;

public class BuyingFragment extends Fragment {

    private FragmentBuyingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BuyingViewModel buyingViewModel =
                new ViewModelProvider(this).get(BuyingViewModel.class);

        binding = FragmentBuyingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBuying;
        buyingViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}