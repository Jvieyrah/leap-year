package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

/**
 * author joao.
 *
 */
public class AnoBissexto {

  public boolean identificarAnoBissexto(int ano) {
    Year containerYear = Year.of(ano);
    return containerYear.isLeap();
  }

  /**
   * data e return.
   */
  public int identificarProximoAnoBissexto(String data) {
    String fortmatodata = "dd/MM/yyyy";
    DateTimeFormatter formadadorData = DateTimeFormatter.ofPattern(fortmatodata);
    LocalDate imputedDate = LocalDate.parse(data, formadadorData);
    int ano = imputedDate.getYear();

    while (!identificarAnoBissexto(ano)) {
      ano++;
    }
    return ano;
  }

  /**
   * paramargs.
   */
  public static void main(String[] args) {
    AnoBissexto finder = new AnoBissexto();
    String inputDate = "14/08/2023";
    int nextLeapYear = finder.identificarProximoAnoBissexto(inputDate);
    System.out.println("The next leap year after " + inputDate + " is: " + nextLeapYear);
  }
}


