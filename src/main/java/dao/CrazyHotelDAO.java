package dao;

import beans.CrazyHotel;
import dto.HotelDTO;

public interface CrazyHotelDAO {

	CrazyHotel findCrazyHotel(HotelDTO hotelDTO) ;	
}
