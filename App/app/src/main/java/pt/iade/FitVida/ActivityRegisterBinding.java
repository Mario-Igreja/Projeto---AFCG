package pt.iade.FitVida;

import android.view.LayoutInflater;
import android.view.View;

public class ActivityRegisterBinding {

    public View forward;
    public View back;
    public View registerButton1;

    public static ActivityRegisterBinding inflate(LayoutInflater layoutInflater) {
        // Lógica para inflar a view, se necessário
        // Exemplo: View view = layoutInflater.inflate(R.layout.activity_register, null);
        // Certifique-se de substituir R.layout.activity_register pelo layout real
        // Retorna uma instância de ActivityRegisterBinding
        return new ActivityRegisterBinding();
    }

    public int getRoot() {
        // Lógica para obter a raiz da view, se necessário
        // Exemplo: return view.getId();
        return 0; // Modifique conforme necessário
    }
}
