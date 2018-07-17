package com.example.sunidhi.inclass09;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunidhi on 26-Mar-18.
 */

public class TripClass {
    List<LatLng> points;

    @Override
    public String toString() {
        return "TripClass{" +
                ", points=" + points +
                '}';
    }

    public static class PointsClass{
        Double latitude, longitude;

        public Double getLatitude() {
            return latitude;
        }

        public Double getLongitude() {
            return longitude;
        }
    }
}


