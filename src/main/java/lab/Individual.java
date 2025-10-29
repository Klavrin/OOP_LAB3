package lab;

public class Individual {
  private final int id;
  private final boolean isHumanoid;
  private final String originPlanet;
  private final int age;
  private final String[] physicalTraits;

  public Individual(int id, boolean isHumanoid, String originPlanet, int age, String[] physicalTraits) {
    this.id = id;
    this.isHumanoid = isHumanoid;
    this.originPlanet = originPlanet;
    this.age = age;
    this.physicalTraits = physicalTraits;
  }

  public int getId() {
    return id;
  }

  public boolean getIsHumanoid() {
    return isHumanoid;
  }

  public String getOriginPlanet() {
    return originPlanet;
  }

  public int getAge() {
    return age;
  }

  public String[] getPhysicalTraits() {
    return physicalTraits.clone();
  }

  @Override
  public String toString() {
    return "{\n Id: " + id + ",\n isHumanoid: " + isHumanoid + ",\n Planet of origin: " + originPlanet + ",\n Age: "
        + age + "\n},";
  }
}
