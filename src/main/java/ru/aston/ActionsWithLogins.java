package ru.aston;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActionsWithLogins {
    public static List<String> beginWithF() {
        List<String> logins = new ArrayList<>();
        String login;
        Scanner in = new Scanner(System.in);
        System.out.print("Input login: ");
        login = in.nextLine();
        while (!login.equals("")){
            logins.add(login);
            login = in.nextLine();
        }
        return logins.stream().filter(l -> l.charAt(0) == 'f').collect(Collectors.toList());
    }

}
