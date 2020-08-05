package Package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer[] Computers = new Computer[3];
		Computers[0] = new Computer();
		Computers[0].idInteger = 1;
		Computers[0].nameString = "CPU Home";
		Computers[0].cpuString = "i3 3100";
		Computers[0].memoryInteger = 4;
		Computers[0].integratedGragicsBoolean = true;
		
		Computers[1] = new Computer();
		Computers[1].idInteger = 2;
		Computers[1].nameString = "CPU Standart";
		Computers[1].cpuString = "i5 6400";
		Computers[1].memoryInteger = 8;
		Computers[1].integratedGragicsBoolean = true;
		
		Computers[2] = new Computer();
		Computers[2].idInteger = 3;
		Computers[2].nameString = "CPU Game";
		Computers[2].cpuString = "i7 8800";
		Computers[2].memoryInteger = 16;
		Computers[2].integratedGragicsBoolean = false;
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("ой [%d]:\n id:%d \n name:%s \n cpu:%s, \n memory:%d \n grafics:%b \n", i, Computers[i].idInteger, Computers[i].nameString, Computers[i].cpuString, Computers[i].memoryInteger, Computers[i].integratedGragicsBoolean);
		}
	}
	
}
