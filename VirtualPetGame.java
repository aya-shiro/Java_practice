class VirtualPetGame {
  public static void main(String[] args) {
    VirtualDog maro = new VirtualDog("マロ", 100, 80);
    VirtualDog horo = new VirtualDog("ホロ", 100, 40);
    VirtualBird piyon = new VirtualBird("ピヨン", 50, 30);
    // maro.Sleep();
    maro.Walk();
    maro.PrintInfo();
    piyon.Fly();
    piyon.PrintInfo();
  }
}

class VirtualDog {
  String name;
  int maxEnergy;
  int energy;

  VirtualDog(String name, int energy, int maxEnergy) {  //コンストラクタ
    this.name = name;
    this.energy = energy;
    this.maxEnergy = maxEnergy;
  }

  void Sleep() {
    System.out.println(this.name + "：よく寝た。体力が回復したよ");
    this.energy = this.maxEnergy;
  }

  void Walk() {
    // this.name = name;
    // this.energy = energy;
    if (this.energy < 10) {
      System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ");
    } else {
      System.out.println(this.name + "：歩いたよ。体力が10減って最大体力が1増えたよ");
      this.energy -= 10;
      this.maxEnergy ++;
    }
  }

  void PrintInfo() {
    System.out.println("[現在のステータス]");
    System.out.println("名前：" + this.name);
    System.out.println("現在の体力" + this.energy + "/" +"最大体力" + this.maxEnergy);
  }
}

class VirtualBird extends VirtualDog {

  public VirtualBird(String name, int energy, int maxEnergy) {
    super(name, energy, maxEnergy);
  }

  public void Fly() {
    if (this.energy < 10) {
      System.out.println(this.name + "：疲れちゃって、これ以上飛べないよ");
    } else {
      System.out.println(this.name + "：飛んだよ。体力が10減って最大体力が1増えたよ");
      this.energy -= 10;
      this.maxEnergy ++;
    }
  }
}