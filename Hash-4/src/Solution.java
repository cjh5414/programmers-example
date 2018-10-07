import java.util.*;

/**
 * Created by jihun on 2018. 10. 7..
 */
public class Solution {
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Genre> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            Play play = new Play(i, plays[i]);
            if (map.containsKey(genres[i]))
                map.get(genres[i]).addPlay(play);
            else {
                Genre newGenre = new Genre();
                newGenre.addPlay(play);
                map.put(genres[i], newGenre);
            }
        }

        ArrayList<Genre> sortedGenres = sortGenres(map);
        for (Genre g : sortedGenres) {
            ArrayList<Play> ps = g.getPlays();
            ps.sort((Play p1, Play p2) -> p1.playedCount < p2.playedCount ? 1 : p1.playedCount == p2.playedCount ?
            p1.idx > p2.idx ? 1 : -1 : -1);

            result.add(ps.get(0).idx);
            if (ps.size() > 1)
                result.add(ps.get(1).idx);
        }

        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            ret[i] = result.get(i);

        return ret;
    }

    static ArrayList<Genre> sortGenres(HashMap<String, Genre> map) {
        ArrayList<Genre> list = new ArrayList<>(map.values());
        list.sort((Genre g1, Genre g2) -> g1.sum < g2.sum ? 1 : -1);
        return list;
    }

    static class Genre {
        int sum = 0;
        int count = 0;
        ArrayList<Play> plays = new ArrayList<>();

        void addPlay(Play play) {
            count++;
            sum += play.playedCount;
            plays.add(play);
        }

        ArrayList<Play> getPlays() {
            return this.plays;
        }
    }

    static class Play {
        int idx;
        int playedCount;

        Play(int idx, int playedCount) {
            this.idx = idx;
            this.playedCount = playedCount;
        }
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] result = solution(genres, plays);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
