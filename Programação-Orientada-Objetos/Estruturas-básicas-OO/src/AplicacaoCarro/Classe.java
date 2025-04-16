package AplicacaoCarro;

    
        // Criando um objeto do tipo Carro
        class Carro {
            //atributos
            String cor;
            String modelo;
            int capacidadeTanque;

            Carro(){

            }

            Carro(String cor, String modelo, int capacidadeTanque){
                this.cor = cor;
                this.modelo = modelo;
                this.capacidadeTanque = capacidadeTanque;
                
            }

            //construtor
            void setCor(String cor){
                this.cor = cor;
            }

            String getCor(){
                return cor;
            }

            void setModelo(String modelo){
                this.modelo = modelo;
            }

            String getModelo(){
                return modelo;
            }

            //get e set tanque

            //set
            void setCapacidadeTanque(int capacidadeTanque){
                this.capacidadeTanque = capacidadeTanque;
            }

            //get
            int getCapacidadeTanque(){
                return capacidadeTanque;
            }

            //método do total para encher o tanque

            double totalValorTanque(double valorCombustível){
                return capacidadeTanque * valorCombustível;
            }
        }


