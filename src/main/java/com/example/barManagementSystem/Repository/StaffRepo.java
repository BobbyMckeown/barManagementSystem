package com.example.barManagementSystem.Repository;

import com.example.barManagementSystem.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Long> {

}
