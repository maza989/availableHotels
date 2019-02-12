package handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import adapter.HotelAdapter;
import adapter.HotelAdapterResponse;
import dto.HotelDTO;

@Component
public class HotelsAvailabilityHandler {
	
	@Autowired
	@Qualifier("crazyHotelsAdapter")
	private HotelAdapter crazyHotelsAdapter;
	
	@Autowired
	@Qualifier("bestHotelAdapter")
	private HotelAdapter bestHotelAdapter;
	
	List<HotelAdapterResponse> myList = new ArrayList<HotelAdapterResponse>();
	
	public List<HotelAdapterResponse> reconnoitringForHotels(HotelDTO hotelDTO)
	{
		HotelAdapterResponse one = crazyHotelsAdapter.reconnoitringForHotels(hotelDTO);
		HotelAdapterResponse two = bestHotelAdapter.reconnoitringForHotels(hotelDTO);
		myList.add(one);
		myList.add(two);
		return myList;
	}

}