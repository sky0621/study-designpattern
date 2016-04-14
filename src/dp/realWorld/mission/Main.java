package dp.realWorld.mission;

import java.util.List;

/**
 *  2016/03/21.
 */
public class Main {
    public static void main(String... args) {
        // FactoryMethod
        MissionFactory missionFactory = MissionFactoryBuilder.createMissionFactory();
        // Facade
        List<Mission> missionList = missionFactory.createMissions();

    }
}
