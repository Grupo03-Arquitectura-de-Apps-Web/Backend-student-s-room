package pe.edu.upc.studentsroom.dtos;

public class DisponiblesDTO {
    private String city;
    private String district;

    private int countDispo;

    public DisponiblesDTO(String city, String district, int countDispo) {
        this.city = city;
        this.district = district;
        this.countDispo = countDispo;
    }
    public DisponiblesDTO(){

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCountDispo() {
        return countDispo;
    }

    public void setCountDispo(int countDispo) {
        this.countDispo = countDispo;
    }



}
