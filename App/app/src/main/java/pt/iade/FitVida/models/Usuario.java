package pt.iade.FitVida.models;

import java.time.LocalDate;

import pt.iade.FitVida.Enum.gender;

public class Usuario {

    private int id;

    private String UsuNome;

    private String UsuEmail;

    private String UsuSenha;

    private gender UsuGenero;

    private float UsuAltura;

    private float UsuPeso;

    private String Usuariocol;

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

    public gender getUsuGenero() {
        return UsuGenero;
    }

    public void setUsuGenero(gender usuGenero) {
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
