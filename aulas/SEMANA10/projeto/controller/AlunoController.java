

import exception.ValidacaoException;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, double nota) throws ValidacaoException {
        validarNome(nome);
        validarNota(nota);

        Aluno aluno = new Aluno(nome, nota);
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    private void validarNome(String nome) throws ValidacaoException {
        if (nome == null || nome.isBlank()) {
            throw new ValidacaoException("O nome do aluno é obrigatório.");
        }
    }

    private void validarNota(double nota) throws ValidacaoException {
        if (nota < 0 || nota > 10) {
            throw new ValidacaoException("A nota deve estar entre 0 e 10.");
        }
    }
}