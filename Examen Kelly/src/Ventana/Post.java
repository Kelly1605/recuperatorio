package Ventana;

public class Post {

    private String texto;
    private String usuario;
    private int likes;

    public Post(String texto, String usuario, int likes) {
        this.texto = texto;
        this.usuario = usuario;
        this.likes = likes;
    }

    public String getTexto() {
        return texto;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getLikes() {
        return likes;
    }

    public String verPost(){
        return "Usuario: " + getUsuario() + ", texto: " + getTexto() + ", likes: " + getLikes();
    }
}
