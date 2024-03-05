package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CityList {
   
    private List<City> cities = new ArrayList<>();


    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    public void delete(City city){
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }


    public List<City> getCities(boolean sortByCityName)  {

        List<City> cityList = cities;
        if (sortByCityName) {
            Collections.sort(cityList);
        } else {
            cityList.sort(Comparator.comparing(City::getProvinceName));
        }

        return cityList;
    }


    public  int count(){
       return cities.size();
    }
}