/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasefun;

/**
 *
 * @author virk04
 */
public class RunMyShit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DB_Connection con = new DB_Connection();
        con.connect();
    }
    
}
