package com.example.ecommerce2.ui.buying;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuyingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BuyingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buying fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}