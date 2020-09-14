package com.example.meserete_haymanote3;

public class person {
    String id;
    String Ful_name;
    String u_name;
    String password;
    String age;
    String yeabnete_tmhret_level;
    String yemedebegna_tmheret_level;
    public person(){

    }

    public person( String ful_name, String u_name, String password, String age) {

        Ful_name = ful_name;
        this.u_name = u_name;
        this.password = password;
        this.age = age;
    }

    public person(String u_name, String yeabnete_tmhret_level, String yemedebegna_tmheret_level) {
        this.u_name = u_name;
        this.yeabnete_tmhret_level = yeabnete_tmhret_level;
        this.yemedebegna_tmheret_level = yemedebegna_tmheret_level;
    }

    public person(String u_name, String password) {
        this.u_name = u_name;
        this.password = password;
    }



    public String getU_name() {
        return u_name;
    }

    public String getPassword() {
        return password;
    }

    public String getAge() {
        return age;
    }

    public String getYeabnete_tmhret_level() {
        return yeabnete_tmhret_level;
    }

    public String getYemedebegna_tmheret_level() {
        return yemedebegna_tmheret_level;
    }
}
