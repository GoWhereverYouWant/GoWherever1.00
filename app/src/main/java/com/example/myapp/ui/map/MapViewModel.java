package com.example.myapp.ui.map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

public class MapViewModel extends ViewModel {

    private MutableLiveData<MapView> mText;
    private AMap amap;
    public MapViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<MapView> getView() {
        return mText;
    }





}