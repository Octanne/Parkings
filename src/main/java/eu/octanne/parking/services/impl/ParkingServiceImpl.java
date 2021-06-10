package eu.octanne.parking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import eu.octanne.parking.models.Parking;
import eu.octanne.parking.services.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Override
    public List<Parking> getListParkings() {
        ArrayList<Parking> tList = new ArrayList<>();
        Parking parkingT = new Parking();
        parkingT.setHeureMaj("17:12 - 12/05/2021");
        parkingT.setNom("Moulin de la Housse");
        parkingT.setNbPlacesDispo(53);
        parkingT.setNbPlacesTotal(165);
        parkingT.setStatut("OUVERT");
        tList.add(parkingT);
        return tList;
    }
    
}
