package isp.lab8.airways;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
public class Exercise {
    public static void main(String[] args) throws IOException {
        String root = "LRCL-LROP";

        FileAndFoldersUtil.createFolder(root);

        Waypoint w0 = new Waypoint(0,"LRCL", 46.7852, 23.6862, 415);
        Waypoint w1 = new Waypoint(1,"TASOD",47.0548, 23.9212, 10460);
        Waypoint w2 = new Waypoint(2,"SOPAV",46.9804, 24.7365, 10900);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(root+"\\"+"waypoint0.json"),w0);
        objectMapper.writeValue(new FileWriter(root+"\\"+"waypoint1.json"),w1);
        objectMapper.writeValue(new FileWriter(root+"\\"+"waypoint2.json"),w2);

        String jsonContent = FileReadUtil.readAllFileLines(root+"\\"+"waypoint0.json").stream().collect(Collectors.joining("\n"));
        Waypoint wr = objectMapper.readValue(jsonContent, Waypoint.class);
        System.out.println("Waypoint0 read from file: "+wr);

        jsonContent = FileReadUtil.readAllFileLines(root+"\\"+"waypoint1.json").stream().collect(Collectors.joining("\n"));
        wr = objectMapper.readValue(jsonContent, Waypoint.class);
        System.out.println("Waypoint1 read from file: "+wr);

        jsonContent = FileReadUtil.readAllFileLines(root+"\\"+"waypoint2.json").stream().collect(Collectors.joining("\n"));
        wr = objectMapper.readValue(jsonContent, Waypoint.class);
        System.out.println("Waypoint2 read from file: "+wr);
        Route route1 = new Route("LRCL-SOPAV");
        Waypoint wp = new Waypoint(7,"LRCL", 46.7712, 23.6236, 415);
        route1.addWaypoint(wp);
        Waypoint wp1 = new Waypoint(5, "TASOD", 44.4268, 26.1025, 10460);
        route1.addWaypoint(wp1);
        System.out.println(route1.getTotalDistance() + " kilometers");
        Route.displayAllRoutes();
        Route.displayRoute(route1);
        Route route2 = new Route("LRCL-TASOD");
        Route.removeRoute(route2);
    }
}
