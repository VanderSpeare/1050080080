public class Main {
    public class Balo {
        public String stID;// mã balo (số hiệu)
        public String stName;// tên loại balo, nhà sản xuất
        public String stSide;//(trẻ em người lớn) M,L,XXL
        public String stType;//balo (nam/nữ)
        public String getStID() {
            return this.stID;
        }
        public String getStName() {
            return this.stName;
        }
        public String getStType() {
            return this.stType;
        }
        public String getStSide() {
            return this.stSide;
        }
        public Balo(String stID, String stName, String stType) {
            this.stID=stID;
            this.stName=stName;
            this.stType=stType;
            this.stSide=stSide;
        }
        public String getBalo() {
            getStID();
            getStName();
            getStType();
            getStSide();
            return null;
        }
        public void setStID(String id) {
            this.stID=stID;
        }
        public void setStName(String name) {
            this.stName=stName;
        }
        public void setStClass(String class1)  {
            this.stType=stType;
        }
        public String toString() {
            return stID +" "+ stName +" "+ stType +" "+ stSide ;
        }
    }
}