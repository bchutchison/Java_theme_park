import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    RollerCoaster rollerCoaster;
    Playground playground;
    ThemePark themePark;


    @Before
    public void before() {
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(playground);
        assertEquals(2, themePark.countAttractions());
    }

//    @Test
//    public void canGetAllReviewed() {
//        themePark.addAttraction(rollerCoaster);
//        assertEquals(ArrayList<IReviewed>(), themePark.getAllReviewed());
//    }

}
