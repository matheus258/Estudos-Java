package academy.devjava.maratonajava.javacore.Kenum.dominio;

public enum  TipoPagamento {
    DEBITO {
        @Override
        public double calcularValor(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularValor(double valor) {
            return valor * 0.05;
        }
    },
    PIX {
        @Override
        public double calcularValor(double valor) {
            return valor * 0.1;
        }
    };


    public double calcularValor(double valor){

        return valor;
    }

}