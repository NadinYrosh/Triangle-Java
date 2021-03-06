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
  @Test
  public void isTriangle_whenNotATriangle_false() {
    Triangle testTriangle = new Triangle(1, 1, 10);
    assertEquals(false, testTriangle.isTriangle());
  }
  @Test
  public void isEquilateral_whenAllSidesAreEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }
  @Test
  public void isIsosceles_whenExectlyTwoSidesAreEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isIsosceles());
  }
  @Test
  public void isScalene_whenAllSidesAreNotEqual_true() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(true, testTriangle.isScalene());
  }
}
