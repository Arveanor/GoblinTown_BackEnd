package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final CityRepository cityRepo;
    private final ActionRepository actionRepo;

    @Autowired
    public DatabaseLoader(CityRepository cityRepo, ActionRepository actionRepo)
    {
        this.cityRepo = cityRepo;
        this.actionRepo = actionRepo;
    }

    @Override
    public void run(String... strings) throws Exception
    {
        this.cityRepo.save(new City("Arkad", 8314));
        this.actionRepo.save(new Action("buildFarm", "build"));
    }
}
