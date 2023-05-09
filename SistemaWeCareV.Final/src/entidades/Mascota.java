package entidades;

public class Mascota {
    
    // Atributos
    private int mascotaID;
    private int clienteID;
    private int tipomascotaID;
    private String nombrePaciente;
    private int sexo;
    private int edad;
    private String especie;
    private String raza;
    private String color;
    private String fechaNacimiento;

    
    // Constructores
    public Mascota() {
    }

    public Mascota(int mascotaID, int clienteID, int tipomascotaID, String nombrePaciente, int sexo, int edad, String especie, String raza, String color, String fechaNacimiento) {
        this.mascotaID = mascotaID;
        this.clienteID = clienteID;
        this.tipomascotaID = tipomascotaID;
        this.nombrePaciente = nombrePaciente;
        this.sexo = sexo;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
    }
    
   
    // Metodos especificos de los atributos
    
    @Override
    public String toString(){
        String id = Integer.toString(this.mascotaID);
        return id;
    }
    
    public int getMascotaID() {
        return mascotaID;
    }

    public void setMascotaID(int mascotaID) {
        this.mascotaID = mascotaID;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getTipomascotaID() {
        return tipomascotaID;
    }

    public void setTipomascotaID(int tipomascotaID) {
        this.tipomascotaID = tipomascotaID;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
