/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        //Constantes
        final int MAX_PISO = 10;
        final int MIN_PISO = 0;
        final int PERSONAS = 4;

        //Variable 
        int planta = 0;

        for (int persona = 0; persona < PERSONAS; persona++) {
            
            boolean plantaSi;

            do {
                boolean control = true;

                do {
                    try {
                        System.out.printf("Persona %d Planta destino ...: ",
                                persona + 1);
                        planta = SCN.nextInt();

                        control = false;

                    } catch (Exception e) {
                        System.out.println("Error");

                    } finally {
                        SCN.nextLine();
                    }
                } while (control);

                 plantaSi = planta > MIN_PISO && planta <= MAX_PISO;

                if (!plantaSi) {
                    System.out.println("Numero de piso no valido");

                }
            } while (!plantaSi);

                System.out.printf("Persona %d ....: %d%n", persona + 1, planta);
            }

        }
    }
