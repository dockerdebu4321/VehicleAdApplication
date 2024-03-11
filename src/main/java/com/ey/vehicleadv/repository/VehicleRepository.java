package com.ey.vehicleadv.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepository extends JpaRepository<EmployeeEntity,Integer> {

}
