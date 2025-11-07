package Ventana;

import java.util.ArrayList;
import java.util.List;
import Ventana.Post;

public class Ventana {

    private List<Post> posts;

    public Ventana() {
        this.posts = posts;
    }

    public void publicar (String nombre, String usuario){
        System.out.println("Usuario: " + usuario);
        System.out.println(nombre);
    }

    public void publicar2 (String nombre, String texto){
        System.out.println("Usuario: " + nombre);
        System.out.println(texto);
    }


    public List<Post> agregarPost (Post post){
        posts.add(post);
        return posts;
    }


    public List<Post> buscarContenido (String contenido){
        List<Post> contenidoEncontrado = new ArrayList<>();
//        contenido = contenido.toLowerCase();
        for(Post post: this.posts){
            post.getTexto().toLowerCase().equalsIgnoreCase(contenido);

            contenidoEncontrado.add(post);
        }
        return contenidoEncontrado;
    }

    public List<Post> buscarUsuario (String usuario){
        List<Post> usuarioEncontrado = new ArrayList<>();
//        usuario = usuario.toLowerCase();
        for(Post post: this.posts){
            post.getTexto().toLowerCase().equalsIgnoreCase(usuario);
            usuarioEncontrado.add(post);
        }
        return usuarioEncontrado;
    }


}

//    public List<Post> buscarContenido (String contenido){
//    List<Post> contenidoEncontrado = new ArrayList<>();
//    String contenidoBuscado = contenido.toLowerCase();
//    for(Post post: this.posts){
//        post.getTexto().toLowerCase().equals(contenidoBuscado);
//        contenidoEncontrado.add(contenidoBuscado);
//    }
//
//    }