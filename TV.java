
public class TV {
    private int
            volume, previousVolume,
            channelNumber, flashbackChannel;
    private boolean
            isOn, isMuted;

    private String uid;

    // Constructor
    public TV(String _uid) {
        uid = _uid;
        isOn = false;
        channelNumber = 1;
        volume = 10;
        isMuted = false;
    }

    public boolean isMuted() { return this.isMuted; }
    public boolean isOn() { return this.isOn; }
    public String getUID() { return this.uid; }

    public void power() {
        this.isOn = !this.isOn();

        if (this.isOn()) {
            System.out.println("TV is On!");
        } else {
            System.out.println("TV is Off!");
        }
        System.out.println();
    }

    public void changeChannelNumber(String _channelNumber) {
        if (this.isOn()) {
            int channel = 0;
            try {
                channel = Integer.parseInt(_channelNumber);
            } catch (Exception ignore){ }

            if (channel >= 1 && channel <= 9999) {
                if (channel != this.channelNumber) {
                    this.flashbackChannel = this.channelNumber;
                    this.channelNumber = channel;
                }
                System.out.println();
                System.out.println("Channel number: " + this.channelNumber);
            } else {
                System.out.println();
                System.out.println("Invalid Channel!");
            }
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void flashback() {
        if (this.isOn()) {
            int tmp;
            tmp = this.channelNumber;
            this.channelNumber = this.flashbackChannel;
            this.flashbackChannel = tmp;
            System.out.println("Channel number: " + this.channelNumber);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void channelUp() {
        if (this.isOn()) {
            if (this.channelNumber < 9999) {
                this.flashbackChannel = this.channelNumber;
                this.channelNumber++;
            }
            System.out.println("Channel number: " + this.channelNumber);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void channelDown() {
        if (this.isOn()) {
            if (this.channelNumber > 1) {
                this.flashbackChannel = this.channelNumber;
                this.channelNumber--;
            }
            System.out.println("Channel number: " + this.channelNumber);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }

    public void mute() {
        if (this.isOn()) {
            if (!this.isMuted()) {
                this.previousVolume = this.volume;
                this.volume = 0;
                this.isMuted = true;
            } else {
                this.volume = this.previousVolume;
                this.isMuted = false;
            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void volumeUp() {
        if (this.isOn()) {
            if (this.isMuted()) {
                this.isMuted = false;
                this.volume = this.previousVolume;
            }
            if (this.volume < 40)
                this.volume++;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void volumeDown() {
        if (this.isOn()) {
            if (this.isMuted()) {
                this.isMuted = false;
                this.volume = this.previousVolume;
            }
            if (this.volume > 0)
                this.volume--;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }

}