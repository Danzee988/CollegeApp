import com.example.collegeapp.CollegeApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollegeAppTest {
    private CollegeApp collegeApp;

    @BeforeEach
    public void setUp() {
        collegeApp = new CollegeApp();
    }

    @Test
    public void testITBuildingButton() {
        collegeApp.clickITBuildingButton();
        assertTrue(collegeApp.isInITBuilding());
    }

    @Test
    public void testBusinessBuildingButton() {
        collegeApp.clickBusinessBuildingButton();
        assertTrue(collegeApp.isInBusinessBuilding());
    }

    @Test
    public void testMainBuildingButton() {
        collegeApp.clickMainBuildingButton();
        assertTrue(collegeApp.isInMainBuilding());
    }
}
