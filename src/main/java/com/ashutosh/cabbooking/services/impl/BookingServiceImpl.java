package com.ashutosh.cabbooking.services.impl;

import com.ashutosh.cabbooking.data.entities.Booking;
import com.ashutosh.cabbooking.data.entities.CabInfo;
import com.ashutosh.cabbooking.data.enums.CabStatus;
import com.ashutosh.cabbooking.services.BookingService;
import com.ashutosh.cabbooking.services.CabInfoService;
import com.ashutosh.cabbooking.services.repository.BookingRepoService;
import com.ashutosh.cabbooking.services.repository.CabInfoRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepoService bookingRepoService;

    @Autowired
    CabInfoService cabInfoService;

    @Autowired
    CabInfoRepoService cabInfoRepoService;

    @Override
    public Booking bookCab(int startCityId, int destCityId) {
        int cabId = cabInfoService.searchCab(startCityId);
        CabInfo cabInfo = cabInfoRepoService.getCabInfoByCabId(cabId).get();
        cabInfoService.saveCabInfo(cabInfo.setCabStatus(CabStatus.ON_TRIP));
        return bookingRepoService.saveBooking(
                new Booking().setCabId(cabId)
                .setStartCityId(startCityId)
                .setDestCityId(destCityId));
    }
}
