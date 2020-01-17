/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procodebaou.passgen;
import java.util.Random;
import java.security.SecureRandom;
/**
 *
 * @author Boris
 */
public class passgenAPP extends javax.swing.JFrame { 
    private int[] elems={10,0,0,0,0};//LENGTH - ESPECIALES (1,0) - Mayus (1,0) - NUMEROS (1,0)
    private String password="";
    private int[] strmin={97,122}; //minimo maximo ascii decimal minusculas
    private int[] strmay={65,90};//minimo maximo ascii decimal mayuscula
    private int[] strNumeros={48,57};
    
    //Numero Aleatorio para selecionar caracter del array mediante numero aleatorio
    // La clase SecureRandom trabaja con algoritmos como el SHA1PRNG de Sun, que cumplen con los requerimientos del RFC 1750 
    private String NumeroAleatorio(){
        String numero=null;
        int aleatorioElems=(int) (Math.random()*9)+1;
        numero=""+aleatorioElems;
        return numero;
    }
    private String minusculasAleatorio(){
         String[] digitosLista={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","z"};
        int aleatorioElems=(int) (Math.random()*digitosLista.length);
        System.out.println("decimal: "+aleatorioElems+" str: "+digitosLista[aleatorioElems]);
        return digitosLista[aleatorioElems];
    }
    private String mayusculasAleatorio(){
        String[] digitosLista={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int aleatorioElems=(int) (Math.random()*digitosLista.length);
        System.out.println("decimal: "+aleatorioElems+" str: "+digitosLista[aleatorioElems]);
        return digitosLista[aleatorioElems];
    }
    private String especialesAleatorio(){
        String[] digitosLista={"#","@","/","=",".","%","&","!","(",")","=","-"};
        int aleatorioElems=(int) (Math.random()*digitosLista.length);
        return digitosLista[aleatorioElems];
        
    }
    private void GenerarPASSWORD(){
        password="";
        while(password.length()<elems[0]){
           int aleatorioTipoDato=(int)(Math.random()*4)+1;
            if(elems[aleatorioTipoDato]==1){
             if(aleatorioTipoDato==1){
                 password=password+especialesAleatorio();
             }else if(aleatorioTipoDato==2){
                 password=password+mayusculasAleatorio();
             }else if(aleatorioTipoDato==3){
                password= password+NumeroAleatorio();
             }else if(aleatorioTipoDato==4){
                 password= password+minusculasAleatorio();
             }
            }else{
                 password= password+minusculasAleatorio();
            }
           
        }
        System.out.println("password generada: "+password);
        inputPASSWORD.setText(password);
    }
    public passgenAPP() {   
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputPASSWORD = new javax.swing.JTextField();
        BTNgenerar = new javax.swing.JButton();
        BTNnumeros = new javax.swing.JRadioButton();
        BTNmayus = new javax.swing.JRadioButton();
        BTNespeciales = new javax.swing.JRadioButton();
        BTNslider = new javax.swing.JSlider();
        lengthINPUT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setText("PASSGEN");

        inputPASSWORD.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        BTNgenerar.setText("Generar");
        BTNgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNgenerarActionPerformed(evt);
            }
        });

        BTNnumeros.setText("numeros");
        BTNnumeros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BTNnumerosStateChanged(evt);
            }
        });

        BTNmayus.setText("Mayus");
        BTNmayus.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BTNmayusStateChanged(evt);
            }
        });

        BTNespeciales.setText("especiales");
        BTNespeciales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BTNespecialesStateChanged(evt);
            }
        });

        BTNslider.setMajorTickSpacing(1);
        BTNslider.setMaximum(40);
        BTNslider.setValue(10);
        BTNslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BTNsliderStateChanged(evt);
            }
        });

        lengthINPUT.setEditable(false);
        lengthINPUT.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(BTNespeciales)
                        .addGap(18, 18, 18)
                        .addComponent(BTNmayus)
                        .addGap(6, 6, 6)
                        .addComponent(BTNnumeros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(BTNslider, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNgenerar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BTNgenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNespeciales, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNmayus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNnumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lengthINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNslider, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BTNsliderStateChanged
        // TODO add your handling code here:
        elems[0]=BTNslider.getValue();
        lengthINPUT.setText(""+BTNslider.getValue());
    }//GEN-LAST:event_BTNsliderStateChanged

    private void BTNespecialesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BTNespecialesStateChanged

        if(BTNespeciales.isSelected()){
            elems[1]=1;
        }else{
            elems[1]=0;
        }
    }//GEN-LAST:event_BTNespecialesStateChanged

    private void BTNmayusStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BTNmayusStateChanged
        // TODO add your handling code here:
        if(BTNmayus.isSelected()){
            elems[2]=1;
        }else{
            elems[2]=0;
        }
    }//GEN-LAST:event_BTNmayusStateChanged

    private void BTNnumerosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BTNnumerosStateChanged
        // TODO add your handling code here:
        if(BTNnumeros.isSelected()){
            elems[3]=1;
        }else{
            elems[3]=0;
        }
    }//GEN-LAST:event_BTNnumerosStateChanged

    private void BTNgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNgenerarActionPerformed
        // TODO add your handling code here:
        password="";
        GenerarPASSWORD();
    }//GEN-LAST:event_BTNgenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BTNespeciales;
    private javax.swing.JButton BTNgenerar;
    private javax.swing.JRadioButton BTNmayus;
    private javax.swing.JRadioButton BTNnumeros;
    private javax.swing.JSlider BTNslider;
    private javax.swing.JTextField inputPASSWORD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lengthINPUT;
    // End of variables declaration//GEN-END:variables
}
