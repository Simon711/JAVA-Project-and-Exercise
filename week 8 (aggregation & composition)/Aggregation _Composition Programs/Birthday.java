public class Birthday{
        int year,month,day;

        public Birthday(int y,int m,int d){
            year=y;
            month=m;
            day=d;
        }

        public String toString(){
           return String.format("%s-%s-%s", year,month,day);

        }
    }
