public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Quarto quarto1 = new Quarto(101, TipodeQuarto.SOLTEIRO);
        Quarto quarto2 = new Quarto(102, TipodeQuarto.DUPLO);
        Quarto quarto3 = new Quarto(103, TipodeQuarto.SUITE);

        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);
        hotel.adicionarQuarto(quarto3);

        Hospede hospede1 = new Hospede("Gabriel", "Gabriel@example.com");
        Hospede hospede2 = new Hospede("Jane Smith", "jane@example.com");

        Reserva reserva1 = new Reserva(quarto1, hospede1, "2024-12-01", "2024-12-05");
        Reserva reserva2 = new Reserva(quarto2, hospede2, "2024-12-02", "2024-12-06");

        hotel.adicionarReserva(reserva1);
        hotel.adicionarReserva(reserva2);

        System.out.println("Quartos disponíveis: " + hotel.getQuartosDisponiveis().size());
    }
}

