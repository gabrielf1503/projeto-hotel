public class Quarto {
        private int numerodoQuarto;
        private TipodeQuarto tipodeQuarto;
        private boolean isAvailable;

        public Quarto(int numerodoQuarto, TipodeQuarto tipodeQuarto) {
            this.numerodoQuarto = numerodoQuarto;
            this.tipodeQuarto= tipodeQuarto;
            this.isAvailable = true;
        }

        public int getNumerodoQuarto() {
            return numerodoQuarto;
        }

        public TipodeQuarto getTipodeQuarto() {
            return tipodeQuarto;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }
    }
