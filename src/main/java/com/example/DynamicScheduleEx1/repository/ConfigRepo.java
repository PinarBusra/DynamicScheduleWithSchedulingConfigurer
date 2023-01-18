package com.example.DynamicScheduleEx1.repository;


import com.example.DynamicScheduleEx1.model.ConfigItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConfigRepo extends JpaRepository<ConfigItem, String> {

}
