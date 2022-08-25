package com.example.listapresenteprof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.listapresenteprof.model.Gift;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class AddGiftActivity extends AppCompatActivity
{

    private TextInputLayout inputLayoutName;
    private TextInputLayout inputLayoutGift;
    private TextInputLayout inputLayoutDescription;

    private TextInputEditText textInputEditTextName;
    private TextInputEditText textInputEditTextGift;
    private TextInputEditText textInputEditTextDescription;

    private Button buttonAddGift;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_gift);

        inputLayoutName = findViewById(R.id.input_layout_name);
        inputLayoutGift = findViewById(R.id.input_layout_gift);
        inputLayoutDescription = findViewById(R.id.input_layout_description);

        textInputEditTextName = findViewById(R.id.input_text_name);
        textInputEditTextGift = findViewById(R.id.input_text_gift);
        textInputEditTextDescription = findViewById(R.id.input_text_description);

        buttonAddGift = findViewById(R.id.button_add_gift);

        buttonAddGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveGift();
            }
        });


    }
    private void saveGift(){

       String name = textInputEditTextName.getText().toString();
       String giftName = textInputEditTextGift.getText().toString();
       String description = textInputEditTextDescription.getText().toString();

        Gift gift = new Gift(
                name,
                giftName,
                description
        );
    }
}