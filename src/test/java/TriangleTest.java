import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 4, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }
  @Test
  public void getLength_getsTriangleSide1_2() {
    Triangle testTriangle = new Triangle(2, 4, 3);
    assertEquals(2, testTriangle.getSide1());
  }
  @Test
  public void getLength_getsTriangleSide2_4() {
    Triangle testTriangle = new Triangle(2, 4, 3);
    assertEquals(4, testTriangle.getSide2());
  }
  @Test
  public void getLength_getsTriangleSide3_3() {
    Triangle testTriangle = new Triangle(2, 4, 3);
    assertEquals(3, testTriangle.getSide3());
  }
}
