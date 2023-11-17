package has;

public class Heart {
    private int beatsCount;

    public Heart(int beatsCount) {
        this.beatsCount = beatsCount;
    }

    public int getBeatsCount() {
        return beatsCount;
    }

    public void setBeatsCount(int beatsCount) {
        this.beatsCount = beatsCount;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "beatsCount=" + beatsCount +
                '}';
    }
}
