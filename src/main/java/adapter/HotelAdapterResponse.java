package adapter;

import java.util.List;

import enums.HotelProvider;

public class HotelAdapterResponse {

	private HotelProvider provider;
	private String hotelName;
	private double fare;
	private List<String> amenities;

	public HotelProvider getProvider() {
		return provider;
	}

	public void setProvider(HotelProvider provider) {
		this.provider = provider;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public List<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}

}
