package com.hust.schoolmanagementapi.database.seeder;

import com.hust.schoolmanagementapi.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminSeeder extends AbstractSeeder{

    @Autowired
    AdminRepository adminRepository;

    @Override
    public void run() {

    }
}
