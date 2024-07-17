class Student {
    int rollno;

    void getnumber(int n) {
        rollno = n;
    }

    void putnumber() {
        System.out.println("Roll number: " + rollno);
    }
}

class Test extends Student {
    float part1, part2;

    void getmarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }

    void putmarks() {
        System.out.println("Marks obtained:");
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
    }
}

interface Sports {
    float sportwt = 6.0F;

    void putwt();
}

class Results extends Test implements Sports {
    float total;

    public void putwt() {
        System.out.println("Sports weight: " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        putnumber();
        putmarks();
        putwt();
        System.out.println("Total score: " + total);
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Results student1 = new Results();
        student1.getnumber(1234);
        student1.getmarks(27.5F, 33.0F);
        student1.display();
    }
}
