public class Main {
    public class Student {
        public String stID;
        public String stName;
        public String stClass;
        public String getStID() {
            return this.stID;
        }
        public String getStName() {
            return this.stName;
        }
        public String getStClass() {
            return this.stClass;
        }

        public Student(String stID, String stName, String stClass) {
            this.stID=stID;
            this.stName=stName;
            this.stClass=stClass;
        }
        public String getStudent() {
            getStID();
            getStName();
            getStClass();
            return null;
        }
        public void setStID(String id) {
            this.stID=stID;
        }
        public void setStName(String name) {
            this.stName=stName;
        }
        public void setStClass(String class1)  {
            this.stClass=stClass;
        }
        public String toString() {
            return stID +" "+ stName +" "+ stClass;
        }
    }
}