
public class TV {
    private int
            volume, previousVolume,
            channelNumber, flashbackChannel;
    private boolean
            isOn, isMuted;

    // Constructor
    public TV() {
        isOn = false;
        channelNumber = 1;
        volume = 10;
        isMuted = false;
    }

    public int getVolume() { return this.volume;}
    public int getPreviousVolume() { return this.previousVolume; }
    public int getChannelNumber() { return this.channelNumber; }
    public int getFlashBackChannel() { return this.flashbackChannel; }
    public boolean isMuted() { return this.isMuted; }
    public boolean isOn() { return this.isOn; }

    public void power() {
        this.isOn = !isOn();
    }

    public void powerState() {
        if (!isOn())
            System.out.println("TV powered off!");
        else
            System.out.println("TV powered on!");

        System.out.println();
    }
    public void changeChannelNumber(int _channelNumber) {
        if (_channelNumber >= 1 && _channelNumber <= 9999) {
            this.flashbackChannel = this.channelNumber;
            this.channelNumber = _channelNumber;
            System.out.println();
            System.out.println("Channel number: " + this.channelNumber);
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Channel number not found!");
            System.out.println();
        }
    }
    public void flashback() {
        int tmp;
        tmp = this.channelNumber;
        this.channelNumber = this.flashbackChannel;
        this.flashbackChannel = tmp;
        System.out.println("Channel number: " + this.channelNumber);
        System.out.println();
    }
    public void channelUp() {
        if (this.channelNumber <  9999) {
            this.flashbackChannel = this.channelNumber;
            this.channelNumber += 1;
        }
        System.out.println("Channel number: " + this.channelNumber);
        System.out.println();
    }
    public void channelDown() {
        if (this.channelNumber > 1) {
            this.flashbackChannel = this.channelNumber;
            this.channelNumber -= 1;
        }
        System.out.println("Channel number: " + this.channelNumber);
        System.out.println();
    }

    public void mute() {
        if (!isMuted()) {
            this.previousVolume = this.volume;
            this.volume = 0;
            this.isMuted = true;
            System.out.println("TV is muted");
            System.out.println("Volume: " + this.volume);
            System.out.println();
        } else {
            this.volume = this.previousVolume;
            this.isMuted = false;
            System.out.println("TV is unmuted");
            System.out.println("Volume: " + this.volume);
            System.out.println();
        }
    }
    public void volumeUp() {
        if (this.volume < 39 )
            this.volume += 1;
        System.out.println("Volume: " + this.volume);
        System.out.println();
    }
    public void volumeDown() {
        if (this.volume > 1)
            this.volume -=  1;
        System.out.println("Volume: " + this.volume);
        System.out.println();
    }

}