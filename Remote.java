import java.util.Objects;

public class Remote {

    private final String uid;
    // constructor:
    public Remote(String _uid) {
        uid = _uid;
    }

    public void printOptions() {
        System.out.println("Remote Options:");
        System.out.println("p - Power On/Off");
        System.out.println("c - Change Channel");
        System.out.println("^ - Channel Up");
        System.out.println("v - Channel Down");
        System.out.println("b - Flashback");
        System.out.println("+ - Volume Up");
        System.out.println("- - Volume Down");
        System.out.println("m - Mute/Unmute");
        System.out.println();
        System.out.println("x - exit program");
        System.out.println();
    }

    public void power(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.power();
    }
    public void changeChannel(TV tv, String uid, String channelNum) {
        if (Objects.equals(uid, this.uid))
            tv.changeChannelNumber(channelNum); }
    public void channelUp(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.channelUp();
    }
    public void channelDown(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.channelDown();
    }
    public void flashback(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.flashback();
    }
    public void volumeUp(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.volumeUp();
    }
    public void volumeDown(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.volumeDown();
    }
    public void mute(TV tv, String uid) {
        if (Objects.equals(uid, this.uid))
            tv.mute();
    }

}
