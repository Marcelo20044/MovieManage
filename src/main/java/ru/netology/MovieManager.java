package ru.netology;

public class MovieManager {
    public PosterItem[] items = new PosterItem[0];

    public void save (PosterItem item) {

        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] getAll(){
        PosterItem[] result = new PosterItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
