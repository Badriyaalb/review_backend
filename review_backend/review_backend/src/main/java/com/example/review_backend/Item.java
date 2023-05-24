package com.example.review_backend;

import java.text.DecimalFormat;

public class Item {
    String PlaceName;
    String PlaceLocation;
    String WorkingDays;
    Float AverageRating;
    String PlaceImage;
   
// place Name
    public String getPlaceName(){
        return PlaceName;
    }

    public void setPlaceName(String PlaceName){
        this.PlaceName = PlaceName;
    }

// place location

    public String getPlaceLocation(){
        return PlaceLocation;
    }

    public void setPlaceLocation(String PlaceLocation){
       this.PlaceLocation = PlaceLocation;
    }
// working days
    public String getWorkingDays(){
        return WorkingDays;
    }

    public void setWorkingDays(String WorkingDays){
       this.WorkingDays = WorkingDays;
    }
// average Rating
    public Float getAverageRating(){
        return AverageRating;
    }

    public void setAverageRating(Float AverageRating){
       this.AverageRating = AverageRating;
    }
// place image
    public String PlaceImage(){
        return PlaceImage;
    }

    public void setPlaceImage(String PlaceImage){
       this.PlaceImage = PlaceImage;
    }

}