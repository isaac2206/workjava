public class TimeTeste {
	public static void main(String[] args) {

		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		Time t4 = new Time();

		t1.setTime(1, 2, 3);
		System.out.println(t1.exibirHoraUniversal());
		System.out.println(t1.exibirHoraPadrao());

		t2.setTime(24, 20, 30);
		System.out.println(t2.exibirHoraUniversal());
		System.out.println(t2.exibirHoraPadrao());
		
		t3.setTime(12, 22, 32);
		System.out.println(t3.exibirHoraUniversal());
		System.out.println(t3.exibirHoraPadrao());
		
		t4.setTime(13, 2, 30);
		System.out.println(t4.exibirHoraUniversal());
		System.out.println(t4.exibirHoraPadrao());
	}
}
