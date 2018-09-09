package com.hazelcast.common;


import java.io.Serializable;

/**
 * The domain model to hold the location of airports.
 * Although they are not all at sea-level, we don't care
 * about their altitude.
 * <p>
 * <b>Note:</b> The selected serialization mechanism
 * here is Java provided {@code java.io.Serializable}.
 * This is usually the slowest serialization mechanism,
 * but once the data is held in a Near Cache the
 * transfer time from instance to instance is irrelevant.
 */


public class Airport implements Serializable {

	private static final long serialVersionUID = 3L;
	
    private String code;
    private String description;
    private double latitude;
    private double longitude;
    
    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
    
}
