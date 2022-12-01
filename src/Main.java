import models.Group;
import models.Students;
import models.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Biplov",2030);
        Students s2 = new Students("Aswin",2031);
        Students s3 = new Students("Ashraya",2032);
        Students s4 = new Students("Aashutosh",2033);
        Students s5 = new Students("Asha",2034);
        Students s6 = new Students("Ankit",2035);
        Students s7 = new Students("Shubham",2036);
        Students s8 = new Students("Aaisma", 16);
        Students s9 = new Students("Anshu", 16);

        Team t1 = new Team("A",1);
        Team t2= new Team("B",2);
        Team t3= new Team("C",3);

        ArrayList<Students> TeamA = new ArrayList<Students>();
        TeamA.add(s1);
        TeamA.add(s2);
        TeamA.add(s3);

        ArrayList<Students> TeamB = new ArrayList<Students>();
        TeamB.add(s4);
        TeamB.add(s5);
        TeamB.add(s6);

        ArrayList<Students> TeamC = new ArrayList<Students>();
        TeamC.add(s7);
        TeamC.add(s8);
        TeamC.add(s9);



        ArrayList<Team> Ateam= new ArrayList<>();
        Ateam.add(t1);
        ArrayList<Team> bteam = new ArrayList<>();
        bteam.add(t2);
        ArrayList<Team> cteam = new ArrayList<>();
        cteam.add(t3);

        Group g1 =new Group("Lobuche",Ateam);
        Group g2= new Group("Khumbila",bteam);
    }
}

