package com.company;


public class AppData {
    private String header;
    private String data;

    AppData(String header, String data) {
        this.header = header;
        this.data = data;
    }


    public void setHeader (String header){
        this.header = header;
    }
    public void  setData (String data){
        this.data = data;
    }

    public CharSequence getHeader (String header){
        return header;
    }
    public String getData (String data){
        return data;
    }
    @Override
    public String toString () {
        return "Название заголовка: " + header + " Дата: " + data;
    }
}
