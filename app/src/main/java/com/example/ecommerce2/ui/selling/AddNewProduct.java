package com.example.ecommerce2.ui.selling;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerce2.R;

public class AddNewProduct extends AppCompatActivity {

    private Button AddNewProductButton;
    private Button SeeItem;
    private ImageView InputProductImage;
    private EditText InputProductName, InputProductDescription, InputProductPrice;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_selling);
        AddNewProductButton = (Button) findViewById(R.id.add_new_product);
        SeeItem = (Button) findViewById(R.id.see_item);
        Spinner spinnerCategories=findViewById(R.id.spinner_categories);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCategories.setAdapter(adapter);
    }
}
