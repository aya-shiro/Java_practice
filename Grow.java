class Grow {
  public static void main(String[] args) {
    // VirtualDog();
    
    VirtualDog maro = new VirtualDog();
    maro.name = "マロ";
    maro.maxEnergy = 100;
    maro.energy = 80;
    System.out.println("名前： " + maro.name);
    System.out.println("現在の体力" + maro.energy + "/" +"最大体力" + maro.maxEnergy);
    
    VirtualDog horo = new VirtualDog();
    horo.name = "ホロ";
    horo.maxEnergy = 100;
    horo.energy = 90;
    System.out.println("名前： " + horo.name);
    System.out.println("現在の体力" + horo.energy + "/" +"最大体力" + horo.maxEnergy);
  } 
}

class VirtualDog {
  String name;
  int maxEnergy;
  int energy;
}