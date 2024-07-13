public class PhoneClass {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        p1.model_no = 1;
        p1.brand_name = "samsung";
        p1.setImei_no(123);
        p1.setSerial_Number(1234);
        System.out.println(p1.getSerial_Number());
        p1.device_info();

        p2.model_no = 2;
        p2.brand_name = "apple";
        p2.setImei_no(321);
        p2.setSerial_Number(4321);
        System.out.println(p2.getSerial_Number());
        p2.device_info();
    }
}

class Phone {
    private int imei_no, serial_number;
    public int model_no;
    public String brand_name;

    void setImei_no(int imeiNumber) {
        imei_no = imeiNumber;
    }

    void setSerial_Number(int serialNumber) {
        serial_number = serialNumber;
    }

    int getSerial_Number() {
        return serial_number;
    }

    void device_info() {
        System.out.println("modelNumber " + model_no + "\nimei_no " + imei_no + "\nserialNumber " + serial_number);
    }

}