package pl.jareczeq.patterns.builder.checkers;

public final class FigureFactory {

    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(final String figureName, String color) {
        if (figureName.equals(PAWN)) {
            return new Pawn(color);
        } else if (figureName.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }

}
