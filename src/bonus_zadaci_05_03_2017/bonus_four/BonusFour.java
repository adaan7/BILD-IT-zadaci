package bonus_zadaci_05_03_2017.bonus_four;

/**
 * @author AonoZan Dejan Petrovic 2017 ©
 */
public class BonusFour {
	public static void main(String[] args) {
		Phone nokia3310 = new Nokia3310();
		Phone lumia638 = new Lumia368();
		Phone lenovoK50t5 = new LenovoK50t5();
		Phone lenovoK6Power = new LenovoK6Power();

		nokia3310.printInfo();
		lumia638.printInfo();
		lenovoK50t5.printInfo();
		lenovoK6Power.printInfo();
	}
}
