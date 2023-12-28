package kr.huni;

import java.io.IOException;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) throws IllegalArgumentException, IOException {
    Scanner scanner = new Scanner(System.in);
    log.info("백준 문제 번호를 입력해 주세요: ");
    int number = scanner.nextInt();

    BojStarter bojStarter = new BojStarter(number);
    bojStarter.start();

    scanner.close();
  }

}