package org.example;

import org.example.friend.CompFriend;
import org.example.friend.Friend;
import org.example.friend.UniFriend;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int cnt = 0;
        Friend friend[] = new Friend[10];

        friend[cnt++] = new UniFriend("학교친구", "010-1234-5678", "컴퓨터");
        friend[cnt++] = new CompFriend("회사친구", "010-9876-5432", "개발팀");

        System.out.println(Arrays.toString(friend));

        for (int i = 0; i < cnt; i++) {
            friend[i].showInfo();
            System.out.println();
        }
    }

}
