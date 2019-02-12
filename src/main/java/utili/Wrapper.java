package utili;

import java.util.List;

import adapter.HotelAdapterResponse;

public class Wrapper {

	private List<HotelAdapterResponse> availabeHotels;

	public Wrapper(List<HotelAdapterResponse> availabeHotels) {
		super();
		this.availabeHotels = availabeHotels;
	}

	public List<HotelAdapterResponse> getAvailabeHotels() {
		return availabeHotels;
	}

	public void setAvailabeHotels(List<HotelAdapterResponse> availabeHotels) {
		this.availabeHotels = availabeHotels;
	}

}
