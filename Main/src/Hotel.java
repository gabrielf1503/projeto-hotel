import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.fazerReserva();
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.cancelarReserva();
    }

    public List<Quarto> getQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : quartos) {
            if (quarto.isAvailable()) {
                quartosDisponiveis.add(quarto);
            }
        }
        return quartosDisponiveis;
    }
}
