package zavdannya2;

public class ClassRoom extends ExcelentPupil{
    public ClassRoom(Schoolboy schoolboy1, Schoolboy schoolboy2, Schoolboy schoolboy3, Schoolboy schoolboy4) {
        Schoolboy[] classList = new Schoolboy[4];
        classList[0] = schoolboy1;
        classList[1] = schoolboy2;
        classList[2] = schoolboy3;
        classList[3] = schoolboy4;


        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println(" ");
        }
    }

    public ClassRoom(Schoolboy schoolboy1, Schoolboy schoolboy2, Schoolboy schoolboy3) {
        Schoolboy[] classList = new Schoolboy[3];
        classList[0] = schoolboy1;
        classList[1] = schoolboy2;
        classList[2] = schoolboy3;

        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println(" ");
        }



    }
    public ClassRoom(Schoolboy schoolboy1, Schoolboy schoolboy2) {
        Schoolboy[] classList = new Schoolboy[2];
        classList[0] = schoolboy1;
        classList[1] = schoolboy2;

        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println(" ");
        }



    }

}
