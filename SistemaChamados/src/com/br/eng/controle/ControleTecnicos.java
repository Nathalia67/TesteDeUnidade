package com.br.eng.controle;

import com.br.eng.Persistencia.TecnicoDAO;
import com.br.eng.apresentacao.TelaCadastroTecnico;
import com.br.eng.entidade.Tecnico;

/**
 *
 * @author 31404898
 */
public class ControleTecnicos implements IControlador {

    private TelaCadastroTecnico telaCadastroTecnico;
    private TecnicoDAO tecnicoDAO;

    public ControleTecnicos() {

        this.tecnicoDAO = new TecnicoDAO();

    }

    @Override
    public Tecnico inserir(long n, String nome) {
        Tecnico tec = new Tecnico(nome, n);
        tecnicoDAO.put(tec);
        return tec;
    }

    public void cadastrarTecnico() {
        this.telaCadastroTecnico = new TelaCadastroTecnico(this);
        this.telaCadastroTecnico.setVisible(true);
    }

    public void fecharTelaTecnico() {
        this.telaCadastroTecnico.setVisible(false);
    }

}
