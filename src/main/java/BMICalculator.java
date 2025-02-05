

    public class BMICalculator {
        private String firstname;
        private String lastname;
        private int bodyHeight;
        private double bodyWeight;
        private char gender;



        public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.bodyHeight = bodyHeight;
            this.bodyWeight = bodyWeight;
            this.gender = gender;
        }


        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public int getBodyHeight() {
            return bodyHeight;
        }

        public double getBodyWeight() {
            return bodyWeight;
        }

        public char getGender() {
            return gender;
        }


        public void setBodyHeight(int bodyHeight) {
            this.bodyHeight = bodyHeight;

        }
        public void setBodyWeight(double bodyWeight) {
            this.bodyWeight = bodyWeight;
        }


        public double calculateBMI() {
            double bmi = bodyWeight / Math.pow(bodyHeight / 100.0, 2);
            return round(bmi);
        }


        public int calculateBMICategory() {
            double bmi = calculateBMI();

            if (gender == 'm') {
                if (bmi < 16.0) return -2;
                if (bmi < 18.5) return -1;
                if (bmi < 25.0) return 0;
                if (bmi < 35.0) return 1;
                return 2;
            } else { // gender == 'w'
                if (bmi < 15.0) return -2;
                if (bmi < 17.5) return -1;
                if (bmi < 24.0) return 0;
                if (bmi < 34.0) return 1;
                return 2;
            }
        }


        public String getBMICategoryName() {
            switch (calculateBMICategory()) {
                case -2: return "Sehr starkes Untergewicht";
                case -1: return "Untergewicht";
                case 0: return "Normalgewicht";
                case 1: return "Übergewicht";
                case 2: return "Sehr starkes Übergewicht";
                default: return "Unbekannt";
            }
        }


        private double round(double value) {
            return Math.round(value * 100.0) / 100.0;
        }
    }


