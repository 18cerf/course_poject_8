package com.courseproject.course_poject_8.enumeration;

public enum GameState {
    WAITING_FOR_PLAYER("Ожидание игрока."),
    PLAYER1_TURN("Ход игрока 1"),
    PLAYER2_TURN("Ход игрока 2"),
    PLAYER1_WON("Игрок 1 выиграл."),
    PLAYER2_WON("Игрок 1 выиграл."),
    TIE("Ничья.");

    String description;

    GameState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
