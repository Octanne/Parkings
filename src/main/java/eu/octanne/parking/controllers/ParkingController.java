package eu.octanne.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.octanne.parking.models.Parking;
import eu.octanne.parking.services.ParkingService;

@RestController
public class ParkingController {
    
    @Autowired
    private ParkingService parkingService;

    @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
    public List<Parking> getListParkings() {
        return parkingService.getListParkings();
    }

}
