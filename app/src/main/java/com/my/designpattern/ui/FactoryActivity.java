package com.my.designpattern.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.my.designpattern.R;
import com.my.designpattern.clicks.Clickfactory;
import com.my.designpattern.databinding.ActivityFactoryBinding;
import com.my.designpattern.model.ModelFactory;
import com.my.designpattern.viewmodel.ViewmodelFactory;

public class FactoryActivity extends AppCompatActivity {

    private ActivityFactoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_factory);
        binding.setModelFactory(new ViewmodelFactory(new ModelFactory("Factory Design Pattern")));
        binding.setModelFactoryClick(new Clickfactory(this));
    }
}