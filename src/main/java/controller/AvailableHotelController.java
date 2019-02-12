package controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import adapter.HotelAdapterResponse;
import dto.HotelDTO;
import handler.HotelsAvailabilityHandler;
import utili.Wrapper;

/**
 * @author Abrar Abuzama
 *
 */

@RestController
@RequestMapping(value = { "/available/hotel" })
public class AvailableHotelController {

	@Autowired
	private HotelsAvailabilityHandler hotelsAvailability;

	@RequestMapping(value = { "/search" }, method = RequestMethod.GET, produces = "application/json") //
	public ResponseBody searchForAvailableHotel(@RequestParam(name = "fromDate", required = true) Date fromDate, //
			@RequestParam(name = "toDate", required = true) Date toDate, //
			@RequestParam(name = "city", required = true) String city, //
			@RequestParam(name = "numberOfAdults", required = true) int numberOfAdults) {

		HotelDTO hotelDTO = convertToDTO(fromDate, toDate, city, numberOfAdults);
		List<HotelAdapterResponse> availableHotels = hotelsAvailability.reconnoitringForHotels(hotelDTO);
		Wrapper wrapper = new Wrapper(availableHotels);
		return (ResponseBody) wrapper;

	}

	private HotelDTO convertToDTO(Date fromDate, Date toDate, String city, int numberOfAdults) {
		HotelDTO hotelDTO = new HotelDTO();
		hotelDTO.setFromDate(fromDate);
		hotelDTO.setToDate(toDate);
		hotelDTO.setCity(city);
		hotelDTO.setNumberOfAdults(numberOfAdults);
		return hotelDTO;
	}

}
