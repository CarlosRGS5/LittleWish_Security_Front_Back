package pe.edu.upc.aaw.littlewishproject.dtos;

public class ReportePuntuacionDTO {

    private int userId;
    private String userName;
    private int nroPuntuacion;
    private int sumPuntuacion;
    private float avgPuntuacion;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNroPuntuacion() {
        return nroPuntuacion;
    }

    public void setNroPuntuacion(int nroPuntuacion) {
        this.nroPuntuacion = nroPuntuacion;
    }

    public int getSumPuntuacion() {
        return sumPuntuacion;
    }

    public void setSumPuntuacion(int sumPuntuacion) {
        this.sumPuntuacion = sumPuntuacion;
    }

    public float getAvgPuntuacion() {
        return avgPuntuacion;
    }

    public void setAvgPuntuacion(float avgPuntuacion) {
        this.avgPuntuacion = avgPuntuacion;
    }
}
