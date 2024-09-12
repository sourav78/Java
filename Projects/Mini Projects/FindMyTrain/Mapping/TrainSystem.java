package Mapping;

import entyties.Schedule;
import entyties.Station;
import entyties.Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String, Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();
}
