
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

    public boolean isMuted() { return this.isMuted; }
    public boolean isOn() { return this.isOn; }

    public void power() {
        this.isOn = !this.isOn();

        if (this.isOn()) {
            System.out.println("TV is On!");
        } else {
            System.out.println("Tv is Off!");
        }
        System.out.println();
    }

    public void changeChannelNumber(String _channelNumber) {
        if (this.isOn()) {
            int channel = 0;
            try {
                channel = Integer.parseInt(_channelNumber);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (this.channelNumber >= 1 && this.channelNumber <= 9999) {
                this.flashbackChannel = this.channelNumber;
                this.channelNumber = channel;
                System.out.println();
                System.out.println("Channel number: " + this.channelNumber);
            } else {
                System.out.println();
                System.out.println("Channel number not found!");
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
                System.out.println("TV is muted");
            } else {
                this.volume = this.previousVolume;
                this.isMuted = false;
                System.out.println("TV is unmuted");

            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }
    public void volumeUp() {
        if (this.isOn()) {
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
            if (this.volume > 0)
                this.volume--;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Nothing Happened!");
        }
        System.out.println();
    }

}