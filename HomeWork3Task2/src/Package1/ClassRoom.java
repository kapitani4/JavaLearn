package Package1;

import java.util.ArrayList;

public class ClassRoom {
    
    ArrayList<Pupil> classRoomArrayList = new ArrayList<Pupil>();
    public ClassRoom(Pupil ...pupils) {
        for (int i = 0; i < pupils.length; i++) {
            classRoomArrayList.add(pupils[i]);
        }
    }
	public static void main(String[] args) {
	    Pupil pupil1 = new BadPupil();
	    Pupil pupil2 = new GoodPupil();
	    Pupil pupil3 = new GoodPupil();
	    Pupil pupil4 = new ExcelentPupil();
	    ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
	    for (Pupil onePupil:classRoom.classRoomArrayList) {
            System.out.println("\nThis pupil: \n");
	        onePupil.study();
            onePupil.read();
            onePupil.write();
            onePupil.relax();
        }
    }
}


