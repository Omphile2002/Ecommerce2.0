package com.example.ecommerce2.ui.selling;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerce2.R;

public class AddNewProduct extends AppCompatActivity {

    private Button AddNewProductButton;
    private ImageView InputProductImage;
    private EditText InputProductName, InputProductDescription, InputProductPrice;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_selling);
        AddNewProductButton = (Button) findViewById(R.id.add_new_product);
    }
}
