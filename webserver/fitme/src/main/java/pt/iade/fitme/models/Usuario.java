package pt.iade.fitme.models;
import jakarta.persistence.*;
import pt.iade.fitme.enums.gender;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
// User.java
public class Usuario {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(name="usu_id")
   private int id;
   @Column(name="usu_nome")
   private String UsuNome;
   @Column(name="usu_email")
   private String UsuEmail;
   @Column(name="usu_senha")
   private String UsuSenha;
   @Column(name="usu_genero")
   private String UsuGenero;
   @Column(name="usu_altura")
   private float UsuAltura;
   @Column(name="usu_peso")
   private float UsuPeso;
   @Column(name="usuariocol")
   private String Usuariocol;
   @Column(name="usu_aniversario")
   private LocalDate UsuAniversario;
   public Usuario() {



   }

   public int getId() {
      return id;
   }



   public String getUsuNome() {
      return UsuNome;
   }

   public void setUsuNome(String usuNome) {
      UsuNome = usuNome;
   }

   public String getUsuEmail() {
      return UsuEmail;
   }

   public void setUsuEmail(String usuEmail) {
      UsuEmail = usuEmail;
   }

   public String getUsuSenha() {
      return UsuSenha;
   }

   public void setUsuSenha(String usuSenha) {
      UsuSenha = usuSenha;
   }

   public String getUsuGenero() {
      return UsuGenero;
   }

   public void setUsuGenero(String usuGenero) {
      UsuGenero = usuGenero;
   }

   public float getUsuAltura() {
      return UsuAltura;
   }

   public void setUsuAltura(float usuAltura) {
      UsuAltura = usuAltura;
   }

   public float getUsuPeso() {
      return UsuPeso;
   }

   public void setUsuPeso(float usuPeso) {
      UsuPeso = usuPeso;
   }

   public String getUsuariocol() {
      return Usuariocol;
   }

   public void setUsuariocol(String usuariocol) {
      Usuariocol = usuariocol;
   }

   public LocalDate getUsuAniversario() {
      return UsuAniversario;
   }

   public void setUsuAniversario(LocalDate usuAniversario) {
      UsuAniversario = usuAniversario;
   }
}
