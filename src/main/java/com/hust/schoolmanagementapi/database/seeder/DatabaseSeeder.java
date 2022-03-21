package com.hust.schoolmanagementapi.database.seeder;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DatabaseSeeder {
    private final AdminSeeder adminSeeder;
    private final RoleSeeder roleSeeder;

    public void run() {
        adminSeeder.run();
        roleSeeder.run();
    }
}
