
public class Remote {
    private enum Controls {
        POWER,
        CHANGE_CHANNEL,
        FLASHBACK,
        CHANNEL_UP,
        CHANNEL_DOWN,
        VOLUME_UP,
        VOLUME_DOWN,
        MUTE,
    }

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
        System.out.print("Option: ");
    }
    /*
    public void power() { TV.power(); }
    public void changeChannel(int channelNum) { TV.changeChannelNumber(channelNum); }
    public void channelUp() { TV.channelUp(); }
    public void channelDown() { TV.channelDown(); }
    public void flashback() { TV.flashback(); }
    public void volumeUp() { TV.volumeUp(); }
    public void volumeDown() { TV.volumeDown(); }
    public void mute() { TV.mute(); }
    */
}
