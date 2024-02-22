import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionManagerTest {
    private final VersionManager versionManager = new VersionManager();

    @Test
    void getVersion() {
        assertEquals(-1, versionManager.getVersion());
    }

    @Test
    void setVersion() {
        versionManager.setVersion();
        assertEquals(100, versionManager.getVersion());
    }

    @Test
    void updateMajor() {
        versionManager.updateMajor();
        assertEquals(200, versionManager.getVersion());
    }

    @Test
    void updateMinor() {
        versionManager.updateMinor();
        assertEquals(10, versionManager.getVersion());
    }

    @Test
    void updatePatch() {
        versionManager.updatePatch();
        assertEquals(1, versionManager.getVersion());
    }

    @Test
    void test() {
        versionManager.reset();
        assertEquals(-1, versionManager.getVersion());
    }

    @Test
    void superpatch() {
        versionManager.superpatch();
        assertEquals(1000, versionManager.getVersion());
    }
}
