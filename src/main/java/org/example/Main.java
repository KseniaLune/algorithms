package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = "+now);

        MinutePlus minutePlus = new MinutePlus(3L);
        LocalDateTime after = now.plusMinutes(minutePlus.getMinute());
        System.out.println("after = "+after);

        LocalDateTime access = now.plusSeconds(30);
        LocalDateTime notAccess = now.plusHours(1);
        System.out.println("access time = "+access);
        System.out.println("not access time = "+notAccess);

        if(access.isBefore(after))
            System.out.println("access is before after");

        if(access.isAfter(after))
            System.out.println("access is after after");

        if(notAccess.isBefore(after))
            System.out.println("notAccess is before after");

        if(notAccess.isAfter(after))
            System.out.println("notAccess is after after");



    }
    static class MinutePlus{
        private long minute = 10L;

        public MinutePlus(long minute) {
            this.minute = minute;
        }

        public long getMinute() {
            return minute;
        }

        public void setMinute(long minute) {
            this.minute = minute;
        }
    }
}