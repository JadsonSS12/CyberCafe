/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cybercafe;

/**
 *serve para comunicar-se com o BD e atualizar as informacoes do
 * metodo consultar do Usuario
 * @author Usuário
 */
public class Recepcionista implements UsuarioInterface {
    
    private String nome;
    
    public void  chamarTecnico(){
        
    }
    public void consultar(){
        
    }
    
    public void trocarMaquina(){
        
    }
    
    @Override
    public void adicionarTempo(){

    }

    @Override
    public void pedirLanche() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void indicarProblemas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encerrarSessao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
