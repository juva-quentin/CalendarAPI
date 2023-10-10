package com.example.calendarAPI.controller;

import com.example.calendarAPI.model.CalendarResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.Quentin.CalendarGenerator;

import java.util.List;

/**
 * Le contrôleur qui gère les requêtes liées à la génération de calendriers.
 * Il expose un point de terminaison HTTP pour générer des calendriers en utilisant la bibliothèque CalendarGenerator.
 */
@RestController
public class CalendarController {

    /**
     * API permettant de générer un calendrier Pour un mois avec une année et un mois donné.
     *
     * @param year  L'année pour laquelle générer le calendrier.
     * @param month Le mois pour lequel générer le calendrier (de 1 à 12).
     * @return      Une réponse HTTP contenant le calendrier généré au format JSON.
     */
    @GetMapping("/api/generateCalendar")
    public ResponseEntity<CalendarResponse> generateCalendar(
            @RequestParam int year,
            @RequestParam int month
    ) {
        // Générer le calendrier en utilisant la bibliothèque
        List<List<Integer>> calendarData = CalendarGenerator.generateCalendar(year, month);

        // Créer la réponse du calendrier
        CalendarResponse calendarResponse = new CalendarResponse();
        calendarResponse.setYear(year);
        calendarResponse.setMonth(month);
        calendarResponse.setCalendar(calendarData);

        // Retourner une réponse HTTP OK avec le calendrier généré
        return ResponseEntity.status(HttpStatus.OK).body(calendarResponse);
    }
}
