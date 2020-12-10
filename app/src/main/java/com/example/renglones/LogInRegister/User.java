package com.example.renglones.LogInRegister;

public class User {
    private int id;
    private String userName;
    private String password;
    private String email ;
    private int activo;
    private int scoregeografia ;
    private int scorehistoria ;
    private int scoredeportes ;
    private int scorecine ;
    private int scoreciencia ;
    private int scoretotal ;



    public User() {
    }

    public User(int id, String userName, String password, String email, int activo, int scoregeografia, int scorehistoria, int scoredeportes, int scorecine, int scoreciencia, int scoretotal) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.activo= activo;
        this.scoregeografia = scoregeografia;
        this.scorehistoria = scorehistoria;
        this.scoredeportes = scoredeportes;
        this.scorecine = scorecine;
        this.scoreciencia = scoreciencia;
        this.scoretotal = scoretotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScoregeografia() {
        return scoregeografia;
    }

    public void setScoregeografia(int scoregeografia) {
        this.scoregeografia = scoregeografia;
    }

    public int getScorehistoria() {
        return scorehistoria;
    }

    public void setScorehistoria(int scorehistoria) {
        this.scorehistoria = scorehistoria;
    }

    public int getScoredeportes() {
        return scoredeportes;
    }

    public void setScoredeportes(int scoredeportes) {
        this.scoredeportes = scoredeportes;
    }

    public int getScorecine() {
        return scorecine;
    }

    public void setScorecine(int scorecine) {
        this.scorecine = scorecine;
    }

    public int getScoreciencia() {
        return scoreciencia;
    }

    public void setScoreciencia(int scoreciencia) {
        this.scoreciencia = scoreciencia;
    }

    public int getScoretotal() {
        return scoretotal;
    }

    public void setScoretotal(int scoretotal) {
        this.scoretotal = scoretotal;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }



   /* @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }*/
}
