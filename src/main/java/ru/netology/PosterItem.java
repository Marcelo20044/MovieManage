package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public class PosterItem {
        private int movieId;
        private String movieName;
        private String movieGenre;
    }

