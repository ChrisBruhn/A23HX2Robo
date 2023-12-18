import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackageTest {

    @Test
    public void testPackageName() {
        String expectedPackageName = "com.example";
        String actualPackageName = getClass().getPackage().getName();
        assertEquals(expectedPackageName, actualPackageName, "Package name is incorrect");
    }
}
