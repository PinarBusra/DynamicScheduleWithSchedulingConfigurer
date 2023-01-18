package com.example.DynamicScheduleEx1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;


@Entity
@Table(name = "CONFIGITEM")
public class ConfigItem {

    @Id
    @GeneratedValue
    @Column(name = "CONFIGKEY")
    String  configKey;
    @Column(name = "CONFIGVALUE")
    String  configValue;

    public ConfigItem() {
    }

    public ConfigItem(String configKey, String configValue) {
        this.configKey = configKey;
        this.configValue = configValue;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

}
