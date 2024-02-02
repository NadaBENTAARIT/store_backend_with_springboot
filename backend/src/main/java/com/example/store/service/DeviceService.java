package com.example.store.service;

import com.example.store.model.Device;
import com.example.store.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    // CREATE
    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    // READ
    public List<Device> getDevices() {
        return deviceRepository.findAll();
    }

    // READ BY ID
    public Device getDeviceById(Long deviceId) {
        Optional<Device> optionalDevice = deviceRepository.findById(deviceId);
        return optionalDevice.orElse(null);
    }

    // DELETE
    public String deleteDevice(Long deviceId) {
        deviceRepository.deleteById(deviceId);
        return "Device deleted successfully";
    }

    /***
     *
     * @param deviceId
     * @param deviceDetails
     * @return
     */
    public Device updateDevice(Long deviceId, Device deviceDetails) {
        Device device = deviceRepository.findById(deviceId).orElse(null);

        if (device != null) {
            device.setDescription(deviceDetails.getDescription());
            device.setPrice(deviceDetails.getPrice());
            return deviceRepository.save(device);
        } else {
            return null;
        }
    }
}
