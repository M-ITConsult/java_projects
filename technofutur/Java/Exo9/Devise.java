package technofutur.Java.Exo9;
    public enum Devise {
        EURO(0.96),DOLLAR(1.05);

        private final double taux;

        Devise(double v) {
            this.taux = v;
        }

        public double apply(double entry) {
            return entry * this.taux;
        }
    }

