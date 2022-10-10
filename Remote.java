
public class Remote {

    // constructor:
    public Remote() { }

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

    public void power(TV tv) { tv.power(); }
    public void changeChannel(TV tv, String channelNum) { tv.changeChannelNumber(channelNum); }
    public void channelUp(TV tv) { tv.channelUp(); }
    public void channelDown(TV tv) { tv.channelDown(); }
    public void flashback(TV tv) { tv.flashback(); }
    public void volumeUp(TV tv) { tv.volumeUp(); }
    public void volumeDown(TV tv) { tv.volumeDown(); }
    public void mute(TV tv) { tv.mute(); }

}
