package Aula02;

public class UsarTelevisor {
	public static void main(String[] args) {
		Televisor canal01 = new Televisor();
		canal01.setCanal(101);
		canal01.setVolume(10);

		Televisor canal02 = new Televisor();
		canal02.setCanal(169);
		canal02.setVolume(5);

		Televisor canal03 = new Televisor();
		canal03.setCanal(153);
		canal03.setVolume(0);
		canal03.reduzirVolume();


		/*System.out.println(canal01);
		System.out.println(canal02);*/
		System.out.println(canal03);



		}

}
