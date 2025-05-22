package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("携帯電話の番号を入力してください。 > ");
    String input = scanner.next();
    String normalizedInput = Normalizer.normalize(input, Normalizer.Form.NFKC);

    if (normalizedInput.matches("^0[789]0-[0-9]{4}-[0-9]{4}$")) {
      System.out.println(normalizedInput + " は有効な携帯番号。");
    } else if (normalizedInput.matches("0[789]0[0-9]{8}$")) {
      System.out.println(normalizedInput + " は無効な携帯番号。");
      System.out.println("携帯電話の番号は-(ハイフン)区切りで入力してください。");
    } else {
      System.out.println(normalizedInput + " は無効な携帯番号。");
    }
  }
}