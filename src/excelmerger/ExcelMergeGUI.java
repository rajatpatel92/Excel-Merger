/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excelmerger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Rajat
 */
public class ExcelMergeGUI extends javax.swing.JFrame {
    private int ERROR_MESSAGE;
    boolean flag=false;

    /**
     * Creates new form ExcelMergeGUI
     */
    public ExcelMergeGUI() {
        initComponents();
        this.jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jDialog2 = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog2.setTitle("About");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExcelMerger");

        jTextField1.setEditable(false);
        jTextField1.setText("Browse Files from here...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("Browse..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Excel Files to merge :");

        jLabel2.setText("Enter Row Number :");

        jLabel3.setText("Enter Column Number :");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jLabel6.setText("Type of operation :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition", "NoOperation(Append all cells)" }));

        jLabel7.setText("Source Cell Location : (Must be same on every sheet)");

        jLabel8.setText("Destination Cell Location:");

        jLabel9.setText("Enter Row Number :");

        jLabel10.setText("Enter Column Number :");

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);
        jTextField6.setText("Select Destination Folder...");
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jButton3.setText("Browse..");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Set Custom Destination");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4))
                                    .addComponent(jLabel5)))
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        FileFilter filter = new FileNameExtensionFilter("Excel Files only...", "xlsx");
        fileChooser.addChoosableFileFilter(filter);
        jProgressBar1.setValue(50);
        jProgressBar1.setStringPainted(true);
        int returnVal = fileChooser.showOpenDialog(jButton1);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] file = fileChooser.getSelectedFiles();
            for(int i=0; i<file.length; i++){
                path += file[i].getAbsolutePath()+";";
                System.out.println(path);
            }
            jTextField1.setText(path); 
            jProgressBar1.setValue(100);
            jProgressBar1.repaint();
            jLabel5.setVisible(true);
            jLabel5.setText("File Imported Successfully!!");
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if(this.path.equals("")||(this.jTextField6.getText().equals("Select Destination Folder..."))){
                throw new FileNotFoundException();
            }
        rowCount = Integer.parseInt(jTextField2.getText());
        columnCount = Integer.parseInt(jTextField3.getText());
        String operation = (String) jComboBox1.getSelectedItem();
        int rowDest=1;
        int columnDest=1;
        
        double[] processedData;
        jLabel5.setText("Processing....please wait!!");
        processedData = this.processCells(rowCount, columnCount, operation);
        try {
            File fileName = new File(destPath+"\\Result.xls");
            HSSFWorkbook workbook;
            HSSFSheet sheet;
            FileInputStream fileIn = null;
            FileOutputStream fileOut;
            if(fileName.exists()){
                System.out.println("It already exists");
                fileIn = new FileInputStream(fileName);
                workbook =  new HSSFWorkbook(fileIn);
                sheet = workbook.getSheetAt(0);
            }else{
                System.out.println("It doesnt already exists");
                FileOutputStream tempFOS=new FileOutputStream(fileName);
                workbook = new HSSFWorkbook();
                sheet = workbook.createSheet();
                workbook.write(tempFOS);
                tempFOS.close();
            }
            fileOut = new FileOutputStream(fileName);
            HSSFRow row;
            HSSFCell cell;
            if(this.flag){
                rowDest = Integer.parseInt(jTextField4.getText());
                columnDest = Integer.parseInt(jTextField5.getText());
                System.out.println("Used Destination Cell... Row : "+rowDest+" Column "+columnDest);
            }
            else{
                HSSFSheet tempsheet = workbook.getSheetAt(0);
                int destRowCount=0;
                for (Row temprow : tempsheet) {
                    for (Cell tempcell : temprow) {
                        destRowCount++;
                    }
                }
                rowDest=destRowCount+1;
                columnDest=1;
                System.out.println("Didnt Used Destination Cell... Row : "+rowDest+" Column "+columnDest);
            }
            //Destination Code Implementation following....
            if(processedData.length == 1){
                System.out.println("Row: "+rowDest+" Column: "+columnDest+" ProcessedData: "+processedData[0]);
                //try{
                    //row = sheet.getRow(0);
                    //System.out.println("Exited row Try");
                //}catch(NullPointerException ex){
                    //System.out.println("Entered row  catch");
                    row = sheet.createRow(0);
                //}
                
                
                
                
                cell = row.createCell(0);//Continue From Here....
                
                
                
                
                cell.setCellValue(processedData[0]);
            }else{
                for(int j=0; j<processedData.length; j++, rowDest++){
                    System.out.println("Row: "+rowDest+" Column: "+columnDest+" ProcessedData: "+processedData[j]);
                    row = sheet.createRow(rowDest-1);
                    cell = row.createCell(columnDest-1);
                    cell.setCellValue(processedData[j]);
                }
            }
            workbook.write(fileOut);
            fileOut.close();
            if(fileIn != null) fileIn.close();
            jProgressBar1.setValue(100);
            System.out.println("File Successfully written to : "+destPath+"\\Result.xls");
            jLabel5.setText("File Successfully written to : "+destPath+"\\Result.xls");
            
            JOptionPane.showMessageDialog(rootPane,"File Operation Successful!!");
            //jOptionPane1.setMessageType(jOptionPane1.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane,"File Result.xls is open somewhere\nClose it and try again.");
                Logger.getLogger(ExcelMergeGUI.class.getName()).log(Level.SEVERE, null, ex);
                /*jOptionPane1.setEnabled(true);
                jOptionPane1.setMessageType(jOptionPane1.ERROR_MESSAGE);
                jOptionPane1.setMessage("File is open somewhere. Please Close the file and try again.");
                jOptionPane1.setVisible(true);*/
            } catch (IOException ex) {
                Logger.getLogger(ExcelMergeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Enter Correct Values of Cell and Try Again..!!");
            this.jTextField2.setText("");
            this.jTextField3.setText("");
            if(this.flag){
                this.jTextField4.setText("");
                this.jTextField5.setText("");
            }
            else{
                this.jTextField4.setEditable(true);
                this.jTextField4.setText("");
                this.jTextField4.setEditable(false);
                this.jTextField5.setEditable(true);
                this.jTextField5.setText("");
                this.jTextField5.setEditable(false);
            }
        }catch(FileNotFoundException ex){
            if(this.path.equals("")){
                JOptionPane.showMessageDialog(rootPane,"Select File First..!!");
            }
            else if(this.jTextField6.getText().equals("Select Destination Folder...")){
                JOptionPane.showMessageDialog(rootPane,"Select Destination First..!!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        FileFilter filter = new FileNameExtensionFilter("Excel Files only...", "xlsx", "xls");
        fileChooser.addChoosableFileFilter(filter);
        jProgressBar1.setValue(50);
        jProgressBar1.setStringPainted(true);
        path="";
        int returnVal = fileChooser.showOpenDialog(jButton1);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] file = fileChooser.getSelectedFiles();
            System.out.println("1");
            for(int i=0; i<file.length; i++){
                path += file[i].getAbsolutePath()+";";
                System.out.println(path);
            }
            jTextField1.setText(path); 
            jProgressBar1.setValue(100);
            jProgressBar1.repaint();
            jLabel5.setVisible(true);
            jLabel5.setText("File Imported Successfully!!");
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fileChooser.showOpenDialog(jButton1);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            jTextField6.setText(file.getAbsolutePath()); 
            this.destPath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fileChooser.showOpenDialog(jButton1);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            jTextField6.setText(file.getAbsolutePath()); 
            this.destPath = file.getAbsolutePath();
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jTextField6MouseClicked

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        //jDialog2.setType(Type.POPUP);
        //jDialog2.setVisible(rootPaneCheckingEnabled);
        //jOptionPane1.add(jDialog2);
        //jOptionPane1.showMessageDialog(rootPane,"File Operation Successful!!");
        jOptionPane1.showMessageDialog(rootPane, "This utility is developed by :\n1. Rajat Patel\n2. Nikhil Menghani\n\nSpecial Thanks to Kuntesh Jani Sir to guide us.");
        jOptionPane1.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        System.out.println("Value of Flag Before: "+this.flag);
        this.jTextField4.setEditable(!this.flag);
        this.jTextField5.setEditable(!this.flag);
        this.flag=!this.flag;
        System.out.println("Value of Flag After: "+this.flag);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.jTextField1.setEditable(true);
        this.jTextField1.setText("Browse Files from here...");
        this.jTextField1.setEditable(false);
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        if(this.flag){
            this.jTextField4.setText("");
            this.jTextField5.setText("");
        }
        else{
            this.jTextField4.setEditable(true);
            this.jTextField4.setText("");
            this.jTextField4.setEditable(false);
            this.jTextField5.setEditable(true);
            this.jTextField5.setText("");
            this.jTextField5.setEditable(false);
        }
        this.jTextField6.setEditable(true);
        this.jTextField6.setText("Select Destination Folder...");
        this.jTextField6.setEditable(false);
        this.jLabel5.setText("");
        this.jLabel5.setVisible(false);
        System.out.println("Reset Executed");
    }//GEN-LAST:event_jButton4ActionPerformed

    private double[] processCells(int rowSrc, int columnSrc, String opType){
        jProgressBar1.setValue(10);
        jProgressBar1.setStringPainted(true);
        filePaths = path.split(";");
        int checkOp=1;
        //int checkOp = temp1;
        double temp[] = new double[filePaths.length];
        //double tempAdd = 0;
        for(int i=0; i<filePaths.length; i++){
            System.out.println(filePaths[i]);
            jProgressBar1.setValue((i+1)*10);
            try {
                FileInputStream file = new FileInputStream(new File(filePaths[i]));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet = workbook.getSheetAt(0);
                XSSFRow rowId = sheet.getRow(rowSrc-1);
                XSSFCell cell = rowId.getCell(columnSrc-1);
                jProgressBar1.setValue((i+1)*10+10);
                double cellValue = cell.getNumericCellValue();
                if(opType.equals("Addition")){
                    checkOp=1;
                }
                else if(opType.equals("NoOperation(Append all cells)")){
                    checkOp=2;
                }
                switch(checkOp){
                    case  1:
                        temp[0] += cellValue;
                        jProgressBar1.setValue((i+1)*10+20);
                        break;
                    case  2:
                        temp[i] = cellValue;
                        break;
                    default:
                        //yet to implement...
                }
                
            }catch (FileNotFoundException ex) {
                    Logger.getLogger(ExcelMergeGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ExcelMergeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jProgressBar1.setValue(70);
        switch (checkOp){
            case 1 : 
                double sendValue[] = new double[1];
                sendValue[0] = temp[0];
                return sendValue;
            case 2 :
                return temp;
        }
        return null;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcelMergeGUI().setVisible(true);
            }
        });
    }
    private String destPath = "";
    private String path = "";
    private int rowCount;
    private int columnCount;
    private String[] filePaths;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}
