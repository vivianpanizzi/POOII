package br.com.ada.pooii.aula6;

public class ExemploSolid {
}
//public class User {
//    private String name;
//    private String email;
//    private String cpf;
//
//    // Métodos de acesso (getters/setters)
//
//    public void saveUser() {
//        // Salva o usuário no banco de dados
//        // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
//    }
//
//    public void sendEmail(String message) {
//        // Envia um e-mail para o usuário
//        // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
//    }
//
//    public void sendSMS(String message) {
//        // Envia um SMS para o usuário
//        // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
//    }
//
//    public boolean isValidCPF() {
//        // Faz o calculo para verificar se o CPF é valido
//        // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
//        return false;
//    }
//
//}

//Arrumando o exemplo anterior teremos:

/* class UserArrumado {
    private String Nome;
    private String email;

}

class UserRepository {
    public void saveUser (UserArrumado userArrumado){
        //Salva no banco de dados
    }

}

class EmailService {
    public void sendEmail(UserArrumado userArrumado, String message){
        //Envia um e-mail para o usuário
    }
}

class SMSService {
    public void sendSMS(UserArrumado userArrumado, String message) {
        //Envia um sms para o usuário
    }
}

class CPFService {
    public boolean isValidCPF (String cpf) {
        // Faz o calculo para verificar se o cpf está correto
        return false;
    }
}
 */