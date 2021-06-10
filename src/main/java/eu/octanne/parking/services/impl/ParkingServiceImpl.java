package eu.octanne.parking.services.impl;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.octanne.parking.dao.ParkingAPIDAO;
import eu.octanne.parking.dao.entity.RecordEntity;
import eu.octanne.parking.dao.entity.ResponseParkingAPIEntity;
import eu.octanne.parking.models.Parking;
import eu.octanne.parking.services.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    public ParkingAPIDAO parkingAPIDAO;

    @Override
    public List<Parking> getListParkings() {
        ResponseParkingAPIEntity response = parkingAPIDAO.getListParkings();
        return transformEntityToModel(response);
    }

    private List<Parking> transformEntityToModel(ResponseParkingAPIEntity response) {
        List<Parking> resultat = new ArrayList<Parking>();
        for(RecordEntity record : response.getRecords()) {
            Parking parking = new Parking();
            parking.setNom(record.getFields().getNom());
            parking.setStatut(getLibelleStatut(record));
            parking.setNbPlacesTotal(record.getFields().getNbPlace());
            parking.setNbPlacesDispo(record.getFields().getNbPlaceDispo());
            parking.setHeureMaj(getHeureMaj(record));
            parking.setLoc(record.getFields().getLoc());
            resultat.add(parking);
        }

        return resultat;
    }

    private String getHeureMaj(RecordEntity record) {
        OffsetDateTime date = OffsetDateTime.parse(record.getFields().getHorodatage());
        date = date.withOffsetSameInstant(ZoneOffset.of("+2"));
        return date.format(DateTimeFormatter.ofPattern("HH:mm")).replaceAll(":", "h");
    }

    private String getLibelleStatut(RecordEntity record) {
        switch(record.getFields().getStatut()) {
            case "1" :
                return "Fermé";
            case "2" :
                return "Abonnés";
            case "5" :
                return "Ouvert";
            default :
                return "Données indisponibles";
        }
    }
    
}
