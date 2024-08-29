//driver class

import java.util.Scanner;

public class karyawan {
  int id;
  String nama;
  double ipk;
  String alamat;
  String unit;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNama() {
    return this.nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public double getIpk() {
    return this.ipk;
  }

  public void setIpk(double ipk) {
    this.ipk = ipk;
  }

  public String getAlamat() {
    return this.alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getUnit() {
    return this.unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

    public karyawan() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
        alamat = "kosong";
        unit = "kosong";
       }
    public karyawan(int id, String nama, double ipk,String alamat, String unit) {
        this.id = id; this.nama = nama; this.ipk = ipk ; this.alamat = alamat ; this.unit = unit; 
       }
       public void print() {
        System.out.println("ID = "+ id);
        System.out.println("Nama = "+ nama);
        System.out.println("IPK = "+ ipk);
        System.out.println("Alamat = "+ alamat);
        System.out.println("unit = "+ unit);

        Scanner input = new Scanner(System.in);
        System.out.println("input nama siswa:");
        String nama = input.nextLine();
        System.out.println("input ID siswa:");
        int id = input.nextInt();
        System.out.println("inputkan ipk siswa:");
        double ipk = input.nextDouble();








        
              }
            
            
            
            
            
            
            
            
            }