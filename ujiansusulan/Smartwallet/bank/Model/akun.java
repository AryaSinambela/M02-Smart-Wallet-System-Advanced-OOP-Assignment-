package bank.model;

import bank.model.akun;
import java.util.ArrayList;

// 12S24017 - Arya Sinambela

 public class akun{
    private String nama_akun;
    private string Username;
    private String saldo;
    private double balance = 0.0;
    private String tipe_akun;

 ArrayList<Transfer> DaftarTransaction;

    public Account(String nama _akun, String username, String saldo, String tipe_akun){
        this.String nama_akun;
        this.string Username;
        this.String saldo;
        this.String tipe_akun;
        this.DaftarTransaction = new ArrayList<>();

        System.out.println(this.nama_akun + "|" + this.username + "|" + this.saldo +"|" + this.tipe_akun);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   public String getnama_akun() {
        return nama_akun;
    }

    public String getsaldo() {
        return saldo;
    }

    public double getBalance() {
        return balance;
    }

    public void settransfer(Transfer transfer){
        this.DaftarTransaction.add(taransaction); 
}   

public void displayakun(){
        for(int i = 0 ; i < DaftarTransaction.size(); i++){
            this.balance = this.balance+ Double.parseDouble(DaftarTransaction.get(i).getsaldo());
        }
        if(this.balance < 0){
            this.balance = 0.0;
        }
        System.out.println(this.nama_akun + "|" + this.username + "|" + this.balance);
    }

