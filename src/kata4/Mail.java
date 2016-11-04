
package kata4;


public class Mail {
    
    
    private final String mail;
    public Mail(String mail){
        this.mail=mail;
    }
    public String Mail(){
        return mail;
    }
    public String getDoMain(){
        return mail.split("@")[1];
    }
}
