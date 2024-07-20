/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trab1_RafaelJardim;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Trab1_RafaelJardim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean vale;
       float td,tb,dir,dinss,sl,ir,inss,cf=0,vt,classe=0,sb,bf=0,sbase=0,va=472.47f; 
       do{
           try{ 
        String v =JOptionPane.showInputDialog("Informe o salario base");
        sbase = Float.parseFloat(v);
            vale = false;
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, "Valor Incorreto para o salario base");
               vale = true;
           }
           if(sbase<=0f){
            vale = true;   
           }
       }while(vale);
       if(JOptionPane.showConfirmDialog(null,"Possui filhos?","Paternidade",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            bf=187.75f;
        }
       do{
        try{ 
            vale = true;
            String c;
            c = JOptionPane.showInputDialog("Informe a classe funcional(c1,c2 ou c3)");
            if((c.equalsIgnoreCase("c1"))||c.equalsIgnoreCase("c2")||c.equalsIgnoreCase("c3")){
                vale = false;
            if(c.equalsIgnoreCase("c1")){
                classe=489.7f;
            }
            else if (c.equalsIgnoreCase("c2")){
                classe=731.67f;
            }
            else{
                classe=1223.31f;
            }
                     
        }
            else{
                JOptionPane.showMessageDialog(null, "Classe incorreta! Informe novamente.");
            }
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, "Classe incorreta! Informe novamente.");
               vale = true;
           }
       }while(vale);
       if (sbase<=1039f){
        vt = 285.83f;
       }
       else if ((sbase>1039f)&&(sbase<=1546.5f)){
        vt = 201.43f;
       }
       else if ((sbase>1546.5f)&&(sbase<=2143.56f)){
        vt = 185.71f;
       }
       else if ((cf>2143.56f)&&(cf<=3002.17f)){
        vt = 121.33f;
       }
       else if ((cf>3002.17f)&&(cf<=3702.29)){
        vt = 85.18f;
       }
       else {
        vt = 78.41f;
       }
       sb = sbase + va + bf + vt + classe;
       if(sbase+classe<=1499.15f){
           dir = 0;
       }
       else if((sbase+classe>1499.15f)&&(sbase+classe<=2146.75f)){
           dir = 7.5f;
       }
       else if((sbase+classe>2146.75f)&&(sbase+classe<=2995.7f)){
           dir = 15f;
       }
       else if((sbase+classe>2995.7f)&&(sbase+classe<=3441.16f)){
           dir = 22f;
       }
       else if((sbase+classe>3441.16f)&&(sbase+classe<=4543.11f)){
           dir = 24.5f;
       }
       else{
           dir = 28.5f;
       }
       ir = ((sbase+classe)*dir/100);
       if(sbase+classe<=1417.07f){
           dinss = 8f;
       }
       else if((sbase+classe>1417.07f)&&(sbase+classe<=2195.12f)){
           dinss = 9f;
       }
       else if((sbase+classe>2195.12f)&&(sbase+classe<=3396.11f)){
           dinss = 11f;
       }
       else{
           dinss = 14f;
       }
       inss = ((sbase+classe)*dinss/100);
       sl = sb - ir - inss;
       td=inss+ir;
       tb=va+vt+bf;
       JOptionPane.showMessageDialog(null, "I-Salario Bruto: " + sb 
               + "\nII-Desconto aplicado no IR: " + ir
               + "\nIII-Desconto aplicado no INSS: " + inss
               + "\nIV-Total de descontos aplicados: " + td
               + "\nV-Valor do benefício do vale alimentação: " + va
               + "\nVI-Valor do benefício de bonificação por filhos: " + bf
               + "\nVII-Valor do benefício do vale transporte: " + vt
               + "\nVIII-Total dos benefícios aplicados: " + tb
               + "\nIX-Valor da classe: " + classe
               + "\nX-Salário Líquido: "+sl);
    }
    }

