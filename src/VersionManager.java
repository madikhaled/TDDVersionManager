public class VersionManager {
    private int version = -1;

    public int getVersion() {
        return version;
    }

    public void setVersion() {
        this.version = 100;
    }

    public void updateMajor() {
        this.version = 200;
    }

    public void updateMinor() {
        this.version = 10;
    }

    public void updatePatch() {
        this.version = 1;
    }
    public void test() {
        this.version = -1;
    }
    public void superpatch() {
        this.version = 1000;
    }
}
