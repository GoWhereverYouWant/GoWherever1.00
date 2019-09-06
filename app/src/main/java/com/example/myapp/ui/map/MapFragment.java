package com.example.myapp.ui.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.maps.AMap;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.example.myapp.R;

public class MapFragment extends Fragment {


    /**
     * 地图信息定义
     */

    private MapViewModel mapViewModel;
    private AMap aMap;
    private MapView mapView;
    // 处理定位更新
    private LocationSource.OnLocationChangedListener mListener;
    // 定位
    private AMapLocationClient mlocationClient;
    private AMapLocationClientOption mLocationOption;
    private RadioGroup mGPSModeGroup;
    private TextView mLocationErrText;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mapViewModel =
                ViewModelProviders.of(this).get(MapViewModel.class);
        View root = inflater.inflate(R.layout.fragment_map, container, false);
        final MapView MapView = (MapView)  root.findViewById(R.id.text_map);
        mapViewModel.getView().observe(this, new Observer<MapView>() {
            @Override
            public void onChanged(@Nullable MapView mapView) {


            }
        });
        return root;
    }



    MapView mMapView = null;

}