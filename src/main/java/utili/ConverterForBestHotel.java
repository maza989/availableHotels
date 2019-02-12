package utili;

import java.util.Arrays;
import java.util.List;

import adapter.HotelAdapterResponse;
import beans.BestHotel;
import enums.HotelProvider;

public class ConverterForBestHotel implements Converter {

	public HotelAdapterResponse converter(Object o) {

		String[] amenitiesArray = (((BestHotel) o).getRoomAmenities()).split(",");
		List<String> amenities = Arrays.asList(amenitiesArray);
		HotelAdapterResponse hotelAdapterResponse = new HotelAdapterResponse();

		hotelAdapterResponse.setAmenities(amenities);
		hotelAdapterResponse.setFare(((BestHotel) o).getHotelFare());
		hotelAdapterResponse.setHotelName(((BestHotel) o).getHotel());
		hotelAdapterResponse.setProvider(HotelProvider.bestHotel);

		return hotelAdapterResponse;
	}

}
