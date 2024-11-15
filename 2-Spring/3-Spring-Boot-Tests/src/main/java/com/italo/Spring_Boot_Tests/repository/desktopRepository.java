package com.italo.Spring_Boot_Tests.repository;

import com.italo.Spring_Boot_Tests.models.desktop;
import org.springframework.stereotype.Repository;

@Repository
public class desktopRepository {
    public void save(desktop desk){
        System.out.println("saving desktop...");
    }
}
