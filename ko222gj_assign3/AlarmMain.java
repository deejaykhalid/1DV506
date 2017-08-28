package ko222gj_assign3;

public class AlarmMain {

	public static void main(String[] args) {
		AlarmClock ac = new AlarmClock(23, 48);
		ac.displayTime();
		ac.setAlarm(6, 15);
		int i = 0;
		while (i < 500){
			ac.timeTick();
			i += 1;
		}
		ac.displayTime();

	}

}
