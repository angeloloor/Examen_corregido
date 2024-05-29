class Hotel{
    private int codigo;
    private String nombre;
    private double pago;

    public Hotel(int codigo, String nombre, double pago){
        this.codigo = codigo;
        this.nombre = nombre;
        this.pago = pago;
    }

    public Hotel() {
        this.codigo = 0;
        this.nombre = null;
        this.pago = 0.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public void imprimirHotel(){
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Pago: " + pago);
    }

}

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(1, "Hotel pepe", 100.0);
        Hotel hotel2 = new Hotel(2, "Hotel juan", 150.0);
        Hotel hotel3 = new Hotel(3, "Hotel pedro", 200.0);
        Hotel hotel4 = new Hotel(4, "Hotel angel", 250.0);
        Hotel hotel5 = new Hotel(5, "Hotel fe", 300.0);


        Hotel hotel6 = new Hotel();
        Hotel hotel7 = new Hotel();

        hotel6.setCodigo(6);
        hotel6.setNombre("Hotel carlos");
        hotel6.setPago(350.0);

        hotel7.setCodigo(7);
        hotel7.setNombre("Hotel buenafe");
        hotel7.setPago(400.0);


        Hotel[] hoteles = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7};
        System.out.println("Lista de Hoteles:");
        for (Hotel hotel : hoteles) {
            hotel.imprimirHotel();
        }


        hotel3.setCodigo(0);
        hotel3.setNombre(null);
        hotel3.setPago(0.0);

        hotel4.setCodigo(0);
        hotel4.setNombre(null);
        hotel4.setPago(0.0);

        hotel5.setCodigo(0);
        hotel5.setNombre(null);
        hotel5.setPago(0.0);

        System.out.println("\nHoteles modificados con valores NULL:");
        hotel3.imprimirHotel();
        hotel4.imprimirHotel();
        hotel5.imprimirHotel();
    }
}
