package edu.tiago.collections.operacoesbasicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;

public class ListaTarefaTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private ListaTarefa listaTarefa;

    @BeforeEach
    public void setUp() {
        listaTarefa = new ListaTarefa();
    }

    @Test
    public void deveriaObterNumeroTotalTarefas() {
        // Verifica se o número total de tarefas é 0 no início
        assertEquals(0, listaTarefa.obterNumeroTotalTarefas());

        // Adiciona uma tarefa e verifica se o número total de tarefas é 1
        listaTarefa.adicionarTarefa("Tarefa 1");
        assertEquals(1, listaTarefa.obterNumeroTotalTarefas());

        // Adiciona mais uma tarefa e verifica se o número total de tarefas é 2
        listaTarefa.adicionarTarefa("Tarefa 2");
        assertEquals(2, listaTarefa.obterNumeroTotalTarefas());

        // Remove uma tarefa e verifica se o número total de tarefas é 1
        listaTarefa.removerTarefa("Tarefa 1");
        assertEquals(1, listaTarefa.obterNumeroTotalTarefas());

        // Remove a última tarefa e verifica se o número total de tarefas é 0
        listaTarefa.removerTarefa("Tarefa 2");
        assertEquals(0, listaTarefa.obterNumeroTotalTarefas());
    }
}
