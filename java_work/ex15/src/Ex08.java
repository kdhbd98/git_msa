public class Ex08 {
    public static class Student {
        private int kor;
        private int eng;
        private int math;

        public Student(int kor, int eng, int math) {
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public int getKor() {
            return kor;
        }

        public void setKor(int kor) {
            this.kor = kor;
        }

        public int getEng() {
            return eng;
        }

        public void setEng(int eng) {
            this.eng = eng;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getTotal() {
            return kor + eng + math;
        }

        public float getAverage() {
            int total = getTotal();
            float average = total / 3.0f;
            return Math.round(average * 100) / 100.0f;
        }

        public static void main(String[] args) {
            Student student = new Student(90, 85, 88);
            System.out.println("Total: " + student.getTotal());
            System.out.println("Average: " + student.getAverage());
        }
    }

}
