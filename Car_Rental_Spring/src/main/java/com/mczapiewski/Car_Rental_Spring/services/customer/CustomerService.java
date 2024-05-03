package com.mczapiewski.Car_Rental_Spring.services.customer;

import com.mczapiewski.Car_Rental_Spring.dto.BookACarDto;
import com.mczapiewski.Car_Rental_Spring.dto.CarDto;
import com.mczapiewski.Car_Rental_Spring.dto.CarDtoListDto;
import com.mczapiewski.Car_Rental_Spring.dto.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);
}
