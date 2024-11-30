import interfaces.ReservaOnline;

public class Reserva implements ReservaOnline {
    private Quarto quarto;
    private Hospede hospede;
    private String checkInDate;
    private String checkOutDate;

    public Reserva(Quarto quarto, Hospede hospede, String checkInDate, String checkOutDate) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public void fazerReserva() {
        if (quarto.isAvailable()) {
            quarto.setAvailable(false);
            System.out.println("Reserva feita por " + hospede.getName() + " no quarto " + quarto.getNumerodoQuarto());
        } else {
            System.out.println("Esse quarto não está disponível.");
        }
    }

    @Override
    public void cancelarReserva() {
        quarto.setAvailable(true);
        System.out.println("Reserva foi cancelada por " + hospede.getName());
    }
}
