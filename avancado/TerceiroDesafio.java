package com.digitalinnvoationone.everis10092021.avancado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TerceiroDesafio {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Tshirt> studentsList = new ArrayList<>();

        String mySize;
        String myColor;
        String myOwner="";
        boolean finish = false;

        int N = Integer.parseInt(reader.readLine());

        while (!finish){

            for(int i = 0; i < N; i++){


                myOwner = reader.readLine();
                String nextLine = reader.readLine();
                List<String> colorSize = new ArrayList<>(Arrays.asList(nextLine.split(" ")));
                myColor = colorSize.get(0);
                mySize = colorSize.get(1);

                studentsList.add(new Tshirt(mySize,myColor,myOwner));
            }

            if(Integer.parseInt(reader.readLine()) == 0)finish = true;
        }


        List<Tshirt> studentListImpressao = new ArrayList<>();
        studentListImpressao.addAll(studentsList);
        studentListImpressao.sort(new CompareShirt());
        studentListImpressao.forEach(s -> System.out.println(s.getColor() +" "+ s.getSize()+" "+ s.getOwner()));


    }

    static  class CompareShirt implements Comparator<Tshirt>{

        @Override
        public int compare(Tshirt t1, Tshirt t2) {

            int color = t1.getColor().compareToIgnoreCase(t2.getColor());
            if(color != 0) return color;

            int size = t2.getSize().compareToIgnoreCase(t1.getSize());
            if (size != 0) return size;


            return t1.getOwner().compareToIgnoreCase(t2.getOwner());
        }
    }

    static class Tshirt {

        private String size;
        private String color;
        private String owner;

        public Tshirt(String size, String color, String owner) {
            this.size = size;
            this.color = color;
            this.owner = owner;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        @Override
        public String toString() {
            return this.getColor() + " " + this.getSize() + " " + this.getOwner();
        }
    }
}
