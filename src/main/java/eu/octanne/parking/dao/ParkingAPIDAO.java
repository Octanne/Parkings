package eu.octanne.parking.dao;

import eu.octanne.parking.dao.entity.ResponseParkingAPIEntity;

public interface ParkingAPIDAO {
    
    public ResponseParkingAPIEntity getListParkings();

}
