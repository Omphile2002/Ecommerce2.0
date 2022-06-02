package com.example.ecommerce2.ui.selling;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SellingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SellingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is selling fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}