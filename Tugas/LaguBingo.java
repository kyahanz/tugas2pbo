package Tugas;

public class LaguBingo {
    private String lyrics;

    public LaguBingo() {
        lyrics = "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "B-I-N-G-O\n" +
                "B-I-N-G-O\n" +
                "B-I-N-G-O\n" +
                "And Bingo was his name-o.\n" +
                "\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-I-N-G-O\n" +
                "(clap)-I-N-G-O\n" +
                "(clap)-I-N-G-O\n" +
                "And Bingo was his name-o.\n" +
                "\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-N-G-O\n" +
                "(clap)-(clap)-N-G-O\n" +
                "(clap)-(clap)-N-G-O\n" +
                "And Bingo was his name-o.\n" +
                "\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "(clap)-(clap)-(clap)-G-O\n" +
                "And Bingo was his name-o.\n" +
                "\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "(clap)-(clap)-(clap)-(clap)-O\n" +
                "And Bingo was his name-o.\n" +
                "\n" +
                "There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "(clap)-(clap)-(clap)-(clap)-(clap)\n" +
                "And Bingo was his name-o.";
    }

    public String getLyrics() {
        return lyrics;
    }

    public static void main(String[] args) {
        LaguBingo bingo = new LaguBingo();
        System.out.println(bingo.getLyrics());
    }
}

