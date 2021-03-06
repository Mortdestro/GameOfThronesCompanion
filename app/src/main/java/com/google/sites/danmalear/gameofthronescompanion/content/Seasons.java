package com.google.sites.danmalear.gameofthronescompanion.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DanM on 1/26/2016.
 */
public class Seasons {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Season> ITEMS = new ArrayList<Season>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Season> ITEM_MAP = new HashMap<String, Season>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createSeason(i));
        }
    }

    private static void addItem(Season item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Season createSeason(int position) {
        return new Season(String.valueOf(position), "Season " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Season {
        public final String id;
        public final String content;
        public final String details;

        public Season(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
