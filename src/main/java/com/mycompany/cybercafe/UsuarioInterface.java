/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cybercafe;

/**
 *
 * @author Usuário
 */
public interface UsuarioInterface {
    public abstract void adicionarTempo();
    public abstract void pedirLanche();
    public abstract void consultar();
    public abstract void indicarProblemas();
    public abstract void trocarMaquina();
    public abstract void encerrarSessao();
    //a interface será override em Usuario;
    //adicionarTempo também terá override em Maquina;
}
