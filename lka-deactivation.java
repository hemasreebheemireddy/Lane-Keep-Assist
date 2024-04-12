public class LaneKeepAssist {
    public static void main(String[] args) {
        boolean driverTakingControl = true;
        boolean driverChangingLanes = false;

        if (driverTakingControl || driverChangingLanes) {
            System.out.println("Deactivate Lane Keep Assist.");
        } else {
            System.out.println("Lane Keep Assist remains active.");
        }
    }
}
 
