public class Elemento
{
    
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;

  
    public Elemento(String elTitulo, int tiempo)
    {
       this.titulo = elTitulo;
       this.duracion = tiempo;
       this.loTengo = false;
       this.comentario = "";
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    public String getComentario(){
        return this.comentario;
    }
    
    public void setLotengo(boolean tengo){
        this.loTengo = tengo;
    }
    
    public boolean getLotengo(){
        return this.loTengo;
    }
    
    public void print(){
        System.out.println("Elemento");
    }
    
    public String getTitulo(){
        return this.titulo;
    }

}
