package com.alkl1m.weatherapp.service;

import com.alkl1m.weatherapp.dto.web.GeoResponse;

import java.util.List;

/**
 * @author AlKl1M
 */
public interface GeoService {

    List<GeoResponse> getGeoData(String cityName, int limit);

}
