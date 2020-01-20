public class Student {

        String Name;
        int Mark;

        public Student(String name, int mark) {
            Name = name;
            Mark = mark;
        }

        @Override
        public String toString() {
            return "(" + Name + "," + Mark + ")";
        }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
            return Name;
        }

    public void setMark(int mark) {
        Mark = mark;
    }

    public int getMark() {
        return Mark;
    }
}
