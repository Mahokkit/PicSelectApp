package com.example.edward.picselectapp.dummy;

import com.example.edward.picselectapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {


    static String[] list =
            {
                    "Australia",
                    "Brazil",
                    "China",
                    "France",
                    "Germany",
                    "India",
                    "Ireland",
                    "Italy",
                    "Mexico",
                    "Poland",
                    "Russia",
                    "Spain",
                    "US"
            };
    static Integer[] imageID =
            {
                    R.drawable.flag_australia,
                    R.drawable.flag_brazil,
                    R.drawable.flag_china,
                    R.drawable.flag_france,
                    R.drawable.flag_germany,
                    R.drawable.flag_india,
                    R.drawable.flag_ireland,
                    R.drawable.flag_italy,
                    R.drawable.flag_mexico,
                    R.drawable.flag_poland,
                    R.drawable.flag_russia,
                    R.drawable.flag_spain,
                    R.drawable.flag_us
            };

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 13;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position-1), "Flag of "+list[position-1], makeDetails(position));
    }

    private static Integer makeDetails(int position) {

        return imageID[position-1];
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final Integer details;

        public DummyItem(String id, String content, Integer details) {
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
