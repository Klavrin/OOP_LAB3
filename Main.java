public class Main {
  public static void main(String[] args) {
    String[] physicalTraits = {"BLONDE"};
    Individual ind = new Individual(0, true, "KASHYYYK", 20, physicalTraits);

    System.out.println("ID: " + ind.getId());
    System.out.println("IsHumanoid: " + ind.getIsHumanoid());
    System.out.println("Planet of Origin: " +  ind.getOriginPlanet());
    System.out.println("Age: " + ind.getAge());

    System.out.println("Physical traits:");
    for (int i = 0; i < ind.getPhysicalTraits().length; i++) {
      System.out.println(" - " + physicalTraits[i]);
    }

    ReadFile rf = new ReadFile("input.json");
    rf.printFile();
  }
}
