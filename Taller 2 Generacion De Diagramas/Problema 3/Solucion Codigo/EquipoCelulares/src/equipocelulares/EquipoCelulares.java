package equipocelulares;
import java.util.ArrayList;
import java.util.List;

public class EquipoCelulares {


    public static void main(String[] args) {
        EquipoCelular celular1 = new EquipoCelular("Android 13", 6.5, 799.99, "00:1A:2B:3C:4D:5E", "356789012345678");
        EquipoCelular celular2 = new EquipoCelular("iOS 16", 6.1, 999.00, "A0:B1:C2:D3:E4:F5", "990000862471234");
        EquipoCelular celular3 = new EquipoCelular("Android 12", 6.8, 650.50, "11:22:33:44:55:66", "358899001122333");

        System.out.println("Información de Equipos Celulares:");
        System.out.println(celular1.getInformacionCompleta()); 
        System.out.println(celular2.getInformacionCompleta());
        System.out.println(celular3.getInformacionCompleta());

        celular1.setCosto(750.00);
        System.out.println("\nCosto actualizado para celular 1: " + celular1.getCosto());
        System.out.println("Nuevo IMEI para celular 2: " + celular2.getInformacionIMEI()); 
    }
}

class EquipoCelular {
    protected String sistemaOperativo;
    protected double tamanoPantalla;
    protected double costo;
    protected String direccionMac;
    protected String informacionIMEI;

    public EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costo, String direccionMac, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costo = costo;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamanoPantalla() {
        return this.tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDireccionMac() {
        return this.direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public String getInformacionIMEI() {
        return this.informacionIMEI;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }

   
    public String getInformacionCompleta() {
        return "SO: " + sistemaOperativo +
               ", Pantalla: " + tamanoPantalla +
               ", Costo: $" + costo +
               ", MAC: " + direccionMac +
               ", IMEI: " + informacionIMEI;
    }
}