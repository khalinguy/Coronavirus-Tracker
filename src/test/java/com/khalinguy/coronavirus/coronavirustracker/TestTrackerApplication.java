package com.khalinguy.coronavirus.coronavirustracker;

import com.khalinguy.coronavirus.coronavirustracker.models.LocationStats;
import com.khalinguy.coronavirus.coronavirustracker.services.CoronaVirusDataService;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import java.util.List;


public class TestTrackerApplication extends CoronavirusTrackerApplicationTests{

    @Test
    public void testFetchData() throws Exception {
        CoronaVirusDataService coronaVirusDataService = new CoronaVirusDataService();
        List<LocationStats> locationStats = coronaVirusDataService.getAllStats();
        assertNotNull(locationStats);
    }

}
