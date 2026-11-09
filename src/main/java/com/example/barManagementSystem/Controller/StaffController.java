package com.example.barManagementSystem.Controller;

import com.example.barManagementSystem.Model.Staff;
import com.example.barManagementSystem.Repository.StaffRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    private final StaffRepo staffRepo;

    public StaffController(StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }
    @GetMapping
    public List<Staff> getAllStaff() {
        return staffRepo.findAll();
    }
    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return staffRepo.save(staff);
    }
}


