/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excelmerger;

/**
 *
 * @author Rajat
 */
public class InvalidCellValueException extends Exception{
    public InvalidCellValueException(String message)          
    {   
        super(message);         
    } 
}
