import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javalib.worldimages.CircleImage;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.WorldImage;
import tester.Tester;

// A supplied check of Java, the course libraries, and explicit generic types.
class ExamplesSetupCheck {
  final String course = "CSAS2123";

  boolean testJava(Tester t) {
    return t.checkExpect(2 + 2, 4);
  }

  boolean testExplicitTypes(Tester t) {
    List<String> names = new ArrayList<String>();
    names.add(this.course);
    return t.checkExpect(names.get(0), this.course);
  }

  boolean testImages(Tester t) {
    WorldImage circle = new CircleImage(10, OutlineMode.SOLID, Color.BLUE);
    return t.checkInexact(circle.getWidth(), 20.0, 0.001);
  }
}
