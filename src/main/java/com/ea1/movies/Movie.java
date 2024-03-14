package com.ea1.movies;

public class Movie {
  private int id;
  private String titulo;
  private int anho;
  private String director;
  private String genero;
  private String sinopsis;

  public Movie(int id, String titulo, int anho, String director, String genero, String sinopsis) {
    this.id = id;
    this.titulo = titulo;
    this.anho = anho;
    this.director = director;
    this.genero = genero;
    this.sinopsis = sinopsis;
  }

  public int getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public int anho() {
    return anho;
  }

  public String getDirector() {
    return director;
  }

  public String getGenero() {
    return genero;
  }

  public String getSinopsis() {
    return sinopsis;
  }
}
