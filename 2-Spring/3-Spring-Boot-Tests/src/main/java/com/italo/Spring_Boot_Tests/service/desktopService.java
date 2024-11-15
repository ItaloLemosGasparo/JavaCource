package com.italo.Spring_Boot_Tests.service;

import com.italo.Spring_Boot_Tests.models.desktop;
import com.italo.Spring_Boot_Tests.repository.desktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class desktopService {
    @Autowired
    private desktopRepository repo;

    public void addDesktop(desktop desk){
        repo.save(desk);
    }

    public boolean isGoodForPrograming(desktop desk){
        return true;
    }
}
