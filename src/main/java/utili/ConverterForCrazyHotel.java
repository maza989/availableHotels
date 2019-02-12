package utili;

import adapter.HotelAdapterResponse;
import beans.CrazyHotel;
import enums.HotelProvider;

public class ConverterForCrazyHotel implements Converter{

	public HotelAdapterResponse converter(Object o) {

		HotelAdapterResponse hotelAdapterResponse = new HotelAdapterResponse();
		hotelAdapterResponse.setAmenities(((CrazyHotel)o).getRoomAmenities());
		hotelAdapterResponse.setFare(((CrazyHotel)o).getPrice());
		hotelAdapterResponse.setHotelName(((CrazyHotel)o).getHotelName());
		hotelAdapterResponse.setProvider(HotelProvider.crazyHotel);
		
		return hotelAdapterResponse;
	}
	
	

}