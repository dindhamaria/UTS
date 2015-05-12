public class Robot {
        public int sensor;
        public int servo;
        public int power;

    public Robot(){
        sensor=4;
        System.out.println("Jumlah Sensor Robot :"+sensor);
    }
    }


    class Asimo09 extends Robot{
       public int sensor;
       public int camera;

       public Asimo09(int d, int i, int n, int a){
           sensor = d;
           servo = i;
            power = n;
           camera = a;
       }

       public void CetakSpesifikasi() {
           System.out.println("sensor asimo :"+sensor);
           System.out.println("jumlah servo : "+servo);
           System.out.println("kapasitas power : "+power);
           System.out.println("jumlah camera : "+camera+"\n");
       }
        public void Upgrade(int d){
            sensor=d;
            System.out.println("Asimo09 diupgrade dengan jumlah sensor : "+sensor);
        }
   }
