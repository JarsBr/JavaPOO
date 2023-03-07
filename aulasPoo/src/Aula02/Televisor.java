package Aula02;

public class Televisor {
	private int canal, volume;

	public void setVolume(int vol) {
	volume = vol;
	}

	public void setCanal(int c) {
	canal = c;
	}

	public int getCanal() {
	return canal;
	}

	public int getVolume() {
	return volume;
	}

	public void aumentarVolume() {
		if(volume >=10) {
			System.out.println("Volume Maximo");
		}
		else {
			volume++;
		}
	}

	public void reduzirVolume() {
		if(volume == 0) {
			System.out.println("Volume Mínimo");
		}
		else {
			volume--;
		}
	}

	public void trocarCanal(int c) {
	canal = c;
	}

	public String toString() {
	return "Volume - " + getVolume() + "\nCanal - " + getCanal();
	}

}
