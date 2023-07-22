package com.AbhishekKumar.HotelManagementSystem.repository;

import com.AbhishekKumar.HotelManagementSystem.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {
}
